package com.uni;
/**
 * Created by Rob on 05/01/2015.
 */
public class MyStack {

    /**
     * This Class represents a stack. An Object of this type will be able to Push()
     * and Pop() values and display the current contents of the stack
     */

    //Array variable that holds the values placed in the stack.
    int[] _list ;

    //Holds the position of the front of the stack.
    int front;

    //Constructor that initialises the stack size to 10
    //And the front of the list to -1.
    // -1 Because Push increments front pointer so first push becomes location 0.
    public MyStack(){

        _list = new int[10];
        int front = -1;
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
            front++;
            _list[front] = val;
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

        try {
            front--;
            return _list[front +1];
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
        for (int i = front; i >0; i--){
            System.out.println(_list[i]);
        }
        System.out.println();
    }
}