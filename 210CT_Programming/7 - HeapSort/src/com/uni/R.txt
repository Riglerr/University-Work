package com.uni;

/**
 * Created by rob on 10/01/15.
 */
public class RPN {

    public static void evalRPN() {

        //Creating the various objects and variable needed for the evaluation/
        InputString Is = new InputString();
        MyStack MS = new MyStack();
        String[] In_arr;
        String Operators = "+-/*";

        //Gets the Users Input.
        //Method only continues if the string is successfully set.
        //And if it only contains valid characters.

        if (Is.setIn_String(Is.getIn_String())) {
            if (Is.checkIn_String()) {

                //Splits the input string into an array.
                In_arr = Is.Split_String();

                //for Each element in the string array,
                //Check if that element is an operator.
                //if Operator: Pop values, do operation and push answer.

                for (String t : In_arr) {
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
                        //Else the element must be pushed to stack.
                        //String Must be converted to Integer before pushing to stack.
                    } else MS.Push(Integer.parseInt(t));
                }

            } else System.out.println("String not correct");

        } else System.out.println("String not set");

        //When checked every element in array.
        //Last Push should be the final Answer.
        System.out.println(MS.Pop());

    }
}
