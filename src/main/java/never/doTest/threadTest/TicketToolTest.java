package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月20日 15:22
 */
public class TicketToolTest {
    public static void main(String[] args) {
        TicketTool t1 = new TicketTool("窗口1");
        t1.start();
        TicketTool t2 = new TicketTool("窗口2");
        t2.start();
        TicketTool t3 = new TicketTool("窗口3");
        t3.start();
    }
}
