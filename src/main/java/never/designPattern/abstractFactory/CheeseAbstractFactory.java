package never.designPattern.abstractFactory;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 9:05
 */
public class CheeseAbstractFactory extends MyAbstractFactory{
    @Override
    Animal createAnimal() {
        return new Dog();
    }

    @Override
    Human createHuman() {
        return new Cheese();
    }
}
