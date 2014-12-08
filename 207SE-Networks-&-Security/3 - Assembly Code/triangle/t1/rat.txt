section .data

Promt db 'Enter height of triangle: '
pLen equ $-Promt
chr db '*'
nl:     db "   ", 0x0a ; varab;e to draw a new line
nl_len  equ $-nl ; length of new line varable


section .bss

section .text
global _start
_start:

;mov eax,0
mov ebx,1
mov ecx,10 ; 10 iterations for outer


lo: ;outer loop, amount of lines in triangle
    push ecx ; push outer loop count to stack
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
    inc ebx ;increment inner loop count (to draw 1 more triangle next iteration)
    pop ecx ;pop outler loop count off stack to use as counter for lo
loop lo ;end of outer loop
    int 80h; 
    
mov eax,1
mov ebx,0
int 80h;exit