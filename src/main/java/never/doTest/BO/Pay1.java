package never.doTest.BO;

import never.doTest.Annotation.MyAnnotation;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月25日 13:56
 */
@MyAnnotation(value={"never","emo"})
public class Pay1 extends SuperDemo {
    private String name;
    private float money;
    public String pub;
    protected String pro;
    String defau;
    @MyAnnotation(value={"constructor"})
    public Pay1(float money){
        this.setName("pay1");
        this.setMoney(money);
    }
    public Pay1(){
        this.setName("pay1");
        this.setMoney(265f);
    }
    private Pay1(String s){
        this.setName("pay1");
        this.setMoney(265f);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void doPay(){
        System.out.println(this.getName()+"支付了"+this.getMoney());
    }
    public void doPay(int s){
        System.out.println("这是int形参的doPay方法");
    }
    public void doPay (String a, int b){
        System.out.println("这是String形参、int形参的doPay方法");
    }
    protected void doo(){
        System.out.println("这个方法反射拿不到");
    }
}
