package never.designPattern.factoryMethod;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 8:44
 */
public class CatFactory {
    public static Lovely create(){
        return new Cat();
    }
}
