package algorithms.chapter_2;

import algorithms.Main;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Yann.Xia on 2015/5/27.
 */
public class Selection extends Example {

    public static void sort(Comparable[] a) { // Sort a[] into increasing order.
        int N = a.length; // array length
        for (int i = 0; i < N; i++) { // Exchange a[i] with smallest entry in a[i+1...N).
            int min = i; // index of minimal entr.
            for (int j = i + 1; j < N; j++)
                if (less(a[j], a[min])) min = j;
            exch(a, i, min);
        }
    }


    public static void main(String[] args) {
        Character[] toSort = {'C', 'A', 'Z', 'D'};
        sort(toSort);
        show(toSort);
    }
}
