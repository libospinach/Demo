package never.doTest.baozhuanglei;

import java.util.Date;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年05月30日 15:12
 */
public class UtilDate {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());
    }

}

