package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStackImpl implements MyStack, Iterable {
    LinkedList data;

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public void push(Object item) {
        data.add(item);
    }

    public Object pop() {
        Object res = data.removeLast();
        return res;
    }

    public Iterator iterator() {
        return data.iterator();
    }
}
