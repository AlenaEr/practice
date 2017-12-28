package MyList;

public interface SimpleList extends Iterable{

    public boolean isEmpty();

    public int size();

    public void add(Object item);

    public Object set(int index, Object val);

    public void remove(int index);

    public Object get(int index);
}

