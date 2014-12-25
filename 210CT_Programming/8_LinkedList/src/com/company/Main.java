package com.company;

public class Main {

    public static void main(String[] args) {
        List obj1 = new List();


        obj1.Insert(null, new Node(42));
        obj1.Insert(obj1.head, new Node(32));
        obj1.Insert(obj1.head.next, new Node(102));

        //-------------------------------------------------------------
        //----------------------Test Inserting Tail--------------------
        //-------------------------------------------------------------
        obj1.display();
        System.out.println();

        // -----------------------------------------------------
        //-------------------------Test Insert Between-----------------
        //-------------------------------------------------------
        //Insert 12 between the head node and the head.next
        obj1.Insert(obj1.head, new Node(12));
        obj1.display();
        System.out.println();

        //----------------------------------------------------------------
        //--------------------------Test Prepend--------------------------
        //---------------------------------------------------------------
        //Insert 13 at start of pre-existing list
           obj1.Insert(null,new Node(13));
           obj1.display();
          System.out.println();

        //-------------------------------------------------------------
        //----------------------Test Delete Head----------------------------
        //-------------------------------------------------------------
        //Delete 42 from list an display
        obj1.Delete(new Node(13));
        obj1.display();
        System.out.println();

        //-------------------------------------------------------------
        //----------------------Test Delete Norm----------------------------
        //-------------------------------------------------------------
        //Delete 42 from list an display
        obj1.Delete(new Node(32));
        obj1.display();
        System.out.println();

        //-------------------------------------------------------------
        //----------------------Test Delete Tail----------------------------
        //-------------------------------------------------------------
        //Delete 42 from list an display
        obj1.Delete(new Node(102));
        obj1.display();
        System.out.println();


    }}