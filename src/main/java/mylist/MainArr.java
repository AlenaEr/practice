package mylist;

public class MainArr {
    public static void main(String[] args) {
        ArrayListImpl arrayListImpl2=new ArrayListImpl();
        arrayListImpl2.add(10);
        arrayListImpl2.add(100);
        System.out.println(arrayListImpl2.size());
        arrayListImpl2.remove(0);
        System.out.println(arrayListImpl2.size());

        for (Object ob:arrayListImpl2
             ) {
            System.out.println(ob);
        }
        System.out.println("------------------------------");
        LinkedListImpl impl2=new LinkedListImpl();
        impl2.add(15);
        impl2.add(25);
        impl2.add(35);
        System.out.println(impl2.size());
        impl2.remove(2);
        System.out.println(impl2.size());
        impl2.set(1,150);
        for (Object o:impl2
             ) {
            System.out.println(o);
        }
    }
}
