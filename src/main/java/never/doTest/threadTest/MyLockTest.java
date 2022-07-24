package never.doTest.threadTest;

public class MyLockTest {
    public static void main(String[] args) {
        MyShop shop = new MyShop();
        MyBuyer myBuyer = new MyBuyer(shop);
        MySeller mySeller = new MySeller(shop);
        Thread t2 = new Thread(mySeller);
        t2.start();
        Thread t1 = new Thread(myBuyer);
        t1.start();

    }

}
