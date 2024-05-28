package com.LinkedList.Circular;

import com.LinkedList.Doubly.DLL;

public class CLL
{
    private Node head;
    private Node tail;

    public CLL()
    {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val)
    {
        Node node = new Node(val);

        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = node;
        tail = node;
    }


    private class Node
    {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
