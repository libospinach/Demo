package never.doTest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class LogHandler implements InvocationHandler {
    Object target;
    public LogHandler(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj=method.invoke(target,args);
        after();
        return obj;
    }
    private void before(){
        System.out.println(String.format("log begin time : [%s]",new Date()));
    }
    private void after(){
        System.out.println(String.format("log end time :[%s]",new Date()));
    }
}
