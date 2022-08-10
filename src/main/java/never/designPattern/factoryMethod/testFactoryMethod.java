package never.designPattern.factoryMethod;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 8:46
 */
public class testFactoryMethod {
    public static void main(String[] args) {
        Lovely lovely = CatFactory.create();
        lovely.say();
        Lovely lovely1 = DogFactory.create();
        lovely1.say();

    }
}
