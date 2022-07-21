package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月20日 15:52
 */
public class TicketToolRunnableTest {
    public static void main(String[] args) {
        TicketToolRunnable tt = new TicketToolRunnable();
        Thread t1 = new Thread(tt,"线程1");
        t1.start();
        Thread t2 = new Thread(tt,"线程2");
        t2.start();
        Thread t3 = new Thread(tt,"线程3");
        t3.start();
        Thread t4 = new Thread(tt,"线程4");
        t4.start();
    }
}
