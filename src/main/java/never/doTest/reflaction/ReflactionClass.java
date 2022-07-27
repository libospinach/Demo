package never.doTest.reflaction;

import never.doTest.Annotation.MyAnnotation;
import never.doTest.BO.Pay1;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月26日 8:42
 */
public class ReflactionClass {
    public static void main(String[] args) {
        //Class的实例对象
        //(1)类的实例
        Class pay1Class = Pay1.class;
        //（2）接口
        Class<Notify> notifyClass = Notify.class;
        //3 数组
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {12};
        Class a1 = arr1.getClass();
        Class a2 = arr2.getClass();
        Class a3 = arr3.getClass();
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        //4注解
        Class<MyAnnotation> myAnnotationClass = MyAnnotation.class;
        //5基本数据类型
        Class<Byte> byteClass = byte.class;
        Class<Integer> integerClass = int.class;
        Class<Short> shortClass = short.class;
        Class<Long> longClass = long.class;
        Class<Float> floatClass = float.class;
        Class<Double> doubleClass = double.class;
        Class<Boolean> booleanClass = Boolean.class;
        //6 void类型
        Class<Void> voidClass = void.class;

    }
}
