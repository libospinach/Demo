package never.designPattern.factoryMethod;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 8:45
 */
public class DogFactory {
    public static Lovely create(){
        return new Dog();
    }
}
