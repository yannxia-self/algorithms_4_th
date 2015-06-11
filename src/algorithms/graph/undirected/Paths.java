package algorithms.graph.undirected;

/**
 * Created by Yann.Xia on 2015/6/8.
 */
public interface Paths {

    boolean hasPathTo(int v);

    Iterable<Integer> pathTo(int v);
}
