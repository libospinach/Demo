package never.doTest.enumTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月04日 15:54
 */
public class StudentEnumTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("韩梅梅");
        stu.setAge(18);
        stu.setClothes(Girl.Red);
        stu.setSex(Gentle.女);
        //System.out.println(stu);
        switch(stu.getSex()){
            case 女:
                System.out.println("这是一位可爱的小女孩");
                break;
            case 男:
                System.out.println("这是一位帅气的小男孩");
                break;
        }
        switch (stu.getClothes()){
            case Red:
                System.out.println("穿着一身小红袄");
                break;
            case White:
                System.out.println("穿着白色羽绒服");
                break;
            case Purple:
                System.out.println("穿着紫色卫衣");
                break;
        }
    }
}
