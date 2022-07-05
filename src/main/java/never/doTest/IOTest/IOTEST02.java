package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月05日 14:56
 */
public class IOTEST02 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test01.txt");
        File f2 = new File("fileDirectory"+ File.separator+"writer02.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);
            char[] ch = new char[5];
            int n;
            while((n = fr.read(ch))!=-1){
                fw.write(ch,0,n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
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
