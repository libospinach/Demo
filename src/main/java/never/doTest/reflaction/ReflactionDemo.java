package never.doTest.reflaction;

import java.lang.reflect.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月26日 10:14
 */
public class ReflactionDemo {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("never.doTest.BO.Pay1");
            //---------------属性---------------------
            Field[] fields = cls.getFields();
            for(Field f :fields){
                System.out.println(f);
            }
            System.out.println("---------------");
            Field[] declaredFields = cls.getDeclaredFields();
            for(Field field:declaredFields){
                System.out.println(field);
            }

            Field pub = cls.getDeclaredField("pub");
            Object o = cls.newInstance();
            pub.set(o,"pub值");
            System.out.println(pub);
            //----------------方法----------------
            System.out.println("-------getMethods↓-------");
            Method[] methods = cls.getMethods();
            for(Method method:methods){
                System.out.println(method);
            }
            System.out.println("-------getDeclaredMethods↓-------");
            Method[] declaredMethods = cls.getDeclaredMethods();
            for(Method m:declaredMethods){
                System.out.println(m);
            }
            System.out.println("-------getModifiers↓-------");
            Method doPay = cls.getMethod("doPay",int.class);
            System.out.println(doPay.getName());
            int modifiers = doPay.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            System.out.println("-------------------");
            System.out.println(doPay.getReturnType());
            System.out.println(doPay.getParameterTypes());
            System.out.println("-------invoke↓-------");
            doPay.invoke(o,17);
            Method doPay1 = cls.getMethod("doPay", String.class, int.class);
            doPay1.invoke(o,"jhs",18);
            //--------------------------------构造器-----------
            System.out.println("---------构造器----------");
            Constructor[] constructors = cls.getConstructors();
            for(Constructor constructor:constructors){
                System.out.println(constructor);
            }
            System.out.println("---------------");
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            for(Constructor con:declaredConstructors){
                System.out.println(con);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
