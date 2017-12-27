package datastructure;

import java.util.Iterator;

public class MainQueue {
    public static void main(String[] args) {

//        MyQueueImpl queue = new MyQueueImpl();
//        queue.enqueue("a");
//        queue.enqueue("b");
//        queue.enqueue("c");
//         queue.dequeue();
//
//        for (Object item:queue) {
//            System.out.println(item);
//        }
StackImplExaple stackImp=new StackImplExaple();
        System.out.println("stack="+stackImp);
        stackImp.push("a");
        stackImp.push("b");
        stackImp.push("c");

        System.out.println(stackImp.size());

        stackImp.pop();

        System.out.println(stackImp.size());
//        Iterator itr=queue.iterator();
//        while (itr.hasNext()){
//            Object item=itr.next();
//            System.out.println(item);
//        }
    }
}
