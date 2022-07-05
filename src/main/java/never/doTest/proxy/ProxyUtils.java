package never.doTest.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProxyUtils {
    public static void generateClassFile(Class clazz,String proxyName){
        byte[] classFile= ProxyGenerator.generateProxyClass(proxyName,clazz.getInterfaces());
        String paths=clazz.getResource(".").getPath();
        System.out.println("paths；"+paths);
        FileOutputStream fio=null;
        try {
            fio=new FileOutputStream(paths+proxyName+".class");
            fio.write(classFile);
            fio.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fio.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
