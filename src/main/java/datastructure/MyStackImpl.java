package datastructure;

public class MyStackImpl implements MyStack {
    private Object[] data;
    private int capacity = 10;
    private int size;

    public MyStackImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(Object item) {
        if (size + 1 > data.length) {
            Object[] tmp = new Object[data.length + capacity];
            System.arraycopy(data, 0, tmp, 0, data.length);
            data = tmp;
        }
        data[size] = item;
        size++;
    }

    public Object pop() {
        Object res = data[size - 1];
        data[size - 1] = null;
        size--;
        return res;
    }
}
