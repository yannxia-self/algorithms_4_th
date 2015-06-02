package algorithms.search.symbol_table;

import java.util.Iterator;

/**
 * Created by Yann.Xia on 2015/6/2.
 */
public abstract class ST<Key extends Comparable<Key>, Value> {

    public ST() {
    }

    public void put(Key key, Value val) {

    }

    public Value get(Key key) {
        return null;
    }

    void delete(Key key) {
        put(key, null);
    }

    boolean contains(Key key) {
        return get(key) == null;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    int size() {
        return 0;
    }

    Iterable<Key> keys() {
        return keys(min(), max());
    }

    Key min() {
        return null;
    }

    Key max() {
        return null;
    }

    Key floor(Key key) {
        return null;
    }

    Key ceiling(Key key) {
        return null;
    }

    int rank(Key key) {
        return 0;
    }

    Key select(int k) {
        return null;
    }

    void deleteMin() {
        delete(min());
    }

    void deleteMax() {
        delete(max());
    }

    int size(Key lo, Key hi) {
        if (hi.compareTo(lo) < 0) {
            return 0;
        } else if (contains(hi)) {
            return rank(hi) - rank(lo) + 1;
        } else {
            return rank(hi) - rank(lo);
        }
    }

    Iterable<Key> keys(Key lo, Key hi) {
        return null;
    }
}
