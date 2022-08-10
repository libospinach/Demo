package never.designPattern.Single;

/**
 * @Description: 线程安全，比Mgr04效率高  volatile考虑jit优化
 * @author: Bo Li
 * @date: 2022年08月09日 9:14
 */
public class Mgr06 {
    private static volatile Mgr06 INSTANCE;
    private Mgr06(){}
    public static Mgr06 getInstance(){
        if(INSTANCE == null){
            synchronized(Mgr06.class){
                if(INSTANCE == null){
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
}
