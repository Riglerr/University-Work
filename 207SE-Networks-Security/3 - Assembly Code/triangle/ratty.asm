section .text
global _start
_start:
MOV BX,10           ; HOLD 10 IN BX FOR INNER LOOP
     MOV AX,0           ; START ITERATIONS FROM 0
     MOV CX,10          ; MAX NUMBER OF ITERATIONS

    L2:

        PUSH CX         ;PUSH CX IN A STACK
        MOV CX,BX       ;STORE NEW VALUE IN CX FOR INNER LOOP ITERATION

            L1:

                MOV DX, [SI]               ; MOVE THE STRING INTO DX
                MOV AH,02H                 ; DISPLAY EVERYTHING FROM DX
                INT 21H

            LOOP L1

        MOV DX,0AH     ;PRINT LINE FEED AFTER PRINTING EACH LINE OF ASTERIKS
        MOV AH,02H
        INT 21H

        SUB BX,01     ;DECREASE THE VALUE OF BX BY 1

        POP CX        ;RESTORE ORIGINAL VALUE OF CX FOR OUTER LOOP
        ADD AX,01     ;INCREMENT VALUE OF AX BY 1

    LOOP L2


     MOV AH, 4CH                  ;RETURN CONTROL TO DOS
     INT 21H