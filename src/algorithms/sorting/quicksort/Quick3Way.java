package algorithms.sorting.quicksort;

import algorithms.sorting.elementray_sort.Example;
import algorithms.utils.StdRandom;

/**
 * Created by Yann.Xia on 2015/5/29.
 * if list has many dump value, use two way is better way.
 */
public class Quick3Way extends Example {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a); // Eliminate dependence on input.
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) { // See page 289 for public sort() that calls this method.
        if (hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else i++;
        } // Now a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi].
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }


    public static void main(String[] args) {
        Double[] a = new Double[1000];
        for (int i = 0; i < 1000; i++) a[i] = StdRandom.uniform();
        sort(a);
        show(a);

    }
}
