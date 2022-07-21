package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月21日 16:18
 */
public class ThreadMethodsTest {
    public static void main(String[] args) {
        for(int i = 1 ;i<=50;i++){
            if(i==20){
                TicketTool tt = new TicketTool("子线程");
                tt.start();
                try {
                    tt.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("主线程:----------"+i);
        }
        System.out.println("----------------------------");
        for(int i = 1; i <= 10 ; i++){
            if( i == 10){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("@@@@@@@@@@@"+i);
        }
        TicketTool tt2 = new TicketTool("子线程2");
        tt2.setDaemon(true);
        tt2.start();
        for(int i =1;i<=10;i++){
            System.out.println("！！！！"+i);
        }

    }
}
