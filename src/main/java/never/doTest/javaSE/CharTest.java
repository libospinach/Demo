package never.doTest.javaSE;

import java.util.Arrays;

/**
* @Description: class
* @author: libospinach
* @date: 2022/2/16 16:45
*/
public class CharTest {

    public static void main(String[] args){
//        char s = 97;
//        int j= 'b';
//        System.out.println(j);
//        System.out.println(s);
//        System.out.println(s+1);
//            breakTest();
        testArray();


    }
    
    /**
    * @Description: function
    * @Param: [str1]
    * @return: java.lang.String
    * @Author: libospinach
    * @Date: 2022/2/16
    */
    public String tell(String str1){
        String ss="never";  
        return ss;
    }
    
    /**
    * @Description: break跳循环
    * @Param: []
    * @return: void
    * @Author: libospinach
    * @Date: 2022/2/18
    */
    public static void breakTest(){
        outD:
        for(int i=1 ; i<=100;i++){
            System.out.println(i);
            while(i==20){
                break outD;
            }
        }
    }

    /**
    * @Description: function
    * @Param: []
    * @return: void
    * @Author: libospinach
    * @Date: 2022/2/25
    */
    public static  void testArray(){
        int[]  arr1 = {1,2,5,3,4};
        System.out.println("arr1:"+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("arr1:"+Arrays.toString(arr1));
        int index = Arrays.binarySearch(arr1,5);
        System.out.println("index:"+index);
        int[] arr2 = Arrays.copyOf(arr1,8);
        System.out.println("arr2:"+Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr1,3);
        System.out.println("arr3:"+Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOfRange(arr1,2,4);
        System.out.println("arr4:"+Arrays.toString(arr4));
        //fori   iter

    }

}
