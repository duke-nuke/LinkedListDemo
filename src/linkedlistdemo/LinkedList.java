/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

/**
 *
 * @author Khurram.Shahzad
 */
public class LinkedList {

    private Node head = null;

    public LinkedList(int data) {

        Node n = new Node(data);
        this.head = n;
    }

    /**
     * add an element to the tail
     *
     * @param data
     */
    public void append(int data) {

        Node end = new Node(data);
        if (head == null) {
            head = end;
        } else {

            Node temp = head;

            while (temp.nextElement != null) {
                temp = temp.nextElement;
            }

            //append 
            temp.nextElement = end;
        }
    }

    /**
     * remove an element from the tail
     */
    public void remove() {

        Node temp = head;
        //list is empty
        if (temp == null) {
            return;
        }
        //exctly has one element
        if (temp.nextElement == null) {

            head = null;
            return;
        }

        Node secondLast = head;

        while (temp.nextElement != null) {
            secondLast = temp;
            temp = temp.nextElement;

        }
        //delete tail
        secondLast.nextElement = null;

    }

    /*
    remove all elements from the list that are greater than
    target value
    */
    public void removeGreaterThan(int targetValue) {

        Node temp = head;
        //empty list
        if (temp == null) {
            return;
        }

        //exactly one element;
        if (temp.nextElement == null) {
            if (temp.data > targetValue) {
                head = null;
            }

            return;
        }

        Node previousElement = null;
        while (temp != null) {

            if (temp.data > targetValue) {
                
                previousElement.nextElement = temp.nextElement;
                temp = temp.nextElement;
                
            } else {
                previousElement = temp;
                temp = temp.nextElement;
            }

        }
    }

    public void print() {

        Node temp = head;

        if (temp == null) {
            System.out.println("Empty List");
            return;
        }
        //exactly one element
        if (temp.nextElement == null) {
            System.out.println(" " + temp.data);
            return;
        }

        while (temp.nextElement != null) {
            System.out.print(" " + temp.data + ",");
            temp = temp.nextElement;
        }
        System.out.print(" " + temp.data + ",");
    }

    class Node {

        Node nextElement = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
