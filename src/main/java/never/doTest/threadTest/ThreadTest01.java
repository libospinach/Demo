package never.doTest.threadTest;

/**
 * @Description: test sychno、wait、notify、Lock
 * @author: Bo Li
 * @date: 2022年07月22日 9:42
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Seller seller = new Seller(shop);
        Buyer buyer = new Buyer(shop);
        Thread t1 = new Thread(seller);
        t1.start();
        Thread t2 = new Thread(buyer);
        t2.start();
    }
}
