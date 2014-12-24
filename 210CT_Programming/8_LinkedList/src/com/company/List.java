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
    public List(){

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

        //If previous node exists
        if(n != null){
            //sWAP NODE POINTERS
            x.next = n.next;
            n.next = x;
            x.prev =n;

            // If new node isn't end of list
            if(x.next != null)
                x.next.prev =x;
        }

        // If new list (First item to be placed)
        if(n == null & head == null)
        {
            head = tail =x;  //make new node equal to both head and tail
            x.prev =x.next = null; // make head pointers null
        }
        else if(tail == n)
            tail =x;

        //Prepend to existing list
       if (head != null & n == null) {
          n = head;
           n.prev = x;
           x.next = n;
           x.prev = null;
           head = x;


        }
    }

    public void display(){
        Node i = head;

        while(i != null) {
            System.out.print(i.value + ", ");
            i = i.next;
        }
    }
}


