package never.designPattern.chain.example;

/**
 * @Description: 转自lzy
 * 接口描述：处理请求
 * @date: 2022年08月10日 11:01
 */

public interface Ratify {
    // 处理请求
    public Result deal(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        // 获取当前request
        Request request();

        // 转发request
        Result proceed(Request request);
    }
}
