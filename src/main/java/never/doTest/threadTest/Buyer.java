package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月22日 9:47
 */
public class Buyer implements Runnable{
    private Shop shop;

    public Buyer(Shop shop){
        this.shop = shop;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 20;i++){
           shop.sellProduct();
        }

    }
}
