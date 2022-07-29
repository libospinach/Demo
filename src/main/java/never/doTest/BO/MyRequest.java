package never.doTest.BO;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: MyRequest
 * @author: Bo Li
 * @date: 2022年07月29日 8:42
 */
public class MyRequest {
    private String requestMethod;
    private String requestUrl;
    public MyRequest(InputStream inputStream){
        byte[] bt = new byte[1024*4];
        int len;
        String s = null;
        try {
            len = inputStream.read(bt);
            if(len!=-1){
                // ----------------------------
                s = new String(bt,0,len);
                //len = inputStream.read(bt);
            }
            String[] sArr = s.split("\r\n");
            String s1 = sArr[0];
            String[] s2 = s1.split(" ");
            if(s2.length>1){
                setRequestMethod(s2[0]);
                setRequestUrl(s2[1]);
            }else{
                System.out.println("请求行内容缺失");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
