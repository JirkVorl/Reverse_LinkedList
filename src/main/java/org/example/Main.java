package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.print();
        list.reverse();
        list.print();
    }
}