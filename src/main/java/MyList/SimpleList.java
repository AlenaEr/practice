package MyList;

public interface SimpleList extends Iterable {
    public void remove(int index);

    public void add(Object item);

    public Object get(int index);

    public Object set(int index, Object value);

    public boolean isEmpty();
    public int size();
}
