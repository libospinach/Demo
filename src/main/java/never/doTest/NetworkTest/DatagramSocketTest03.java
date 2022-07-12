package never.doTest.NetworkTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Description: DatagramSocket 发送端 双向通信
 * @author: Bo Li
 * @date: 2022年07月12日 15:35
 */
public class DatagramSocketTest03 {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        DatagramPacket dp = null;
        try {
            //指定发送方端口号
            ds = new DatagramSocket(8260);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要发送的内容");
            String s1= sc.next();
            byte[] bt= s1.getBytes();
            //指定接收方ip、端口号等
            dp = new DatagramPacket(bt,bt.length, InetAddress.getByName("localhost"),8888);
            dp.setData(bt,0,bt.length);
            ds.send(dp);
            byte[] rebyte = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(rebyte,rebyte.length);
            ds.receive(dp2);
            byte[] data = dp2.getData();
            String returnS = new String(data,0,dp2.getLength());
            System.out.println("服务端返回的内容为："+returnS);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}
