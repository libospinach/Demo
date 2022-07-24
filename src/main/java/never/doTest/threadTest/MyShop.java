package never.doTest.threadTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyShop {
    private String name;
    private String kind;
    private boolean flag;
    Lock lock = new ReentrantLock();
    Condition productCondition = lock.newCondition();
    Condition sellCondition = lock.newCondition();
    public MyShop(){
        this.flag = false;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void productFood(String name,String kind){
        lock.lock();
        try {
            if(flag){
                try {
                    productCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name;
            this.kind = kind;
            System.out.println("商家制作了-----"+kind+name);
            flag = true;
            sellCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();

        }
    }

    public void buyFood(){

        lock.lock();
        try {
            if(!flag){
                try {
                    sellCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("小明买了------"+this.kind+this.name);
            flag = false;
            productCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
