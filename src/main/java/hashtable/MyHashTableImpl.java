package hashtable;

import java.util.LinkedList;

public class MyHashTableImpl implements MyHashTable {
    private LinkedList[] data;
    private int size;
    private int capacity=10;

    public MyHashTableImpl() {
        data=new LinkedList[capacity];
    }

    public MyHashTableImpl(int capacity) {
        this.capacity = capacity;
        data=new LinkedList[capacity];
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
        int index = getBasketIndex(key);
        if (data[index] == null) {
            data[index] = new LinkedList();
            MyEntry entry2 = new MyEntry(key, value);
            data[index].add(entry2);
            size++;
            return entry2.getValue();
        }
        LinkedList basketItem = data[index];
        for (int i = 0; i < basketItem.size(); i++) {
            MyEntry myEntry2 = (MyEntry) basketItem.get(i);
            if (key.equals(myEntry2.getKey())) {
                MyEntry a = new MyEntry();
                MyEntry old = (MyEntry) basketItem.set(i, a);
                return old.getValue();
            }
            basketItem.add(new MyEntry(key, value));
            size++;
        }
        return null;
    }


    private int getBasketIndex(Object key) {
        int hash = key.hashCode();
        return hash % data.length;
    }

    @Override
    public Object get(Object key) {
        int index = getBasketIndex(key);
        if (data[index] == null) {
            return null;
        }
        LinkedList basketItem = data[index];
        for (int i = 0; i < basketItem.size(); i++) {
            MyEntry entry2 = (MyEntry) basketItem.get(i);
            if (key.equals(entry2.getKey())) {
                return entry2.getValue();
            }
        }
        return null;
    }

    @Override
    public Object remove(Object key) {
        int index = getBasketIndex(key);
        if (data[index] == null) {
            return null;
        }
        LinkedList basketItem = data[index];
        for (int i = 0; i < basketItem.size(); i++) {
            MyEntry entry2 = (MyEntry) basketItem.get(i);
            if (key.equals(entry2.getKey())) {
                basketItem.remove(i);
                size--;
                return entry2.getValue();
            }
        }

        return null;
    }

    @Override
    public Object set(Object key, Object value) {
        int index = getBasketIndex(key);
        if (data[index] == null) {
            return null;
        }
        LinkedList basketItem = data[index];
        for (int i = 0; i < basketItem.size(); i++) {
            MyEntry entry2 = (MyEntry) basketItem.get(i);
            if (key.equals(entry2.getKey())) {
                basketItem.set(i, new MyEntry(key, value));
                return entry2.getValue();
            }
        }
        return null;
    }
}
