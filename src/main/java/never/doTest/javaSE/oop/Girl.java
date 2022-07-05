package never.doTest.javaSE.oop;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年03月11日 15:20
 */
public class Girl {
    private final String name;
    private final int age;

    public Girl(String name,int age){
        this.age=age;
        this.name= name;
    }

    public void play(Animal an){
        System.out.println("小女孩遇见一只小动物");
        an.shout();
    }
}
