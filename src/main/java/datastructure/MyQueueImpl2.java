package datastructure;

import java.util.Iterator;

public class MyQueueImpl2 implements MyQueue2, Iterable {
    private Object[] data;
    private int size;
    private int capacity = 10;

    public MyQueueImpl2() {
        data = new Object[capacity];
    }

    public MyQueueImpl2(int capacity) {
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
            Object[] temp = new Object[data.length + capacity];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        data[size] = item;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("data is empty...");
        }
        Object el = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size] = null;
        size--;
        return el;
    }

    public Iterator iterator() {
        return new QueueIter();
    }

    private class QueueIter implements Iterator {
        private int iterIndex;
        private int qSize=size;

        public boolean hasNext() {
            //System.out.println("HAS NEXT");
            return iterIndex < qSize;
        }

        public Object next() {
            Object itr = data[iterIndex];
            iterIndex++;
            return itr;
        }
    }
}
