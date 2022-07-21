package never.doTest.threadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月20日 16:49
 */
public class TicketToolCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TicketToolCallable ttc =  new TicketToolCallable();
        FutureTask ft = new FutureTask(ttc);
        Thread t1= new Thread(ft,"窗口1");
        t1.start();
        Thread t2= new Thread(ft,"窗口1");
        t2.start();
        Thread t3= new Thread(ft,"窗口1");
        t3.start();
        System.out.println(ft.get());

    }
}
