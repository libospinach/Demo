package never.designPattern.composite;
/**
* @Description: TODO
* @author: Bo Li
* @date: 2022年08月11日 11:27
*/
public class CompositeDemo {
    public static void main(String[] args) {
        BrachNode root = new BrachNode("root");
        BrachNode node11 = new BrachNode("node11");
        LeafNode node12 = new LeafNode("node12");
        BrachNode node21 = new BrachNode("node21");
        BrachNode node22 = new BrachNode("node22");
        LeafNode node23 = new LeafNode("node23");
        LeafNode node31 = new LeafNode("node31");

        root.addNode(node11);
        root.addNode(node12);
        node11.addNode(node21);
        node11.addNode(node22);
        node11.addNode(node23);
        node22.addNode(node31);

        getValue(root,1);

    }
    private static void getValue(MyNode e,int dep){
        if(e == null){
            return;
        }
        for(int i = 0; i<dep; i++){
            System.out.print("--- ");
        }
        e.tell();
        if(e instanceof BrachNode){
            for(MyNode myNode: ((BrachNode) e).getList()){
                getValue( myNode,dep+1);
            }
        }
    }
}
