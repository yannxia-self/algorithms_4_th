package algorithms.strings;

import algorithms.utils.In;

import java.util.Arrays;

/**
 * Created by Yann.Xia on 2015/6/12.
 */
public class keyIndexed {

    public static void main(String[] args) {

        String[] a = {"a", "c", "d", "g", "f"};

        int N = a.length;
        int R = 256;
        String[] aux = new String[N];
        int[] count = new int[R + 1];
// Compute frequency counts.
        for (int i = 0; i < N; i++)
            count[a[i].indexOf("abcdefg")+1 + 1]++;
// Transform counts to indices.
        for (int r = 0; r < R; r++)
            count[r + 1] += count[r];
// Distribute the records.
        for (int i = 0; i < N; i++)
            aux[count[a[i].indexOf("abcdefg") + 1]++] = a[i];
// Copy back.
        for (int i = 0; i < N; i++)
            a[i] = aux[i];


        System.out.println(Arrays.toString(a));
    }
}
