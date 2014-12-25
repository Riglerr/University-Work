package com.company;


/**
 * Created by rob on 20/12/14.
 */
public class List {
      //Nodes to hold the head and tail of the list respectively
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
    //------------Insert an Element at an offset from head node------
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
        //Prepend to existing list
        if (head != null & n == null) {
            n = head;
            n.prev = x;
            x.next = n;
            x.prev = null;
            head = x;
        }
        // If new list (First item to be placed)
       else  if(n == null & head == null)
        {
            head = tail =x;  //make new node equal to both head and tail
            x.prev =x.next = null; // make head pointers null
        } //If all else exp
        else if(tail == n)
            tail =x;
    }

    //---------------------------------------------------------------
    //---------------------DELETE A NODE FROM THE LIST---------------
    //---------------------------------------------------------------
    public void Delete(Node n){
        //create temporary node
        Node i = head;

        while (i != null){ // Loop until null (tail.next)

            if (i.value == n.value){

                if(i == head){ //If node to remove is head node
                    head = i.next;
                    i.prev = null;
                    break;
                }
                else if (i == tail){ //if node to remove is tail node
                    tail = i.prev;
                    i.prev.next = null;
                }
                else { // If node to remove is not Head/Tail
                i.prev.next = i.next;
                i.next.prev = i.prev;
                break;}
            }
            i=i.next; // Increment
        }
    }

    //---------------------------------------------------------------
    //--------------------DISPLAY ALL NODES IN LIST------------------
    //---------------------------------------------------------------
    public void display(){
        Node i = head;

        while(i != null) {
            System.out.print(i.value + ", ");
            i = i.next;
        }
    }
}


