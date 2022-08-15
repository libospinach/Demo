package never.designPattern.templateMethod;

/**
 * @Description:
 * @author: Bo Li
 * @date: 2022年08月15日 17:00
 */
public abstract class ConfigureClass {
    public  void doit(){
        doit1();
        doit2();
    }
    abstract  void doit1();
    abstract void doit2();
}
