section .data
name db 'Zara Ali '

section .text
    global _start
        _start:
            mov edx,9
            mov ecx,name
            mov ebx,1
            mov eax,4
            int 80h
            
            mov [name], dword 'ba'
            mov edx,8
            mov ecx,name
            mov ebx,1
            mov eax,4
            int 80h
            mov eax,1
            mov ebx,0
            int 80h
            