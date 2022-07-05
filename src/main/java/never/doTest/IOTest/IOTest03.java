package never.doTest.IOTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月05日 18:21
 */
public class IOTest03 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test01.txt");
        File f2 = new File("fileDirectory"+ File.separator+"writer03.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);
            char[] ch = new char[6];
            int n = fr.read(ch);
            while(n!=-1){
                String s = new String(ch,0,n);
                fw.write(s);
                n = fr.read(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fw!=null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
