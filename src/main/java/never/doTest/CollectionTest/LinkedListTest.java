package never.doTest.CollectionTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月18日 10:53
 */
public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("begin");
        LinkedList<String> lk = new LinkedList<>();
        lk.add("hello");
        lk.add("one piece");
        lk.add("hello");
        System.out.println(lk);
        Iterator<String> it = lk.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        while(it.hasNext()){
//            if("one piece".equals(it.next())){
//                lk.add("ConcurrentModificationException 并发修改异常，不能同时处理一个list");

//            }
//        }
        ListIterator<String> lit = lk.listIterator();
        while(lit.hasNext()){
            if("one piece".equals(lit.next())){
                lit.add("海贼王路飞");
            }
        }
        System.out.println(lk);
    }
}
