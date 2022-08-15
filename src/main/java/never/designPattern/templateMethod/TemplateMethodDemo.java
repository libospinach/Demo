package never.designPattern.templateMethod;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月15日 17:03
 */
public class TemplateMethodDemo extends ConfigureClass {

    @Override
    void doit1() {
        System.out.println("方法doit1");
    }

    @Override
    void doit2() {
        System.out.println("方法doit2");
    }

    public static void main(String[] args) {
        new TemplateMethodDemo().doit();
    }
}
