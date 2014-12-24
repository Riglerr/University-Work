package com.company;

public class Main {

    public static void main(String[] args) {
        List obj1 = new List();


        obj1.Insert(null, new Node(42));
        obj1.Insert(obj1.head, new Node(32));
        obj1.Insert(obj1.head.next, new Node(102));

        //Test for inserting after tail node
        obj1.display();
        System.out.println();

        // Test for inserting node between two existing nodes
        obj1.Insert(obj1.head, new Node(12));
        obj1.display();
        System.out.println();

        //Test for prepending the list
           obj1.Insert(null,new Node(13));
        obj1.display();
          System.out.println();
        //NADAWORKADA
    }}