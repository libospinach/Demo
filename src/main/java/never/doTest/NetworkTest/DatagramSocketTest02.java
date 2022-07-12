package never.doTest.NetworkTest;

import java.io.IOException;
import java.net.*;

/**
 * @Description: DatagramSocket 接收端
 * @author: Bo Li
 * @date: 2022年07月12日 11:05
 */
public class DatagramSocketTest02 {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        DatagramPacket dp = null;

        try {
            //指定接收方的端口号
            ds = new DatagramSocket(8888);
            byte[] bt = new byte[1024];
            dp = new DatagramPacket(bt,bt.length);
            ds.receive(dp);
            byte[] data = dp.getData();
            String s = new String(data,0, dp.getLength());
            System.out.println("接收到的内容为："+s);
//            System.out.println(dp.getAddress());
//            System.out.println(dp.getPort());
//            System.out.println(dp.getLength());
//            System.out.println(dp.getSocketAddress());
//            System.out.println(dp.getOffset());
//            System.out.println(dp.getClass());
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}
