package com.uni;

import com.uni.InputString;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * Testing for MyStack POP(), PUSH() & DISPLAY()
         *
         */
            MyStack _So = new MyStack();
        InputString _Io = new InputString();

        _So.Push(50);
        _So.Display();

        _So.Push(13);
        _So.Display();
        _So.Pop();
        _So.Push(70);
        _So.Display();

        /**
         *  INPUTSTRING CLASS TESTS FOR
         *  GET_INSTRING
         *  SETIN_STRING
         *  CHECKIN_STRING
          */


        _Io.setIn_String(_Io.getIn_String());
        System.out.println(_Io.in_String);

        if(_Io.checkIn_String() == true){
            System.out.println("Success");
        }
        else System.out.println("Failure");





    }
}
