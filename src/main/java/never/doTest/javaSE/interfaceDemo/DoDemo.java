package never.doTest.javaSE.interfaceDemo;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年03月15日 16:28
 */
public class DoDemo implements emo {
    @Override
    public void doEmo() {
        System.out.println("听说您又emo了？");
    }

    @Override
    public void time(String time) {
        System.out.println("您在"+time+"时间点上emo了");
    }
}
