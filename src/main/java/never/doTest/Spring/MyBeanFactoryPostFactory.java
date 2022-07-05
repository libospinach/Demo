package never.doTest.Spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanFactoryPostFactory implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        ClassPathXmlApplicationContext xmlContext=new ClassPathXmlApplicationContext("aa.xml");

    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlContext=new ClassPathXmlApplicationContext("aa.xml");
    }

}
