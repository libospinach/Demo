package never.doTest.threadTest;

public class MyBuyer implements Runnable{
    private MyShop shop;
    public MyBuyer(MyShop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        for(int i = 1;i <= 20;i++){
            shop.buyFood();
        }
    }
}
