package never.doTest.baozhuanglei;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年06月17日 17:07
 */
public class StringTest {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(s.equals("abc"));

        String v=new String("abc");
        System.out.println(s.equals(v));
        String d="abc";
        System.out.println(s.compareTo(d));

        //String的三种定义方式，内训模型（结构）的差异栈、堆、字符串常量池   、
        String s1 = "a"+"b";            // 编译时期字符拼接
        String s2 = new String("abc");
        String s3 = s1+"C";             //StringBuilder append   toString
        //String的三种定义方式，内训模型（结构）栈、堆、字符串常量池


        StringBuilder sb = new StringBuilder("abc");

    }
}
