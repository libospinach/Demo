package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月06日 9:19
 */
public class IOTest06 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test1.jpg");
        File f2 = new File("fileDirectory"+ File.separator+"writer06.jpg");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(f1);
            fos = new FileOutputStream(f2);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] bt = new byte[1024*8];
            int len = bis.read(bt);
            while(len!=-1){
                bos.write(bt,0,len);
                len = bis.read(bt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bis!=null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
