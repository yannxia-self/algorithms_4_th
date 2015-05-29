package algorithms.fundamentals;

import algorithms.utils.StdIn;
import algorithms.utils.StdOut;

/**
 * Created by Yann on 2015/5/26.
 */
public class UF {
    private int[] id; // access to component id (site indexed)
    private int count; // number of components

    public UF(int N) { // Initialize component id array.
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) return;
        for (int i = 0; i < id.length; i++)
            if (id[i] == pID) id[i] = qID;
        count--;
    }

    // See page 222 (quick-find),page 224 (quick-union) andpage 228 (weighted).
    public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        int N = StdIn.readInt(); // Read number of sites.
        UF uf = new UF(N); // Initialize N components.
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt(); // Read pair to connect.
            if (uf.connected(p, q)) continue; // Ignore if connected.
            uf.union(p, q); // Combine components
            StdOut.println(p + " " + q); // and print connection.
        }
        StdOut.println(uf.count() + " components");
    }
}
