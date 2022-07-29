package never.doTest.BO;

import java.util.HashMap;

/**
 * @Description: 请求映射类
 * @author: Bo Li
 * @date: 2022年07月29日 10:32
 */
public class MyRequestMapping {
    public static HashMap<String,String> map = new HashMap<>();
    static{
            map.put("/myurl","never.doTest.servelet.MyServer");
            map.put( "/demo","never.doTest.servelet.MyServer");
        }
    public String get(String str){
        return map.get(str);
    }

}
