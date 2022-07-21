package never.doTest.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月13日 8:51
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("111");
        c.add(12);
        c.add("never");
        boolean flag = c.contains("never");
        System.out.println(flag);
        Collection c1 = new ArrayList();
        c1.add("111");
        c1.add(12);
        c1.add("never");
        System.out.println("c1.equals(c)："+c1.equals(c));
        System.out.println("c1 == c:"+(c1 == c));
        System.out.println(c);
        System.out.println("增强for循环");
        for(Object ob:c){
            System.out.println(ob);
        }
        System.out.println("Iterator迭代类");
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
