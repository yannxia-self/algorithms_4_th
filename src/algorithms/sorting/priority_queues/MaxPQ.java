package algorithms.sorting.priority_queues;

/**
 * Created by Yann.Xia on 2015/5/30.
 */
public class MaxPQ<Key extends Comparable<Key>> {
    //pq[0] not use
    protected Key[] pq;
    protected int N = 0;
    protected int maxN = 20;

    public MaxPQ() {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public MaxPQ(int max) {
        maxN = max;
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public MaxPQ(Key[] a) {

        maxN = a.length;
        pq = (Key[]) new Comparable[maxN + 1];
        pq = a;
        N = a.length;
    }

    void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    Key max() {
        return pq[1];
    }

    Key delMax() {
        Key max = pq[1]; // Retrieve max key from top.
        exch(1, N--); // Exchange with last item.
        pq[N + 1] = null; // Avoid loitering.
        sink(1); // Restore heap property.
        return max;
    }

    boolean isEmpty() {
        return N == 0;
    }

    int size() {
        return N;
    }

    protected boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    protected void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    protected void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    protected void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    public static void main(String[] args) {
        Double[] doubles = {1d, 2d, 3d, 4d, 5d};
        MaxPQ<Double> doubleMaxPQ = new MaxPQ<Double>();
        doubleMaxPQ.insert(1d);
        doubleMaxPQ.insert(2d);
        doubleMaxPQ.insert(3d);
        doubleMaxPQ.insert(4d);

        System.out.println(doubleMaxPQ.max());
        doubleMaxPQ.delMax();
        doubleMaxPQ.delMax();
        System.out.println(doubleMaxPQ.max());

    }

}
