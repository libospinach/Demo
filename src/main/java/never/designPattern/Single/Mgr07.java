package never.designPattern.Single;

/**
 * @Description: 1、静态内部类的属性在类加载时不会初始化，效率提高
 *               2、JVM保证静态内部类线程安全
 * @author: Bo Li
 * @date: 2022年08月09日 9:17
 */
public class Mgr07 {
    //private static Mgr07 INSTANCE;
    private Mgr07(){}
    private static class Mgr07Holder{
        private static Mgr07 INSTANCE = new Mgr07();
    }
    public static Mgr07 getInstance(){
        return Mgr07Holder.INSTANCE;
    }
    public void tell(){
        System.out.println("单例设计模式07");
    }

}
