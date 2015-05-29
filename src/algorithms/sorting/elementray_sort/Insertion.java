package algorithms.sorting.elementray_sort;

/**
 * Created by Yann.Xia on 2015/5/27.
 */
public class Insertion extends Example {

    public static void sort(Comparable[] a) { // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++) { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }

    public static void main(String[] args) {
        Character[] toSort = {'C', 'A', 'Z', 'D'};
        sort(toSort);
        show(toSort);
    }
}
