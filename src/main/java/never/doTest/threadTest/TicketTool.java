package never.doTest.threadTest;

/**
 * @Description: TicketTool
 * @author: Bo Li
 * @date: 2022年07月20日 15:11
 */
public class TicketTool extends Thread{
    public TicketTool(String name){
        super(name);
    }
    static int ticketNum = 20;
    @Override
    public void run(){
        //100人抢票
        for(int i = 0;i<100;i++){
            if(ticketNum>0){
                System.out.println("您在"+this.getName()+"买到了第"+ticketNum--+"张车票");
            }
        }
    }
}
