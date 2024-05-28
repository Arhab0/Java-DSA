package com.LinkedList.Singly;

import com.LinkedList.Doubly.DLL;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) {

        // singly linkedList
//        LL list = new LL();
//
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(8);
//        list.insertFirst(14);
//
//        list.insertLast(17);
//        list.insert(100,3);
//        list.deleteFirst();
//        list.deleteLast();
//        list.delete(3);
//
//        System.out.println(list.findNode(4));
//         list.display();


        // doubly LinkedList
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(14);
        list.insertLast(45);
        list.display();



    }
}
