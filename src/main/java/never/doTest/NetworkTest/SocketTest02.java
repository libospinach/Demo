package never.doTest.NetworkTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: socket 服务端
 * @author: Bo Li
 * @date: 2022年07月12日 9:03
 */
public class SocketTest02 {
    public static void main(String[] args) {
        ServerSocket sv = null;
        Socket s = null;
        try {
            sv = new ServerSocket(8888);
            Boolean flag = true;
            while(flag){
                s = sv.accept();
                SocketTools st = new SocketTools(s);
                st.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
