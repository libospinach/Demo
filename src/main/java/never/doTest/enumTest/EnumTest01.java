package never.doTest.enumTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月04日 10:15
 */
public class EnumTest01 {
    public static void main(String[] args) {
        EnumEver enum1 = EnumEver.Red;
        System.out.println(enum1.toString());
        EnumEver enum2 = EnumEver.White;
        System.out.println(enum2);
        EnumNow red = EnumNow.Red;
        System.out.println(red);
        Girl redGirl=Girl.Red;
        System.out.print(redGirl.toString());
        redGirl.show();
        EnumNow[] values = EnumNow.values();
        int i =1;
        for(EnumNow s:values){
            System.out.println(i+":"+s.toString());
            i++;
        }
        EnumNow red2 = EnumNow.valueOf("Red");
        System.out.println(red2);

    }


}
