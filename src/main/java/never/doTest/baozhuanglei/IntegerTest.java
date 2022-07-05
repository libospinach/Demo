package never.doTest.baozhuanglei;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年05月30日 10:30
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i1= new Integer(14);
        Integer i2 = new Integer(14);
        System.out.println("i1.compareTo(i2)："+i1.compareTo(i2));
        System.out.println("----------------");
        System.out.println("i1==i2:"+(i1==i2));
        System.out.println("i1.equals(i2):"+i1.equals(i2));

        Integer i3 = 122;
        Integer i4 = 122;
        System.out.println(i3==i4);
        System.out.println("i3==i4:"+(i3==i4));
        Integer i5 = 130;
        Integer i6 = 130;
        System.out.println(i5==i6);
        System.out.println("i5==i6:"+(i5==i6));
//        if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//            return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//        return new Integer(i);
        System.out.println("i1.intValue:"+i1.intValue());
        String s1="12";
        System.out.println(Integer.parseInt(s1));
        String s2="12a";
        System.out.println(Integer.parseInt(s2));

    }
}
