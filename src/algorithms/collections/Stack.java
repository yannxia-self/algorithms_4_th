package algorithms.collections;

/**
 * Created by Yann on 2015/5/20.
 */
public class Stack<Item> {

    private Node first; // top of stack (most recently added node)
    private int N; // number of items

    private class Node { // nested class to define nodes
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    } // Or: N == 0.

    public int size() {
        return N;
    }

    public void push(Item item) { // Add item to top of stack.
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop() { // Remove item from top of stack.
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
