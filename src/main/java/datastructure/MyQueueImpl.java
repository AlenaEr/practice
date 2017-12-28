package datastructure;

import java.util.Iterator;

public class MyQueueImpl implements MyQueue, Iterable {

    private Object[] data;
    private int size;
    private int capacity = 15;

    public MyQueueImpl() {
        data = new Object[capacity];
    }

    public MyQueueImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Object item) {
        if (size + 1 > data.length) {
            Object[] tmp = new Object[data.length + capacity];
            System.arraycopy(data, 0, tmp, 0, data.length);
            data = tmp;
        }
        data[size] = item;
        size++;
    }


    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("data is empty");
        }
        Object res = data[0];
        for (int i = 0; i < size-1; i++) {
            data[i] = data[i + 1];
        }
        data[size] = null;
        size--;
        return res;
    }

    public Iterator iterator() {
        return new MyQueueIterator();

    }

    private class MyQueueIterator implements Iterator {
        private int iterIndex;
        private int queueSize = size;

        public boolean hasNext() {
            return iterIndex < queueSize;
        }

        public Object next() {
            Object item = data[iterIndex];
            iterIndex++;
            return item;
        }
    }
}

