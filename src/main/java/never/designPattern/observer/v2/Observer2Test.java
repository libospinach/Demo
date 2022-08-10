package never.designPattern.observer.v2;

import never.designPattern.observer.v1.Observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 17:18
 */
public class Observer2Test {
    public static void main(String[] args) {
        Child child = new Child();
        List<Observer1> list = new ArrayList<Observer1>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Father());
        child.awake(list);
    }
}
