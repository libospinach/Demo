package never.doTest.mapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月19日 9:01
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","demo");
        map.put("2","ert");
        map.put("2","demo");
        map.put("3","hello");
        map.put("4","jihy");
        System.out.println(map);
        Collection val = map.values();
        for(Object o:val){
            System.out.println(o);
        }
        System.out.println("-----------------");
        Set set = map.keySet();
        for(Object o: set){
            System.out.print(o);
            System.out.print(":");
            System.out.println(map.get(o));
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> e : entries){
            System.out.println(e.getKey()+"------------"+e.getValue());
        }


    }
}
