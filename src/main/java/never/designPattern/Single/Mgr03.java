package never.designPattern.Single;

public class Mgr03 {
    private static  Mgr03 INSTANCE;
    private Mgr03(){

    }
    public static Mgr03 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void tell(){
        System.out.println("设计模式单例三");
    }

}
