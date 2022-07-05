package never.doTest.enumTest;

public enum EnumNow {
    Red("红色","20220704"),
    Blue("蓝色","20220704"),
    White("白色","20061223");

    private String color;
    private  String time;
    private EnumNow(String color,String time){
        this.color=color;
        this.time=time;
    }


    @Override
    public String toString() {
        return "EnumNow{" +
                "color='" + color + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
