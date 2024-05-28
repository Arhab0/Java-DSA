package com.BinaryTrees.Into_1;
import java.util.*;
public class BinaryTree
{
    private Node root;

    public void populate(Scanner sc)
    {
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    public void populate(Scanner sc , Node node)
    {
        System.out.println("Do you want to enter the left of: " + node.val);
        boolean left = sc.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value of the left of " + node.val);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }

        System.out.println("Do you want to enter the right of: " + node.val);
        boolean right = sc.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value of the right of " + node.val);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    public void display()
    {
//        display(root,"");
        displayInFormat(root,0);
    }

    public void displayInFormat(Node node , int level)
    {
        if(node == null)
        {
            return;
        }
        displayInFormat(node.right,level+1);
        if(level != 0)
        {
            for(int i = 0 ;i<level-1;i++)
            {
                System.out.println("|\t\t");
            }
            System.out.println("|--------"+node.val);
        }else{
            System.out.println(node.val);
        }

        displayInFormat(node.left,level+1);
    }
    public void display(Node root, String indent)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(indent + root.val);
        display(root.left,indent + '\t');
        display(root.right,indent + '\t');
    }
    private class Node
    {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }
    }
}
