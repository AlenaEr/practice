package MyList;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ArrayListImpl implements SimpleList {
    Object[] data;
    private int size;
    int capacity = 15;
    private long version;

    public ArrayListImpl() {
        data = new Object[capacity];
    }

    public ArrayListImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Object item) {
        if (size + 1 > data.length) {
            Object[] tmp = new Object[data.length + capacity];
            System.arraycopy(data, 0, tmp, 0, data.length);
            data = tmp;
        }
        data[size] = item;
        size++;
        version++;

    }

    public Object set(int index, Object val) {
        version++;
        Object old = data[index];
        data[index] = val;
        return old;
    }


    public void remove(int index) {
     if (index==size-1){
         data[size-1]=null;
     }
     if (index<size-1){
         for (int i=0;i<data.length;i++){
             data[i]=data[i+1];
         }
         data[size-1]=null;
         size--;
     }
    }

    public Object get(int index) {
        return data[index];
    }

    public Iterator iterator() {
        return new A();
    }

    class A implements Iterator {
        int iterIndex;
        int arrSize = size;
        private long iterVersion;

        @Override
        public boolean hasNext() {
            return iterIndex < arrSize;
        }

        @Override
        public Object next() {
            if (iterVersion != version) {
                throw new ConcurrentModificationException("");
            }
            Object item = data[iterIndex];
            iterIndex++;
            return item;
        }
    }
}
