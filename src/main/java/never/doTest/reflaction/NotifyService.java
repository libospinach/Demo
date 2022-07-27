package never.doTest.reflaction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月25日 14:05
 */
public class NotifyService implements Notify {

    @Override
    public void notice(Object obj) {
        Class cls = obj.getClass();
        Object o = null;
        try {
            o = cls.newInstance();
            Method doPay = cls.getMethod("doPay");
            doPay.invoke(o);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
