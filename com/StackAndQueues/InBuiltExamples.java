package com.StackAndQueues;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack);

//        stack.pop();//5
//        stack.pop();//4
//        stack.pop();//3
//        stack.pop();//2
//        stack.pop();//1
//        System.out.println(stack.search(5)); // it's searching reversely

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.peek());
        queue.remove();// it will remove 1


        // deque
        // in this we can add and remove from front and last
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
    }
}
