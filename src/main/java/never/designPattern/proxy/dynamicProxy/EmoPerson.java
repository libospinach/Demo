package never.designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @Description: 动态代理V1
 * @author: Bo Li
 * @date: 2022年08月11日 15:32
 */
public class EmoPerson implements Emo {
    @Override
    public void demo() {
        System.out.println("emo demo");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EmoPerson emoPerson = new EmoPerson();
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        Emo emo = (Emo) Proxy.newProxyInstance(EmoPerson.class.getClassLoader(),
        new Class[]{Emo.class},new MyInvocationHandler(emoPerson));
        emo.demo();
    }
}

class MyInvocationHandler implements  InvocationHandler{
    EmoPerson emoPerson;
    public MyInvocationHandler(EmoPerson emoPerson){
        this.emoPerson = emoPerson;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object o = method.invoke(emoPerson,args);
        this.after();
        return o;
    }
    private void before(){
        System.out.println("begin emo");
    }

    private void after(){
        System.out.println("after emo");
    }
}

