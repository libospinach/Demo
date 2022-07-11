package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月07日 10:55
 */
public class IOTest08 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test01.txt");
        File f2 = new File("fileDirectory"+ File.separator+"writer08.txt");
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            char[] ch = new char[80];
            int n = br.read(ch);
            while(n!=-1){
                bw.write(ch,0,n);
                n=br.read(ch);
            }
        } catch (FileNotFoundException e) {


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
