package never.doTest.javaSE;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年03月01日 16:52
 */
public class Spinach {
    int num;
    String color;
    double weight;
    static int ever;
    public Spinach(){
        System.out.println("开始执行构造方法");
        this.num = 8;
        {
            System.out.println("代码块中的普通块，存在方法中");
        }
    }
    {
        System.out.println("这是代码块中的构造块");
    }
    static{
        System.out.println("这是代码块中的静态块");
    }

    public static void abandon(){
        System.out.println("这是静态方法");
    }
    public boolean equals(Object obj){
        if(obj instanceof  Spinach){
            return true;
        }
        return false;
    }



    public void emo(){
        System.out.println("emo_demo");
    }
}
