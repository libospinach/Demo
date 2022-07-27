package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月25日 13:46
 */
public class LockTest {
    public static void main(String[] args) {
        LockShop shop = new LockShop();
        LockBuyer buyer = new LockBuyer(shop);
        buyer.start();
        LockSeller seller = new LockSeller(shop);
        seller.start();
    }
}
