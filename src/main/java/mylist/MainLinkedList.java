package mylist;

public class MainLinkedList {
    public static void main(String[] args) {
       LinkedListImpl linkedList = new LinkedListImpl();
//        ArrayListImpl arrayList = new ArrayListImpl();
//        arrayList.add(15);
//        arrayList.add(10);
//
//        System.out.println("size= "+arrayList.size());
       // System.out.println(arrayList);


        linkedList.add(20);
        System.out.println(linkedList.size());
        linkedList.add(15);
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        linkedList.set(2,100000);
        System.out.println(linkedList);
//        linkedList.add(20);
//        linkedList.add(15);
        System.out.println("hjhjhjh");
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
            //System.out.println(linkedList.get(i));
        }
        System.out.println(linkedList.size());
//        Iterator itr = linkedList.iterator();
//        while (itr.hasNext()) {
//            Object item = itr.next();
//            item.toString();
//        }
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
       // System.out.println(linkedList);
    }

    }
