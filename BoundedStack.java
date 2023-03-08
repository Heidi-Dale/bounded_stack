import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author Heidi
 */
public class BoundedStack {

    //make instance variables: first, to hold first node and numElements to act as the tracker for number of elements
    private int numElements;
    private Node first;
    private static final int INITIALCAPACITY = 10;
    private int capacity; //made for bounded stack -> only allowed so many things in it

    public BoundedStack() {
        this.numElements = 0;
        first = null;
        capacity = INITIALCAPACITY;
    }

    //boundedstack constructor
    public BoundedStack (int cap) {
        this.numElements = 0;
        first = null;
        capacity = cap;
    }

    private static class Node {

        //the node class should hold fields for the next node and for the data (to be inserted)
        private String data;
        private Node next;

        //constructor (in here, pass the data to the node to be wrapped and set next node to null
        private Node(String data) {
            next = null;
            this.data = data;
        }

        //create a method for hasNext, returning whether or not next == null
        private boolean hasNext() {

            if (next == null) {
                return false;
            }
            return true;
        }
    } //end of inner Node class


    //1. Size
    public int size () {

        return this.numElements;
    }

    //2. Empty
    public boolean isEmpty () {
        if (numElements == 0) {
            return true;
        }
        return false;
    }


    //3. peek
    public String peek () {

        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return first.data;
    }

    //4. push
    public void push (String s) {

        if (isFull()) {
            new StackFullException("Nu uh bruh, there's no more room up in here.");
        }
        //create new node of data to be added
        Node n1 = new Node (s);

        //add this node to the start
        n1.next = first;
        first = n1;
        numElements++;
    }

    // pop
    public String pop () { //pop removes from pos 0

        String temp = "";

        if (this.isEmpty())
        {
            throw new EmptyStackException ();
        }
        temp = this.first.data;
        //set first = to the next el
        first = first.next; //skips over
        numElements--;

        return temp;
    }


    //bounded stack method
    public boolean isFull () {
        return numElements >= capacity;
    }

}


