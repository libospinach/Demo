package never.designPattern.Single;

/**
 * @Description: 线程安全但是效率降低
 * @author: Bo Li
 * @date: 2022年08月09日 9:04
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;
    private Mgr04(){}
    public static synchronized Mgr04 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }
    public void tell(){
        System.out.println("单例设计模式04");
    }
}
