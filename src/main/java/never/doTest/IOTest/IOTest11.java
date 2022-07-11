package never.doTest.IOTest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月07日 17:01
 */
public class IOTest11 {
    public static void main(String[] args) {
        InputStream in = System.in;
        BufferedInputStream bis =new BufferedInputStream(in);
        int n = 0;
        try {
            n = bis.read();
            while(n!=-1){
                System.out.println((char)n);
                n=bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
