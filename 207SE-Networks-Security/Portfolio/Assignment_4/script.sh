#!/bin/bash

 # DISPLAYS A MENU

while true;
do 
echo "1. Display information about the CPU. "
echo "2. Display the interrupts system. "
echo "3. Display a process PID for a process on the system and its status. "
echo "4. exit. "

read input_variable
#STORES THE INPUT INTO A VARAIBLE CALLED "input_variable"

echo "Your choice was $input_variable"

#CASE STATEMENT TO DIFFERENTIATE OUTPUT RESPECTIVE TO THE USER'S CHOICE.

case "$input_variable" in 

1) 	#Display CPU info
	echo Displaying CPU information
	grep model /proc/cpuinf
	;;
2)	#Display the interrupts info
	echo Displaying interrupts
	cat /proc/interrupts 
	;;
3)	#Display the PID and its status.
	echo Enter PID
	read input2
	ps -p "$input2"
	;;
4)	#stop the script
	break
	;;
#END CASE STATEMENT
esac
#END OF WHILE LOOP
done

echo "Exiting"
