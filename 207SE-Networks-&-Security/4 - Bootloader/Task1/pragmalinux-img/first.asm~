[BITS 16]
[ORG 0X7C00]
top:
    mov ax,0x0000
    mov ds,ax
    mov si,HelloWorld
    call writeString
    jmp $

writeString:
    mov ah,0x0E ;Display Character
    mov bh,0x00
    mov bl,0x07

nextchar:
  lodsb
  cmp al,0
  jz done
  int 0x10
  jmp nextchar

done:
  ret
  HelloWorld db 'Robert Rigler',13,10,0
  times 510-($-$$) db 0

dw 0xAA55
