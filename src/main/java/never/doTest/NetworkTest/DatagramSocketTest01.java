package never.doTest.NetworkTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Description: DatagramSocket 发送端
 * @author: Bo Li
 * @date: 2022年07月12日 11:03
 */
public class DatagramSocketTest01 {
    public static void main(String[] args) {
        DatagramSocket ds = null;
//        OutputStream os = null;
//        DataOutputStream dos = null;
        DatagramPacket dp = null;
        try {
            //指定发送方端口号
            ds = new DatagramSocket(8260);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要发送的内容");
            String s1= sc.next();
            byte[] bt= s1.getBytes();
            //指定接收方ip、端口号等
            dp = new DatagramPacket(bt,bt.length,InetAddress.getByName("localhost"),8888);
            dp.setData(bt,0,bt.length);
            ds.send(dp);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}
