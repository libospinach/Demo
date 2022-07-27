package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月22日 16:44
 */
public class LockBuyer extends Thread {
    private LockShop shop;

    public LockShop getShop() {
        return shop;
    }
    public void setShop(LockShop shop) {
        this.shop = shop;
    }
    public LockBuyer(LockShop shop){
        this.setShop(shop);
    }
    @Override
    public void run(){
        for(int i = 1 ; i <= 10;i++){
            shop.sellFood();
        }
    }
}
