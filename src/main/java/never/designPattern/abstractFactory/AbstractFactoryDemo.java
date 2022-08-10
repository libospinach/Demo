package never.designPattern.abstractFactory;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 9:06
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        StrawberryAbstractFactory abstractFactory = new StrawberryAbstractFactory();
        Human human = abstractFactory.createHuman();
        human.run();
        Animal animal = abstractFactory.createAnimal();
        animal.say();
    }
}
