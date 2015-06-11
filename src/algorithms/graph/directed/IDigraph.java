package algorithms.graph.directed;

import java.util.Iterator;

/**
 * Created by Yann.Xia on 2015/6/9.
 */
public interface IDigraph {

    int V();

    int E();

    void addEdge(int v, int w);

    Iterator<Integer> adj(int v);

    IDigraph reverse();

    String toString();
}
