package never.doTest.CollectionTest;

import java.util.Comparator;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月18日 16:58
 */
public class CompareString implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}

