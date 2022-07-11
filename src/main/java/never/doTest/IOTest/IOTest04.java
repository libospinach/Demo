package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月06日 9:05
 */
public class IOTest04 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test1.jpg");
        File f2 = new File("fileDirectory"+ File.separator+"writer04.jpg");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(f1);
            fos = new FileOutputStream(f2);
            int n = fis.read();
            while(n!=-1){
                fos.write(n);
                n= fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
