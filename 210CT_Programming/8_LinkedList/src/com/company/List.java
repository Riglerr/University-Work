package com.company;

/**
 * Created by rob on 20/12/14.
 */
public class List {

    Node head;
    Node tail;

    //---------------------------------------------------------------
    //-----------List Constructor to nit values to null-------------
    //---------------------------------------------------------------
    private List(){

        head = null;
        tail = null;


    }
    //---------------------------------------------------------------
    //--------------Add an Element at the end of a list--------------
    //---------------------------------------------------------------
    public void Add(Node n){

    }

    //---------------------------------------------------------------
    //--------------Insert an Element at a specific location--------------
    //---------------------------------------------------------------

    public void Insert(Node n, Node x){

        //Prepend to existing list
        if(n == head){


        }
        //If previous node exists
        if(n != null){
            x.next = n.next;
            n.next = x;
            x.prev =n;

            // If new node isn't end of list
            if(x.next != null)
            x.next.prev =x;
        }
        // If new list (First item to be placed)
        if(head == null)
        {
            head =tail =x;
            x.prev =x.next = null;
        }
        // If n is the tail node
       else if(tail == n)
            tail =x;

    }
}


