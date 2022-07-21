package never.doTest.CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月13日 13:44
 */
public class ListTest {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("111");
        li.add(34);
        li.add("adc");
        System.out.println(li);
        li.add(2,"j");
        System.out.println("add后");
        System.out.println(li);
        System.out.println("set后-------");
        li.set(3,"y");
        System.out.println(li);
        System.out.println("普通for循环");
        for(int i = 0 ;i<li.size();i++ ){
            System.out.println(li.get(i));
        }
        System.out.println("增强for循环");
        for(Object obj:li){
            System.out.println(obj);
        }
        System.out.println("迭代器");
        Iterator ite = li.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }


    }
}
