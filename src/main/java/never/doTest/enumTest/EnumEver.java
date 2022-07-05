package never.doTest.enumTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月04日 10:08
 */
public class EnumEver {
    private String color;
    private String time;
    private EnumEver(String color,String time){
        this.color = color;
        this.time = time;
    }
    public static final EnumEver Red= new EnumEver("红色","20220704");
    public static  final EnumEver Blue = new EnumEver("蓝色","20220705");
    public static  final  EnumEver White = new EnumEver("白色","20061223");

    @Override
    public String toString() {
        return "EnumEver{" +
                "color='" + color + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
