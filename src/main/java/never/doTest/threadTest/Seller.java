package never.doTest.threadTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月22日 9:49
 */
public class Seller implements  Runnable{
    private Shop shop;
    public Seller(Shop shop){
        this.shop = shop;
    }
//    @Override
//    public void run() {
//        for(int i = 1 ;i <= 20;i++){
//            synchronized(shop){
//                if(i % 2 == 1){
//                    shop.setName("冰淇淋");
//                    shop.setKind("香草味");
//                }else{
//                    shop.setName("圣代");
//                    shop.setKind("草莓");
//                }
//                System.out.println("卖家生产了"+shop.getKind()+shop.getName());
//            }
//        }
//    }

    @Override
    public void run() {
        for(int i = 1 ;i <= 20;i++){
                if(i % 2 == 1){
                    shop.produceProduct("冰淇淋","香草味");
                }else{
                    shop.produceProduct("圣代","草莓");
                }
            }
        }
}
