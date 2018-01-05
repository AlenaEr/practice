package hashtable;

public class MainHashTable  {
    public static void main(String[] args) {
        MyHashTableImpl hashTable=new MyHashTableImpl();
        hashTable.put(1,12);
        System.out.println(hashTable.size());
        System.out.println( hashTable.get(1));
        hashTable.remove( 1);
        System.out.println(hashTable.size());
        hashTable.get( 1);
    }
}
