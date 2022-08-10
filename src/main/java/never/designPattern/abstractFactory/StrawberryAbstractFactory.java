package never.designPattern.abstractFactory;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月10日 9:02
 */
public class StrawberryAbstractFactory extends MyAbstractFactory{
    @Override
    Animal createAnimal() {
        return new Cat();
    }

    @Override
    Human createHuman() {
        return new Strawberry();
    }
}
