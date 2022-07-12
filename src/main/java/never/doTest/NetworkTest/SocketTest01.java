package never.doTest.NetworkTest;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Description: socket 套接字 客户端
 * @author: Bo Li
 * @date: 2022年07月11日 18:41
 */
public class SocketTest01 {
    public static void main(String[] args) {
        Socket s = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        InputStream is = null;
        DataInputStream dis = null;
        try {
            System.out.println("客户端发送信息");
            s = new Socket("localhost", 8888);
            os = s.getOutputStream();
            dos = new DataOutputStream(os);
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入发送到服务端的信息：");
            String next = sc.next();
            dos.writeUTF(next);
            is = s.getInputStream();
            dis = new DataInputStream(is);
            String s1 = dis.readUTF();
            System.out.println("客户端收到服务端返回的参数为："+s1);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
                if(s!=null){
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
