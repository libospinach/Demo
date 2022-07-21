package never.doTest.CollectionTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月18日 8:50
 */
public class LinkedListDemo {
    private Node first;
    private Node last;
    private int size = 0;
    public void add(Object obj){
        Node node = new Node();
        if(first == null){
            node.setObj(obj);
            node.setPre(null);
            node.setNext(null);
            first = node;
            last = node;
        }else{
            node.setObj(obj);
            node.setPre(last);
            node.setNext(null);
            last.setNext(node);
            last = node;
        }
        size ++;
    }
    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        return "LinkedListDemo{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }

    private static class Node {
        private Node pre;
        private Object obj;
        private Node next;

        @Override
        public String toString() {
            return "Node{" +
                    ", obj=" + obj +
                    '}';
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
