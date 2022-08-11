package never.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 分支节点 有节点
 * @author: Bo Li
 * @date: 2022年08月11日 13:42
 */
public class BrachNode extends MyNode{
    private List<MyNode> list = new ArrayList<>();
    private String value;

    public BrachNode(String value) {
        this.value = value;
    }
    public void addNode(MyNode n){
        list.add(n);
    }
    public List<MyNode> getList() {
        return list;
    }

    public void setList(List<MyNode> list) {
        this.list = list;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    void tell() {
        System.out.println(this.value);
    }
}
