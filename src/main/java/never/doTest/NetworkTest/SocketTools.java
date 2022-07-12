package never.doTest.NetworkTest;

import java.io.*;
import java.net.Socket;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月12日 10:12
 */
public class SocketTools extends Thread {
    private Socket s;
    public  SocketTools(Socket s){
        this.s = s;
    }
    @Override
    public  void run(){
        DataOutputStream dos = null;
        DataInputStream dis = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            is = s.getInputStream();
            dis = new DataInputStream(is);
            String s1 = dis.readUTF();
            System.out.println("服务端接收到的消息为："+s1);
            os = s.getOutputStream();
            dos = new DataOutputStream(os);
            String next = "hello!客户端";
            dos.writeUTF(next);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(os!=null){
                    os.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(dis!=null){
                    dis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(s!=null){
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
