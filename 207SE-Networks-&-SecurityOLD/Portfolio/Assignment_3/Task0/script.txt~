#!/bin/bash

echo "Enter name of asm file: "

read asm_name

#echo "Compiling file."

asm_ext="$asm_name"".asm"

nasm $asm_ext

echo "Writing file to disk image."
dd if=$asm_name bs=512 of=a.img

bochs
