package never.doTest.SpringAOPTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class CustomAspect {

    @Pointcut("execution(* *.hello(..))")
    public void fun(){

    }

    @Pointcut("execution(* *.hello(String)) && args(name))")
    public void fun2(String name){
    }
    @Pointcut("execution(* *.hello(String,..)) && args(name))")
    public void fun3(String name){
    }
    @Pointcut("execution(* *.hello(String,Integer)) && args(name,age)")
    public void fun4(String name, Integer age){
    }
    @Before("fun()")
    public void before(JoinPoint joinPoint){
        System.out.print("before ==> ");
        process(joinPoint);
    }
    @Before("fun2(name)")
    public void before2(JoinPoint joinPoint,String name){
        System.out.print("before2 ==> " + name + " ==> ");
        process(joinPoint);
    }
    @Before("fun3(name)")
    public void after3(JoinPoint joinPoint,String name){
        System.out.print("after3 ==> "+ name + " ==> ");
        process(joinPoint);
    }
    @After("fun4(name,age)")
    public void after4(JoinPoint joinPoint, String name, Integer age){
        System.out.print("after4 ==> "+ name + " " +age + " ==> ");
        process(joinPoint);
    }
    public void process(JoinPoint joinPoint){
        MethodSignature signature =(MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.getDeclaringClass().getName()+"."+method.getName()+"：被调用");
    }
}
