package never.doTest.javaSE.oop;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年03月11日 15:19
 */
public class TestRun {


    public static void main(String[] args) {
        Girl girl= new Girl("lili",18);
       // Animal an = new Animal();
        Animal an = new Dog();
        girl.play(an);
    }

}
