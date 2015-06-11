package algorithms.graph.undirected;

import algorithms.utils.In;
import algorithms.utils.StdOut;

/**
 * Created by Yann.Xia on 2015/6/8.
 */
public class TestSearch {

    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        Search search = new Search(G, s);
        for (int v = 0; v < G.V(); v++)
            if (search.marked(v))
                StdOut.print(v + " ");
        StdOut.println();
        if (search.count() != G.V())
            StdOut.print("NOT ");
        StdOut.println("connected");
    }
}
