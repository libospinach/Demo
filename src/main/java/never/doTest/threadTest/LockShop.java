package never.doTest.threadTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月22日 16:44
 */
public class LockShop {
    private String name;
    private String kind;
    private Boolean flag = false;
    ReentrantLock lock = new ReentrantLock();
    Condition buyerCondition = lock.newCondition();
    Condition sellerCondition = lock.newCondition();

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

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public void produceFood(String name,String kind){
        lock.lock();
        try {
            if(flag){
                try {
                    sellerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.setName(name);
            this.setKind(kind);
            System.out.println("卖家生产了--------"+kind+name);
            this.setFlag(true);
            buyerCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void sellFood(){
        lock.lock();
        try {
            if(!flag){
                try {
                    buyerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("小敏买了------"+this.getKind()+this.getName());
            this.setFlag(false);
            sellerCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
