package mylist;

import java.util.Iterator;

public class LinkedListImpl implements SimpleList {
    private int size;
    private long version;
    private Node root;

    @Override
    public void remove(int index) {
        if (isEmpty()) {
            throw new RuntimeException("empty!!!!");
        }
        if (index > size) {
            throw new RuntimeException("index!!!");
        }
        Node temp = root;
        int step = 0;
        while (temp.getNext() != null) {
            if (step == index) {
                break;
            }
            temp = temp.getNext();
            step++;
        }
        Node next = temp.getNext();
        Node previos = temp.getPrev();
        if (previos != null) {
            previos.setNext(next);
        }
        if (next != null) {
            next.setPrev(previos);
        }

        size--;
    }

    @Override
    public void add(Object item) {
        version++;
        if (isEmpty()) {
            root = new Node(item);
        } else {
            Node temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node node = new Node(item);
            temp.setNext(node);
            node.setPrev(temp);
        }
        size++;
    }

    @Override
    public Object get(int index) {
        if (isEmpty()) {
            throw new RuntimeException("empty!!!!");
        }
        if (index > size) {
            throw new RuntimeException("index!!!");
        }
        Node temp = root;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    @Override
    public Object set(int index, Object value) {
        if (isEmpty()) {
            throw new RuntimeException("empty!!!!");
        }
        if (index > size) {
            throw new RuntimeException("index!!!");
        }
        Node temp = root;
        int step = 0;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            step++;
        }
        Object oldVal = temp.getValue();
        temp.setValue(value);
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

            @Override
            public void remove() {

            }

            private Node root = LinkedListImpl.this.root;

            @Override
            public boolean hasNext() {
                return iterIndex < iterSize;
            }

            @Override
            public Object next() {
                if (!hasNext()) {
                    throw new RuntimeException("data empty");
                }
                Object val = root.getValue();
                root = root.getNext();
                iterIndex++;
                return val;
            }
        };
    }
}
