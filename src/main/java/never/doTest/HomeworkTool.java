package never.doTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeworkTool {
    public static void doWork(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Student stu=context.getBean(Student.class);
        System.out.println(stu.getName()+"开始做作业了");
        stu.doHomework();
        context.close();
    }
}
