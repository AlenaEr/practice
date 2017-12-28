package datastructure;

import java.util.Iterator;

public class MainBag {
    public static void main(String[] args) {

//
//        MyBagImpl2 myBag = new MyBagImpl2();
//        //int[] data = {1, 5, 10, 0, 3, 6};
//        myBag.add("A");
//        System.out.println(myBag.size());

        MyQueueImpl2 impl2 = new MyQueueImpl2();
        impl2.enqueue("a");
        impl2.enqueue("b");
        impl2.enqueue("c");
        System.out.println("before"+impl2.size());
        System.out.println(impl2.isEmpty());
        impl2.dequeue();
        System.out.println("after"+impl2.size());
        String str = "null";
        str.toString();
        Iterator itr=impl2.iterator();
        System.out.println("itr="+itr);
        //itr = null;
        //itr.hasNext();
        while (itr.hasNext()){
            System.out.println(impl2);
        }
    }
}
