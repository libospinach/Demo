package never.designPattern.proxy.dynamicProxy.cglib;

import never.designPattern.proxy.dynamicProxy.EmoPerson;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: cglib实现动态代理
 * @author: Bo Li
 * @date: 2022年08月12日 10:41
 */
public class CglibDemo {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EmoPerson.class);
        enhancer.setCallback(new MyMethodIntercept());
        EmoPerson em = (EmoPerson) enhancer.create();
        em.tell();
        System.out.println("----------");
        em.demo();
    }

}
class MyMethodIntercept implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        before(o,method,objects,methodProxy);
        obj = methodProxy.invokeSuper(o,objects);
        after();
        return null;
    }

    private  void before(Object o, Method method, Object[] objects, MethodProxy methodProxy){
        System.out.println(o.getClass());
        System.out.println(method);
        System.out.println(methodProxy);
        System.out.println("before");
    }
    private void after(){
        System.out.println("after");
    }
}