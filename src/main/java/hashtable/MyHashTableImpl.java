package hashtable;

import java.util.LinkedList;

public class MyHashTableImpl implements MyHashTable {
    private LinkedList[] data;
    private int capacity;
    private int size;

    public MyHashTableImpl(int capacity) {
        this.capacity = capacity;
        data = new LinkedList[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object put(Object key, Object value) {
        int index = basketIndex(key);

        return null;
    }

    @Override
    public Object get(Object key) {
        int index = basketIndex(key);
        LinkedList basketItem = data[index];
        if (basketItem == null) {
            return null;
        }
        for (int i = 0; i < basketItem.size(); i++) {
            MyEntry entry = (MyEntry) basketItem.get(i);
            if (key.equals(entry.getKey())) {
                entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Object remove(Object key) {
        int index = basketIndex(key);
        LinkedList basketItem = data[index];
        if (basketItem == null) {
            return null;
        }
        for (int i = 0; i < basketItem.size(); i++) {
            MyEntry entry = (MyEntry) basketItem.get(i);
            if (key.equals(entry.getKey())) {
                basketItem.remove(i);
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Object set(Object key, Object value) {
        int index = basketIndex(key);
        LinkedList basketItem = data[index];
        if (basketItem == null) {
            return null;
        }
        for (int i = 0; i < basketItem.size(); i++) {
            MyEntry entry = (MyEntry) basketItem.get(i);
            if (key.equals(entry.getKey())) {
                basketItem.set(i, new MyEntry(key, value));
                return entry.getValue();
            }
        }
        return null;
    }

    private int basketIndex(Object key) {
        int hash = key.hashCode();
        return hash % data.length;
    }
}
