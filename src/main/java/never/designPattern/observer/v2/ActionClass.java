package never.designPattern.observer.v2;

/**
 * @Description: 事件描述类
 * @author: Bo Li
 * @date: 2022年08月11日 9:01
 */
public class ActionClass {
    private String des;
    private  int  level;

    public ActionClass(String des, int level) {
        this.des = des;
        this.level = level;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}
