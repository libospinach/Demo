package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月22日 9:44
 */
public class Shop {
    private String name;
    private String kind;
    private Boolean flag;
    public Shop(){
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
    public  synchronized void produceProduct(String name, String kind){
        if(flag){
            try {
                wait() ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        this.setKind(kind);
        System.out.println("卖家生产了"+this.getKind()+this.getName());
        flag = true;
        notify();
    }
    public synchronized  void sellProduct(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("买家买了"+this.getKind()+this.getName());
        flag = false;
        notify();
    }


}
