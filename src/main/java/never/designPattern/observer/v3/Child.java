package never.designPattern.observer.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 被观察者child
 * @author: Bo Li
 * @date: 2022年08月10日 16:59
 */
public class Child {
    private Boolean isCry = false;
    private List<Observer3> list = new ArrayList<>();
    {
        list.add(new Cat());
        list.add(new Father());
        list.add(new Dog());
    }


    public void awake(){
        ActionClass actionClass = new ActionClass("事件描述", 3,this);
        for(Observer3 o:list){
            o.observerAction(actionClass);
        }
    }


}

class Dog implements Observer3 {
    @Override
    public void observerAction(ActionClass actionClass) {
        method(actionClass);
    }
    public void method(ActionClass actionClass){
        System.out.println("事件源:"+actionClass.getSource());
        if(actionClass.getLevel()>2&&actionClass.getLevel()<4){
            System.out.println("当前事件等级为:"+actionClass.getLevel()+"，大于2，小于4，描述为："+actionClass.getDes());
            System.out.println("启动dog应急预案");
        }
        System.out.println("Observer1 Dog 汪汪汪");
    }
}

class Father implements Observer3 {
    public void method(ActionClass actionClass){
        if(actionClass.getLevel()>0&&actionClass.getLevel()<3){
            System.out.println("当前事件等级为:"+actionClass.getLevel()+"，大于0，小于3，描述为："+actionClass.getDes());
            System.out.println("启动father应急预案");
        }
        System.out.println("Observer1 Father 喂食");
    }

    @Override
    public void observerAction(ActionClass actionClass) {
        method(actionClass);
    }
}

class Cat implements Observer3 {
    @Override
    public void observerAction(ActionClass actionClass) {
        method(actionClass);
    }

    public void method(ActionClass actionClass){
        if(actionClass.getLevel()>5){
            System.out.println("当前事件等级为:"+actionClass.getLevel()+"，大于5，描述为："+actionClass.getDes());
            System.out.println("启动cat应急预案");
        }
        System.out.println("Observer1 Cat 喂食");
    }
}