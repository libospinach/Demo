package never.doTest.IOTest;

import java.io.*;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月07日 11:02
 */
public class IOTest09 {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test01.txt");
        File f2 = new File("fileDirectory"+ File.separator+"writer09.txt");
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String s = br.readLine();
            int num = 0 ;
            while(s!=null){
                bw.write(s);
                bw.newLine();
                s= br.readLine();
                num++;
            }
            System.out.println("num:"+num);
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
