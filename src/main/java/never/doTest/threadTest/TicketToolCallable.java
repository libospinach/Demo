package never.doTest.threadTest;

import java.util.concurrent.Callable;

/**
 * @Description: 实现Callable接口，特点：1、设定返回值2、抛异常
 * @author: Bo Li
 * @date: 2022年07月20日 16:42
 */
public class TicketToolCallable implements Callable<String> {
    int num = 20;
    @Override
    public String call() throws Exception {
        String res = null;
        for(int i = 0 ; i<100;i++){
            if(num>0){
                System.out.println("您在"+Thread.currentThread().getName()+"买到了"+num--+"张票");
            }else{
                res = "票已售完";
                return res;
            }
        }

        return res;
    }
}
