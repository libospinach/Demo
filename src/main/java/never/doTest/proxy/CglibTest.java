package never.doTest.proxy;

import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {


    public static void main(String[] args) {
        LogInterceptor daoProxy=new LogInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(daoProxy);

        UserDao dao=(UserDao)enhancer.create();
        dao.select();
        dao.update();
    }
}
