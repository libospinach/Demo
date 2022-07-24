package never.doTest.threadTest;

public class MySeller implements  Runnable{
    private MyShop shop;
    public MySeller(MyShop shop){
        this.shop = shop;
    }
    @Override
    public void run() {
        for(int i = 1;i <= 20;i++){
            if(i%2 == 1){
                shop.productFood("冰淇淋","香草味");
            }else{
                shop.productFood("圣代","草莓");
            }
        }
    }

}
