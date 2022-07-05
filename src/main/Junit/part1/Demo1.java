package part1;


import org.junit.jupiter.api.*;


/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月01日 9:15
 */
public class Demo1 {
    @Test
    public void testAdd(){
        Tools tools = new Tools();
        int res=tools.add(10,5);
        System.out.println("断言类开始执行");
        Assertions.assertEquals(15,res);
    }
    
    @BeforeEach
    public void beforeDo(){
        System.out.println("测试前");
    }
    @AfterEach
    public void afterDo(){
        System.out.println("测试后");
    }
}
