package hashtable;

public interface MyHashTable {
    public int size();
    public boolean isEmpty();
    public Object put(Object key,Object value);
    public Object get(Object key);
    public Object remove(Object key);
    public Object set(Object key,Object value);

}
