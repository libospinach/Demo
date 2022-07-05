package never.doTest.IOTest;

import java.io.File;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月05日 11:24
 */
public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("fileDirectory"+ File.separator+"test01.txt");
        File f2 = new File("fileDirectory");
        if(f1.exists()){
           if(f1.isFile()){
               System.out.println("存在f1文件");
           }
        }
        if(f2.exists()){
            if(f2.isDirectory()){
                System.out.println("存在f2文件夹");
                File[] files = f2.listFiles();
                int i=1;
                for(File f:files){
                    System.out.println(i+":"+f.getName());
                    i++;
                }
            }
        }
        System.out.println("f1的决对路径为："+f1.getAbsolutePath());
        System.out.println("f1的相对路劲为："+f1.getPath());
        System.out.println("f1的名字为:"+f1.getName());

        System.out.println("f2的决对路径为："+f2.getAbsolutePath());
        System.out.println("f2的相对路劲为："+f2.getPath());
        System.out.println("f2的名字为:"+f2.getName());

        System.out.println("f1的父路劲为"+f1.getParent());
        System.out.println("f2的父路劲为"+f2.getParent());

    }
}