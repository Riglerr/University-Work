[BITS 16]
[ORG 0X7C00]
top:
  mov ax,0x0000
  mov ds,ax
  mov si,Star
  jmp $

  mov bx,10
  mov cx,10

lo:
    push cx
    mov cx,bx
      li:
          mov ah,0x0E
          mov bh,0x00
          mov bl,0x07
          int 0x10
      loop li

    mov ah,0x0E
    mov bh, 0x00
    mov bl,0x07
    mov al,nl
  int 0x10

  inc bx
  pop cx

  loop lo

Star db '*'
nl db ' ',13,10,0
times 510-($-$$) db 0
dw 0xAA55
