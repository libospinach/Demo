package never.doTest.mapTest;

import never.doTest.BO.Person;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月19日 9:44
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeMap<Person, String> treeMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        treeMap.put(new Person("xiaoming",15),"1002");
        treeMap.put(new Person("xiaowei",14),"1003");
        treeMap.put(new Person("xiaoyu",13),"1004");
        treeMap.put(new Person("xiaohu",14),"1005");
        System.out.println(treeMap);
        System.out.println(treeMap.size());

    }
}
