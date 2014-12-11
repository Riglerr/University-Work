section .data

Promt db 'Enter height of triangle: '
pLen equ $-Promt
chr db '*'
nl:     db "   ", 0x0a ; varab;e to draw a new line
nl_len  equ $-nl ; length of new line varable
ns: db " "
ns_l equ $-ns


section .bss
num resb 2 ;reserve 2 bytes for the input variable
width resb 2

section .text
global _start
_start:

;Ask user for size of triangle
mov eax,4
mov ebx,1
mov ecx,Promt
mov edx,pLen
int 80h

;store the variable
mov eax,3
mov ebx,0
mov ecx,num
mov edx,2
int 80h

mov ecx, [num] ;derefference input and store in ecx
sub ecx,'0' ;convert from ascii to decimal
xor ch,ch ; clear upper half of ecx

mov ebx,1
mov eax,ecx

    ;this block places w=2n-1 into eax
    push ebx ;push inner loop to stack
    mov ebx,2 ; move 2 into ebx
    mul ebx ; multiply eax by 2
    sub eax,1 ; subtract 1 from eax
    pop ebx
    mov [width],eax ; place width value into width variable
    
   
    

lo: ;outer loop, amount of lines in triangle

    
    push ecx ; push outer loop count to stack
    
    ;This block works out the number of spaces to print before drawing 
    ;noOfSpace = (width-noOfAsterisks)/2
    mov ecx,[width] ; make loop counter equal to the width of the triangle
    sub ecx,ebx ;subtract number of asterisks
    shr ecx,1 ; shift right, divides ecx by 2^1 (2)
   jz l2 ; jump to  the l2 label if the result of the division was 0
    
    l3:
    push ebx ; push ebx to stack, so to use ebx in starting a new line
    push ecx
    mov eax, 4
    mov ebx, 1
    mov ecx, ns
    mov edx, ns_l
    int 0x80 ;draws a new line
    pop ecx ;pop inner loop count off stack
    pop ebx
    
    loop l3
    
    l2: 
    
    mov ecx,ebx ; place inner loop count in the loop counter
        li: ; inner loop, amount of stars in line
            
            push ecx 
            push ebx ;push ecx and ebx to stack so they can be used in drawing
            mov eax,4 
            mov ebx,1
            mov ecx,chr
            mov edx,1
            int 80h ;draw star
            pop ebx
            pop ecx ; pop ecx last, so it is has the correct loop counter value
        loop li ; end of inner loop
            
    push ebx ; push ebx to stack, so to use ebx in starting a new line
    mov eax, 4
    mov ebx, 1
    mov ecx, nl
    mov edx, nl_len
    int 0x80 ;draws a new line
    
    pop ebx ;pop inner loop count off stack
    add ebx,2 ;add two to the inner loop counter,each line always has an odd number of asterisks
    
    pop ecx ;pop outler loop count off stack to use as counter for lo
loop lo ;end of outer loop
    int 80h; 
    
mov eax,1
mov ebx,0
int 80h;exit