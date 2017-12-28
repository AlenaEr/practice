package datastructure;

public class StackImplExaple implements MyStack2 {
    private Object[] data;
    private int size;
    private int capacity = 10;

    public StackImplExaple() {
        data = new Object[capacity];
    }

    public StackImplExaple(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public int size() {
        return size ;

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
        Object el = data[size - 1];
        data[size - 1] = null;
        size--;
        return el;
    }
}
