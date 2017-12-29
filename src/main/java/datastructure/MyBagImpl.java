package datastructure;

import java.util.Arrays;
import java.util.Iterator;

public class MyBagImpl implements MyBag,Iterable{
    private Object[] data = null;
    private int size;
    private int capacity = 10;
    //[0,0,0,0,0,0,0,0,0,0]

    @Override
    public String toString() {
        return "MyBagImpl{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    public MyBagImpl() {
        data=new Object[capacity];
    }

    public MyBagImpl(int capacity) {
        this.capacity = capacity;
        data=new Object[capacity];
    }

    public boolean isEnpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Object item) {
        if (size + 1 > data.length) {
            Object[] temp = new Object[data.length + capacity];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        data[size] = item;
        size++;
    }

    public Iterator iterator() {
        return null;
    }
}
