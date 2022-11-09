package org.example;

public class LinkedList {
    private Node head;

    private class Node {
        int data;
        private Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

   public Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public void print() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
