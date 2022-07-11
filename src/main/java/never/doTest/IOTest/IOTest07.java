package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月06日 15:50
 */
public class IOTest07 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test01.txt");
        File f2 = new File("fileDirectory"+ File.separator+"writer07.txt");
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            int n = br.read();
            while(n!=-1){
                bw.write(n);
                n = br.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bw!=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
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
