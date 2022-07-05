package never.doTest.javaSE;


/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年03月29日 10:43
 */
public class intergerTest {

    public static void main(String[] args) {
        Integer roleID = 0;
        roleID = 10002;
        if((!roleID.equals(10002))&&(!roleID.equals(10230))){
            System.out.println("没权限");
        }

        System.out.println(roleID == 10002);


    }
}
