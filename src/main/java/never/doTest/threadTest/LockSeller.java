package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月22日 16:44
 */
public class LockSeller  extends Thread{
    private LockShop shop;

    public LockShop getShop() {
        return shop;
    }

    public void setShop(LockShop shop) {
        this.shop = shop;
    }

    public LockSeller(LockShop shop){
        this.setShop(shop);
    }
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            if(i%2 == 1){
                shop.produceFood("饼干","小熊");
            }else{
                shop.produceFood("棒棒糖","阿尔卑斯");
            }
        }
    }

}
