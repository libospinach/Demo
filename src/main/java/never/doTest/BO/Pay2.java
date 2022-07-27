package never.doTest.BO;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月25日 14:03
 */
public class Pay2 {
    private String name;
    private float money;
    public Pay2(){

    }
    public Pay2(float money){
        this.setName("pay2");
        this.setMoney(money);
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
}
