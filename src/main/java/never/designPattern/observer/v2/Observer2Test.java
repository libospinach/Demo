package never.designPattern.observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 17:18
 */
public class Observer2Test {
    public static void main(String[] args) {
        ActionClass actionClass = new ActionClass("事件描述", 3);
        Child child = new Child(actionClass);
        List<Observer2> list = new ArrayList<Observer2>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Father());
        child.awake(list);
    }
}
