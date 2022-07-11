package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月07日 11:02
 */
public class IOTest10 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test01.txt");
        File f2 = new File("fileDirectory"+ File.separator+"writer10.txt");
//        File f1 = new File("fileDirectory"+ File.separator+"test1.jpg");
//        File f2 = new File("fileDirectory"+ File.separator+"writer10.jpg");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            fis = new FileInputStream(f1);
            fos = new FileOutputStream(f2);
            isr = new InputStreamReader(fis);
            osw = new OutputStreamWriter(fos);
//            int n = isr.read();
//            while(n!=-1){
//                osw.write(n);
//                n = isr.read();
//            }
            char[] ch = new char[1024*7];
            int n = isr.read(ch);
            int num = 0 ;
            while(n!=-1){
                osw.write(ch,0,n);
                n=isr.read(ch);
                num++;
            }
            System.out.println("num:"+num);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(osw!=null){
                    osw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(isr!=null){
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
