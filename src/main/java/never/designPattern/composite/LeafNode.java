package never.designPattern.composite;

/**
 * @Description: 叶子节点
 * @author: Bo Li
 * @date: 2022年08月11日 13:42
 */
public class LeafNode extends MyNode {
    private String value;
    @Override
    void tell() {
        System.out.println(this.value);
    }

    public LeafNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
