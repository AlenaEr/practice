package MyList;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ArrayListImpl implements SimpleList {
    private Object[] data;
    private int size;
    private int capacity = 10;
    private long version;

    public ArrayListImpl() {
        data = new Object[capacity];
    }

    public ArrayListImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    @Override
    public void remove(int index) {
        version++;
        if (index == size - 1) {
            data[index] = null;
            size--;
        }
        if (index < size - 1) {
            for (int i = 0; i < data.length-1; i++) {
                data[i] = data[i + 1];
            }
            data[size - 1] = null;
            size--;
        }

    }

    @Override
    public void add(Object item) {
        if (size + 1 > data.length) {
            Object[] temp = new Object[data.length + capacity];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        data[size] = item;
        size++;
        version++;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public Object set(int index, Object value) {
        version++;
        Object oldVal = data[index];
        data[index] = value;
        return oldVal;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int iterIndex;
            private int iterSize = size;
            private long version = ArrayListImpl.this.version;

            @Override
            public boolean hasNext() {

                return iterIndex < iterSize;
            }

            @Override
            public Object next() {
                if (version != version) {
                    throw new ConcurrentModificationException("version!=version))");
                }
                Object item = data[iterIndex];
                iterIndex++;
                return item;
            }

            @Override
            public void remove() {

            }
        };
    }
}
