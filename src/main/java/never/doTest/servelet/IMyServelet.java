package never.doTest.servelet;

import never.doTest.BO.MyRequest;
import never.doTest.BO.MyResponse;

public interface IMyServelet {
    public static final  String GET_METHOD = "GET";
    public static final String POST_METHOD = "POST";
    public void get(MyRequest req, MyResponse res);

    public void post(MyRequest req, MyResponse res);

    public default void doServer(MyRequest req, MyResponse res){
        if(GET_METHOD.equals(req.getRequestMethod())){
            this.get(req,res);
        }else if(POST_METHOD.equals(req.getRequestMethod())){
            this.post(req,res);
        }
    }
}
