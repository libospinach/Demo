package never.designPattern.observer.v2;

import never.designPattern.observer.v1.Observer1;

import java.util.List;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 16:59
 */
public class Child {
    private Boolean isCry = false;
    private List<Observer1> list;

    public void awake(List<Observer1>  list){
        for(Observer1 o:list){
            o.observerAction();
        }
    }


}

class Dog implements Observer1 {
    @Override
    public void observerAction() {
        method();
    }
    public void method(){
        System.out.println("Observer1 Dog 汪汪汪");
    }
}

class Father implements Observer1 {
    @Override
    public void observerAction() {
        method();
    }

    public void method(){
        System.out.println("Observer1 Father 喂食");
    }
}

class Cat implements Observer1 {
    @Override
    public void observerAction() {
        method();
    }

    public void method(){
        System.out.println("Observer1 Cat 喂食");
    }
}