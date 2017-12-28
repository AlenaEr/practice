package MyList;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class LinkedListImpl implements SimpleList {
    private int size;
    private long version;
    private Node2 root;


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {
        version++;
        if (isEmpty()) {
            root = new Node2(item);
        } else {
            Node2 tmp = root;
            while (tmp.getNext() != null) {
                tmp.getNext();
            }
            Node2 node = new Node2(item);
            tmp.setNext(node);
            node.setPrev(tmp);
        }
        size++;
    }

    public Object set(int index, Object val) {
        if (isEmpty()) {
            new RuntimeException("empty");
        }

        version++;
        Node2 tmp = root;
        int step = 0;
        while (tmp.getNext() != null) {
            if (step == index) {
                break;
            }
            tmp = tmp.getNext();
            step++;
        }

        Object previosValue = tmp.getValue();
        tmp.setValue(val);
        return previosValue;
    }


    public void remove(int index) {
        if (isEmpty()) {
            throw new RuntimeException("empty...");
        }
        if (index + 1 > size) {
            throw new RuntimeException("incorrect index");

        }
        Node2 tmp = root;
        int step = 0;
        while (tmp.getNext() != null) {
            if (step == index) {
                break;
            }
            tmp = tmp.getNext();
            step++;
        }
        Node2 next = tmp.getNext();
        Node2 prev = tmp.getPrev();
        prev.setNext(next);
        next.setPrev(prev);
    }


    public Object get(int index) {
        if (isEmpty()) {
            throw new RuntimeException("");
        }
        if (index + 1 > size) {
            throw new RuntimeException("");
        }

        Node2 tmp = root;
        int step = 0;
        while (tmp.getNext() != null) {
            if (step == index) {
                break;
            }
            tmp = tmp.getNext();
            step++;
        }
        return tmp.getValue();
    }

    public Iterator iterator() {
        return new Iterator() {
            private int iterIndex;
            private int iterSize = size;
            private Node2 root = LinkedListImpl.this.root;
            private long version = LinkedListImpl.this.version;

            public boolean hasNext() {
                return iterIndex < iterSize;
            }

            @Override
            public void remove() {

            }

            public Object next() {
                if (!hasNext()) {
                    throw new RuntimeException("empty");
                }
                if (version != LinkedListImpl.this.version) {
                    throw new ConcurrentModificationException("dcdccd");
                }
                Object value = root.getValue();
                root.getNext();
                iterIndex++;
                return value;
            }
        };
    }
}
