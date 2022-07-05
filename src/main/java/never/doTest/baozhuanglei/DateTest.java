package never.doTest.baozhuanglei;

import com.alibaba.fastjson.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年05月30日 15:19
 */
public class DateTest {
    public static void main(String[] args) {

        DateFormat df= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        try {
            Date d  =   df.parse("20220530 12:22:32");
            System.out.println(d);
            Map<String, Object> map = new HashMap<String,Object>();
            String  list[] = {};
            map.put("info",list);
            JSONObject ojs= new JSONObject(map);
            Object obj =ojs.get("info");
            System.out.println("1");

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
