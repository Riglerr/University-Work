package com.uni;

import com.uni.InputString;

public class Main {

    public static void main(String[] args) {

	// write your code here
        /**
         * Testing for MyStack POP(), PUSH() & DISPLAY()
         *
         */
        /*
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

/*
        _Io.setIn_String(_Io.getIn_String());
        System.out.println(_Io.in_String);

        if(_Io.checkIn_String() == true){
            System.out.println("Success");
        }
        else System.out.println("Failure");



*/

       // InputString Is = new InputString();
      //  MyStack Ms = new MyStack();

      //  Is.setIn_String(Is.getIn_String());
//String Temp = Is.Split_String(0);


       // Ms.Push(Is.c_To_Int(Temp));
     // Ms.Display();

        calc();
    }

   public static void calc(){

       int temp_pop;
        int p =0;
       int temp_int =0;
        String Temp_Split;
        InputString Is = new InputString();
        MyStack Ms = new MyStack();


        do {
            // Get & Set
           if( Is.setIn_String(Is.getIn_String()) == true){
               //check string valid
               if(Is.checkIn_String() == true){

                   while (p < Is.in_String.length()) {
                       //split & parse
                       Temp_Split = Is.Split_String(p);
                       p += Temp_Split.length() + 1;
                       //FInd Operator
                       if (Temp_Split.contains("+") || Temp_Split.contains("-") ||
                               Temp_Split.contains("/") | Temp_Split.contains("*")) {
                           if (Temp_Split.equals("+")){ temp_int = MathOps.add(Ms.Pop(), Ms.Pop());}
                           if (Temp_Split.equals("*")) temp_int = MathOps.mul(Ms.Pop(), Ms.Pop());
                           if (Temp_Split.equals("-")) {

                              temp_pop = Ms.Pop();
                               temp_int = MathOps.sub(Ms.Pop(),temp_pop);
                           }

                           if (Temp_Split.equals("/")) {
                               temp_pop = Ms.Pop();
                               temp_int = MathOps.div(Ms.Pop(),temp_pop);
                           }

                           Ms.Push(temp_int);

                       } else {
                           Ms.Push(Is.c_To_Int(Temp_Split));
                       }

                   }

               }
               else System.out.println("String not Valid");

           }
            else System.out.println("String is empty or not set.");


        }while(p < Is.in_String.length());

       System.out.println(Ms.Pop());

    }

}
