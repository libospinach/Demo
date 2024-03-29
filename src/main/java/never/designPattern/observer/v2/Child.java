package never.designPattern.observer.v2;

import java.util.List;

/**
 * @Description: 被观察者child
 * @author: Bo Li
 * @date: 2022年08月10日 16:59
 */
public class Child {
    private Boolean isCry = false;
    private List<Observer2> list;
    private ActionClass actionClass;

    public Child(ActionClass actionClass) {
        this.actionClass = actionClass;
    }

    public void awake(List<Observer2>  list){
        for(Observer2 o:list){
            o.observerAction(this.actionClass);
        }
    }


}

class Dog implements Observer2 {
    @Override
    public void observerAction(ActionClass actionClass) {
        method(actionClass);
    }
    public void method(ActionClass actionClass){
        if(actionClass.getLevel()>2&&actionClass.getLevel()<4){
            System.out.println("当前事件等级为:"+actionClass.getLevel()+"，大于2，小于4，描述为："+actionClass.getDes());
            System.out.println("启动dog应急预案");
        }
        System.out.println("Observer1 Dog 汪汪汪");
    }
}

class Father implements Observer2 {
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

class Cat implements Observer2 {
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