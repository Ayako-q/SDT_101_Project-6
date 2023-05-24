package Part_3_Queue;

import java.util.LinkedList;

public class Queue<T> extends LinkedList<T>
{
    public void enqueue(T item) {addLast(item);}

    public T dequeue() {return removeFirst();}

    public boolean isEmpty() {return super.isEmpty();}

    public int size() {return super.size();}
}

