package never.doTest.NetworkTest;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月11日 17:53
 */
public class NetworkTest01 {
    public static void main(String[] args) {
        //InetAddress inetAddress = new InetAddress();
        try {
            InetAddress byName = InetAddress.getByName("12.5.16.123");
            InetSocketAddress inetSocketAddress = new InetSocketAddress("192.168.1.1",8088);
            System.out.println(inetSocketAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
