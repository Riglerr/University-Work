package com.uni;

import com.uni.InputString;

public class Main {

    public static void main(String[] args) {
        evalRPN();

    }

   public static void evalRPN() {

       InputString Is = new InputString();
       MyStack MS = new MyStack();
       String[] Tokens;
       String Operators = "+-/*";



           if (Is.setIn_String(Is.getIn_String())) {
               if (Is.checkIn_String()) {

                   Tokens = Is.Split_String();

                   for (String t : Tokens) {
                       if (Operators.contains(t)) {
                           int a = MS.Pop();
                           int b = MS.Pop();

                           switch (t.charAt(0)) {

                               case '+':
                                   MS.Push(MathOps.add(a, b));
                                   break;
                               case '-':
                                   MS.Push(MathOps.sub(b, a));
                                   break;
                               case '*':
                                   MS.Push(MathOps.mul(a, b));
                                   break;
                               case '/':
                                   MS.Push(MathOps.div(b, a));
                                   break;


                           }

                       } else MS.Push(Integer.parseInt(t));
                   }

               } else System.out.println("String not correct");

           } else System.out.println("String not set");

           System.out.println(MS.Pop());

   }
}
