package hashtable;

public class MyEntry {
    private Object key;
    private Object value;

    public MyEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public MyEntry() {

    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
