section .data
    userMsg db 'Enter Number: '
    uMsgLen equ $ - userMsg
    dispMsg db 'You entered: '
    dMsgLen equ $-dispMsg
    
section .bss
    num resb 5

section .text
global _start
_start:
;User Prompt
mov eax,4
mov ebx,1
mov ecx,userMsg
mov edx,uMsgLen
int 0x80

;Read and store input
mov eax,3
mov ebx,2
mov ecx,num
mov edx,5
int 80h

;Output the message 'Number entered: '
mov eax,4
mov ebx,1
mov ecx,dispMsg
mov edx,dMsgLen
int 80h

;Display input

mov edx,5
mov ecx,num
mov ebx,1
mov eax,4
int 80h

;exit

mov eax,1
mov ebx,0

int 0x80



