package MyList;

public class Node2 {
    private Object value;
    private Node2 prev;
    private Node2 next;

    public Node2(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node2 getPrev() {
        return prev;
    }

    public void setPrev(Node2 prev) {
        this.prev = prev;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }
}