package com.StackAndQueues;

public class CustomQueue {
    protected int[] data;
    private static final int  DEFAULT_SIZE = 10;
    int end = 0;


    public boolean isFull()
    {
        return end == data.length;
    }
    public boolean isEmpty()
    {
        return end == 0;
    }

    public boolean add(int value)
    {
        if(isFull())
        {
            System.out.println("Can't add the value the queue is full");
            return false;
        }

        data[end] = value;
        end++;
        return true;
    }

    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Can't remove from the queue. The queue is empty");
            return -1;
        }
        int remove = data[0];

        for(int i = 1;i<end;i++)
        {
            data[i-1] = data[i];
        }
        end--;
        return remove;
    }
}
