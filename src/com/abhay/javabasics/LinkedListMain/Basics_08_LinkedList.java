package com.abhay.javabasics.LinkedListMain;

public class Basics_08_LinkedList {
    public Node head;
    public Node tail;
    public int size;
    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
        }
        if(index == size-1) {
            insertLast(val);
        }
        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
    }

    public void insertLast(int val) {
        if(head == null) {
            insertFirst(val);
        }
//        //Without tail
//        Node newNode = new Node(val);
//        Node temp = head;
//        while(temp != null) {
//            if(temp.next == null) {
//                temp.next = newNode;
//                temp = newNode;
//            }
//            temp = temp.next;
//        }
        //With tail
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        head.next = head.next.next;
    }

    public void deleteLast() {
        if(tail == null) {
            tail = head;
            return;
        }
        tail = get(size-2);
        tail.next = null;
    }

    public void delete(int index) {
        Node temp = get(index);
        temp.next = temp.next.next;
    }

    public Node get(int index) {
        Node targetNode  = head;
        for(int i=1; i < index; i++) {
            targetNode = targetNode.next;
        }
        return targetNode;
    }

    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
