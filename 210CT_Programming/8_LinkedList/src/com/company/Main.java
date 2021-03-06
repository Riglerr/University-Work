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
        System.out.println("Insert 3 items:");
        obj1.display();
        System.out.println();

        // -----------------------------------------------------
        //-------------------------Test Insert Between-----------------
        //-------------------------------------------------------
        //Insert 12 between the head node and the head.next
        System.out.println("Insert 12 after head node: ");
        obj1.Insert(obj1.head, new Node(12));
        obj1.display();
        System.out.println();

        //----------------------------------------------------------------
        //--------------------------Test Prepend--------------------------
        //---------------------------------------------------------------
        //Insert 13 at start of pre-existing list
        System.out.println("Prepend 13: ");
           obj1.Insert(null,new Node(13));
           obj1.display();
          System.out.println();

        //-------------------------------------------------------------
        //----------------------Test Delete Head----------------------------
        //-------------------------------------------------------------
        //Delete the head node '13' from the list
        System.out.println("Delete Head: ");
        obj1.Delete(new Node(13));
        obj1.display();
        System.out.println();

        //-------------------------------------------------------------
        //----------------------Test Delete Norm----------------------------
        //-------------------------------------------------------------
        //Delete a middle node (32) from list an display
        System.out.println("Delete a Middle Node (32)");
        obj1.Delete(new Node(32));
        obj1.display();
        System.out.println();

        //-------------------------------------------------------------
        //----------------------Test Delete Tail----------------------------
        //-------------------------------------------------------------
        //Delete the tail node '42' from list an display
        System.out.println("Delete tail: ");
        obj1.Delete(new Node(102));
        obj1.display();
        System.out.println();


    }}