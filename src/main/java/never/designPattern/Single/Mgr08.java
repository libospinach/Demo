package never.designPattern.Single;

/**
 * @Description: JVM会保证枚举对象的唯一性，因此每一个枚举类型和定义的枚举变量都是唯一的，保证了线程安全
 * @author: Bo Li
 * @date: 2022年08月09日 9:25
 */
public enum Mgr08 {
    INSTANCE;
    public void m(){
        System.out.println("单例设计模式08");
    }
}
