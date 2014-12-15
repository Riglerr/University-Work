[BITS 16]
[ORG 0x7c00]
top:
jmp top
  mov ah,0x0E
  mov bh,0x00
  mov bl,0x07
  mov al,65
  int 0x10
jmp $
times 510-($-$$) db 0
dw 0xAA55
