package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月06日 9:13
 */
public class IOTest05 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test1.jpg");
        File f2 = new File("fileDirectory"+ File.separator+"writer05.jpg");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(f1);
            fos = new FileOutputStream(f2);
            byte[] bt = new byte[1024*6];
            int n = fis.read(bt);
            int num = 0;
            while(n!=-1){
                fos.write(bt,0,n);
                n= fis.read(bt);
                num++;
            }
            System.out.println("num:"+num);
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
