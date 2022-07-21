package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月20日 15:49
 */
public class TicketToolRunnable implements Runnable{
    int num = 30;
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if(num>0){
                System.out.println("您在"+Thread.currentThread().getName()+"买到了第"+num--+"张票");
            }
        }
    }
}
