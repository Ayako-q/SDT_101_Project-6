package Part_1_Linked_Lists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T>
{
    private Node<T> first; // head of the list
    private Node<T> last; // tail of the list
    private int size; // size of the list

    // Constructor
    public LinkedList()
    {
        first = null;
        last = null;
        size = 0;
    }

    // Adds an element to the end of the list
    public void add(T e)
    {
        Node<T> newNode = new Node<>(last, e, null);
        if (last != null) {
            last.next = newNode;
        }
        last = newNode;
        if (first == null) {
            first = newNode;
        }
        size++;
    }

    // Inserts an element at the specified index
    public void add(int i, T e)
    {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
        }
        if (i == size) {
            add(e);
            return;
        }
        Node<T> node = getNode(i);
        Node<T> newNode = new Node<>(node.prev, e, node);
        if (node.prev != null) {
            node.prev.next = newNode;
        } else {
            first = newNode;
        }
        node.prev = newNode;
        size++;
    }

    // Gets the element at the specified index
    public T get(int i)
    {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = getNode(i);
        return node.element;
    }

    // Removes the first occurrence of the specified element from the list
    public void remove(T e)
    {
        Node<T> node = first;
        while (node != null) {
            if (node.element.equals(e)) {
                removeNode(node);
                return;
            }
            node = node.next;
        }
    }

    // Removes the element at the specified index
    public void remove(int i)
    {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = getNode(i);
        removeNode(node);
    }

    // Removes all occurrences of the specified element from the list
    public void removeAll(T e)
    {
        Node<T> node = first;
        while (node != null) {
            if (node.element.equals(e)) {
                Node<T> next = node.next;
                removeNode(node);
                node = next;
            } else {
                node = node.next;
            }
        }
    }

    // Adds an element at the beginning of the list
    public void addFirst(T e)
    {
        Node<T> newNode = new Node<>(null, e, first);
        if (first != null) {
            first.prev = newNode;
        }
        first = newNode;
        if (last == null) {
            last = newNode;
        }
        size++;
    }

    // Returns the size of the list
    public int getSize() {
        return size;
    }

    // Returns a string representation of the list
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> node = first;
        while (node != null) {
            sb.append(node.element).append(" ");
            node = node.next;
        }
        return sb.toString().trim();
    }

    // Helper method to get the node at the specified index
    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Helper method to remove a node from the list
    private void removeNode(Node<T> node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            first = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            last = node.prev;
        }
        size--;
    }

    // Node class representing a node in the linked list
    private static class Node<T>
    {
        private Node<T> prev; // reference to the previous node
        private T element; // data element
        private Node<T> next; // reference to the next node

        // Constructor
        public Node(Node<T> prev, T element, Node<T> next)
        {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    // Iterator for iterating over the elements of the list
    public Iterator<T> iterator()
    {
        return new ListIterator();
    }

    // ListIterator class for iterating over the elements of the list
    private class ListIterator implements Iterator<T>
    {
        private Node<T> currentNode = first;

        // Checks if there is a next element in the list
        public boolean hasNext()
        {
            return currentNode != null;
        }

        // Returns the next element in the list
        public T next()
        {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T element = currentNode.element;
            currentNode = currentNode.next;
            return element;
        }
    }
}


