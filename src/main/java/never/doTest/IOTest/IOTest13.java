package never.doTest.IOTest;

import never.doTest.BO.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月11日 14:25
 */
public class IOTest13 {
    public static void main(String[] args) {

        ObjectInputStream osm = null;
        try {
            osm = new ObjectInputStream(new FileInputStream("fileDirectory"+ File.separator+"writer12.txt"));
            Person person = (Person) osm.readObject();
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(osm!=null){
                    osm.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
