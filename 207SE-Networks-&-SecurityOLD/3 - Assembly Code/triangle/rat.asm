section .data
Promt db 'Enter height of triangle: '
pLen equ $-Promt
chr db '*'
nl:     db "   ", 0x0a
nl_len  equ $-nl
num dw 1

section .bss

section .text
global _start
_start:

;mov eax,0
mov ebx,1
mov ecx,10 ; 10 iterations for outer


lo: ;outer loop, amount of lines in triangle
    push ecx ; push to stack
    mov ecx,ebx ; place inner loop count
        li: ; inner loop, amount of stars in line
            
            push ecx 
            push ebx
            mov eax,4 
            mov ebx,1
            mov ecx,chr
            mov edx,1
            int 80h ;draw star
            pop ebx
            pop ecx
        loop li
            
    push ebx
    mov eax, 4
    mov ebx, 1
    mov ecx, nl
    mov edx, nl_len
    int 0x80
    pop ebx
    inc ebx
    pop ecx 
loop lo
    int 80h; + 1 to innerloop, pop outer loop off stack
    
mov eax,1
mov ebx,0; exit
int 80h