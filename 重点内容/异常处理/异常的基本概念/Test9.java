package 异常处理.异常的基本概念;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException; 

public class Test9 {
    //除了try catch之外，还可以finally语句块
    public static void main(String[] args) {
        //首先，在finally子句中的语句一定会被执行
        //finally必须与try一起使用，不能单独使用
        FileInputStream fis = null;
        try{
            //创建输入流对象
            fis = new FileInputStream("a.txt");
            //空指针异常
            String s = null;
            s.toString(); 
            //流使用完后，要关闭流，因为流是占用资源的，这边会出现IO异常
            //即使上面有异常，也要关闭流
            //但如果放在这则执行不了关闭流语句
            // fis.close();
            System.out.println("程序正常结束");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }finally{
            System.out.println("程序可以执行");
            //关闭流的代码放在这比较保险，finally语句块中的代码一定会被执行
            //因为fis是局部变量，出了try语句块就销毁了，所以要放在try语句外面去
            //又因为上面new FileInputStream()有可能异常，所以fis可能为null，导致空指针异常，所以要判断一下
            if(fis != null){
                try{
                    //close()方法有异常，采用捕捉的方式
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("程序也可以执行");
    }
}
