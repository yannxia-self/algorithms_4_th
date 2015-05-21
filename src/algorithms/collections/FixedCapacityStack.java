package algorithms.collections;

/**
 * Created by Yann on 2015/5/20.
 */
public class FixedCapacityStack<Item> {

    private Item[] a;
    private int N = 0;

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;

        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    private void resize(int max) { // Move stack of size N <= max to a new array of size max.
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

}
