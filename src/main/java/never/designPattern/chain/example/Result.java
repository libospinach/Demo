package never.designPattern.chain.example;

/**
 * @Description: 转自lzy
 * 类描述：结果对象
 * @date: 2022年08月10日 10:59
 */

public class Result {
    public boolean isRatify;
    public String info;

    public Result() {

    }

    public Result(boolean isRatify, String info) {
        super();
        this.isRatify = isRatify;
        this.info = info;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean isRatify) {
        this.isRatify = isRatify;
    }

    public String getReason() {
        return info;
    }

    public void setReason(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result [isRatify=" + isRatify + ", info=" + info + "]";
    }
}
