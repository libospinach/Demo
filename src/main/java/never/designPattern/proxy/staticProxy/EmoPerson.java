package never.designPattern.proxy.staticProxy;

import java.util.Random;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月11日 15:32
 */
public class EmoPerson implements Emo{
    @Override
    public void demo() {
        System.out.println("emo demo");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TimeProxy(new LogProxy(new EmoPerson())).demo();
    }
}

class  LogProxy implements Emo{
    Emo emo;
    @Override
    public void demo() {
        System.out.println("LogProxy begin");
        emo.demo();
        System.out.println("LogProxy end");
    }

    public LogProxy(Emo emo) {
        this.emo = emo;
    }
}

class TimeProxy implements Emo{
    Emo emo;
    @Override
    public void demo() {
        Long startTime = System.currentTimeMillis();
        emo.demo();
        Long endTime = System.currentTimeMillis();
        System.out.println("共用时:"+(endTime-startTime));
    }

    public TimeProxy(Emo emo) {
        this.emo = emo;
    }
}