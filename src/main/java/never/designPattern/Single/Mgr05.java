package never.designPattern.Single;

/**
 * @Description: 线程不安全 时间片的概念
 * @author: Bo Li
 * @date: 2022年08月09日 9:07
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){}
    private static Mgr05 getInstance(){
        if(INSTANCE == null){
            synchronized(Mgr05.class){
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }
}
