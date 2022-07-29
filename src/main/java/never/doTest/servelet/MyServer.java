package never.doTest.servelet;

import never.doTest.BO.MyRequest;
import never.doTest.BO.MyResponse;

/**
 * @Description: 具体逻辑处理
 * @author: Bo Li
 * @date: 2022年07月29日 11:03
 */
public class MyServer implements IMyServelet{

    @Override
    public void get(MyRequest req, MyResponse res) {
        System.out.println("req:"+req.toString());
        res.write("get :hello，world");
    }

    @Override
    public void post(MyRequest req, MyResponse res) {
        System.out.println("req:"+req.toString());
        res.write("post :hello，world");
    }

}
