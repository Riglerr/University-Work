[BITS 16]
[ORG 0X7C00]
top:
  
jmp top
times 510-($-$$) db 0
dw 0xAA55
