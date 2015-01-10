package com.uni;
/**
 * Created by Rob on 05/01/2015.
 */
public class MyStack {

    /**
     * This Class represents a stack. An Object of this type will be able to Push()
     * and Pop() values and display the current contents of the stack
     */

    int[] _list ;
    int front;


    public MyStack(){

        _list = new int[10];
        int front = 0;
    }


    public int Push(int val){

        /**
         *Push() methods adds an item to the front of the list.
         *Front of the list is the item at the corresponding location of the the front variable.
         *_list[front] is always the first element in the list.
         *front is incremented each time the Push() method is called as a Stack is a LIFO structure.

         */

        //Increment the front pointer, and store the value in the list.
        try {

            _list[front++] = val;
        }
        //If failure, return error message and 0 to caller
        catch (Exception e){
            System.out.println("Push Method exception: " + e);
            return 0;
        }
        //returns 1 if successful.
        return 1;
    }

    public int Pop(){

        /**
         * Pop() Method removes the item at the font of the list and returns it to the caller
         * Front is the location of the item in respect to the list ( _list[front] )
         * When the front item is remove, the front location decrements.
         * The Method returns 0 if it could not Pop the value.
         */
        int t;
        try {
            t = _list[--front];
            _list[front] = 0;
            return t;
        }
        catch (Exception e){
            System.out.println("Pop Method exception; " + e);
            return  0;
        }

    }

    public void Display(){

        /**
         * Display Method prints the contents of the stack in order from front to back.
         */
        for (int i = front-1; i >=0; i--){
            System.out.println(_list[i]);
        }
        System.out.println();
    }
}