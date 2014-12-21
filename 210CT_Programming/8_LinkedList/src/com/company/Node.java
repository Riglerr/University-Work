package com.company;

/**
 * Created by rob on 20/12/14.
 */

public class Node {
    int value;
    Node prev;
    Node next;

    public Node(int val, Node prv, Node nxt){

            //Node Constructor
        value = val;
        prev =prv;
        next = nxt;
    }


}
