package com.abhay.javabasics.LinkedListMain;

public class Main {
    public static void main(String[] args) {
        Basics_08_LinkedList list = new Basics_08_LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();
        list.insertLast(40);
        list.insertLast(45);
        list.insertLast(60);
        list.insertLast(85);
        list.display();
        list.insert(34, 2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
    }
}
