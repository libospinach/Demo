package never.doTest.reflaction;

import never.doTest.BO.Pay1;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月25日 14:09
 */
public class Paytest {
    public static void main(String[] args) {
        Pay1 pay1 = new Pay1();
        new NotifyService().notice(pay1);
    }

}
