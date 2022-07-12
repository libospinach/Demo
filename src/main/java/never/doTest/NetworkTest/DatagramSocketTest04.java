package never.doTest.NetworkTest;

import java.io.IOException;
import java.net.*;

/**
 * @Description: DatagramSocket 接受端
 * @author: Bo Li
 * @date: 2022年07月12日 15:37
 */
public class DatagramSocketTest04 {
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
            String returns = "来自接收端的祝福";
            byte[] bt2 = returns.getBytes();
            DatagramPacket dp2 = new DatagramPacket(bt2,bt2.length, InetAddress.getByName("localhost"),8260);
            ds.send(dp2);

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
