package never.doTest.IOTest;

import never.doTest.BO.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月08日 15:31
 */
public class IOTest12 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(11);
        person.setSex("男");
        person.setName("小明");
        person.setIDCard("新的IDCard");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("fileDirectory"+ File.separator+"writer12.txt"));
            oos= new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
