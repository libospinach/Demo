package never.doTest.proxy;

public class UserServiceImpl implements  UserService{
    @Override
    public void select() {
        System.out.println("选择数据");
    }

    @Override
    public void update() {
        System.out.println("更新参数");
    }
}
