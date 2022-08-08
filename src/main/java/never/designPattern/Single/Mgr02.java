package never.designPattern.Single;

public class Mgr02 {
    private static final Mgr02 INSTANCE ;
    static{
        INSTANCE = new Mgr02();
    }
    private Mgr02(){}
    public static Mgr02 getInstance(){
        return INSTANCE;
    }
    public void m(){
        System.out.println("单例模式2");
    }

}
