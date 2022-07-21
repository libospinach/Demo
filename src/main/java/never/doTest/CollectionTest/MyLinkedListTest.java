package never.doTest.CollectionTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月18日 10:47
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        LinkedListDemo lk = new LinkedListDemo();
        System.out.println(lk);
        System.out.println(lk.size());
        lk.add("demo");
        lk.add("emo");
        System.out.println(lk);
        System.out.println(lk.size());
    }
}
