package algorithms.sorting.elementray_sort;

import algorithms.utils.In;
import algorithms.utils.StdOut;

/**
 * Created by Yann.Xia on 2015/5/27.
 */
public abstract class Example {
    public static void sort(Comparable[] a) { /* See Algorithms 2.1, 2.2, 2.3, 2.4, 2.5, or 2.7. */ }

    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a) { // Print the array, on a single line.
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    protected static boolean isSorted(Comparable[] a) { // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }
}
