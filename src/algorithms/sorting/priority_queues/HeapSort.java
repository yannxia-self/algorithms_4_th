package algorithms.sorting.priority_queues;

import algorithms.utils.StdRandom;

/**
 * Created by Yann.Xia on 2015/5/30.
 */
public class HeapSort {
    public static void sort(Comparable[] a) {
        int N = a.length - 1;
        //i think is just want to find max item
        for (int k = N / 2; k >= 0; k--)
            sink(a, k, N);
        while (N > 0) {
            exch(a, 0, N--);
            sink(a, 0, N);
        }
    }

    private static void swim(Comparable[] pq, int k, int N) {
        while (k > 0 && less(pq, k / 2, k)) {
            exch(pq, k / 2, k);
            k = k / 2;
        }
    }

    private static void sink(Comparable[] pq, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(pq, j, j + 1)) j++;
            if (!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

    private static void exch(Comparable[] pq, int i, int j) {
        Comparable t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    public static void main(String[] args) {
        Double[] doubles = new Double[15];
        for (int i = 0; i < doubles.length; i++) doubles[i] = StdRandom.uniform();

        sort(doubles);

        for (Double aDouble : doubles) System.out.println(aDouble);
    }
}
