package never.doTest.servelet;

import never.doTest.BO.MyRequest;
import never.doTest.BO.MyResponse;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月29日 18:56
 */
public class testDemo {
    public static void main(String[] args) {
        String path ="never.doTest.servelet.MyServer";
        Class<?> aClass = null;
        try {
            aClass = Class.forName(path);
            Object o = aClass.newInstance();
            aClass.getMethod("doServer", MyRequest.class, MyResponse.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
