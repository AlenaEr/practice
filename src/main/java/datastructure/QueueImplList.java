package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueImplList implements MyQueue2 {
    LinkedList data;

    public QueueImplList() {
        data = new LinkedList();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public void enqueue(Object item) {
        System.out.println("item=" + item);
        System.out.println("data=" + data);
        data.add(item);

    }

    public Object dequeue() {
        return data.remove();
    }

    public Iterator iterator() {
        return data.iterator();
    }
}
