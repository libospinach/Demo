package never.designPattern.Single;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月09日 9:25
 */
public class MgrTest {
    public static void main(String[] args) {
//        Mgr07 m7 = Mgr07.getInstance();
//        m7.tell();
        Mgr08 instance = Mgr08.INSTANCE;
        instance.m();
    }
}
