package never.doTest.servelet;

import never.doTest.BO.MyRequest;
import never.doTest.BO.MyRequestMapping;
import never.doTest.BO.MyResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月29日 10:39
 */
public class MyServerSocket {
    private static int prot = 8026;
    private static Boolean flag = true;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(prot);
            while(flag){
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                MyRequest myRequest = new MyRequest(inputStream);
                OutputStream outputStream = socket.getOutputStream();
                MyResponse myResponse = new MyResponse(outputStream);
                //根据url获取映射类
                String classPath = new MyRequestMapping().get(myRequest.getRequestUrl());
                System.out.println("classPath:"+classPath);
                if(!("".equals(classPath)||classPath == null)){
                    Class aClass = Class.forName(classPath);
                    Object o = aClass.newInstance();
                    Method server = aClass.getMethod("doServer",MyRequest.class,MyResponse.class);
                    server.invoke(o,myRequest,myResponse);
                }
//                Class<MyServer> Clazz = (Class<MyServer>) Class.forName(classPath);
//                MyServer o = Clazz.newInstance();
//                o.server(myRequest,myResponse);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
