package 异常处理.异常的基本概念;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import final关键字.finalTest;
import 抽象类.abstractTest;

public class Test6 {
    public static void main(String[] args) {
        //try...catch深入
        //catch后面的小括号里可以是具体的异常类型，也可以是异常类型的父类类型
        //catch可以写多个，建议写catch的时候精确的一个一个处理
        //catch写多个的时候，从上到下必须遵循从小到大
        //因为如果大的写在上面，包含了小的异常，那么小的异常就捕获不到了，编译器会报错
        //总之，异常处理，如何选择上报还是捕捉
        //如果希望调用者来处理，选择throws上报，其余使用捕捉

        // try{
        //     FileInputStream fis = new FileInputStream("a.txt"); 
        //     System.out.println("以上出现异常这里的的代码不会执行");
        // }catch(FileNotFoundException e){
        //     System.out.println("文件找不到");
        // }
        // try{
        //     FileInputStream fis = new FileInputStream("a.txt"); 
        //     System.out.println("以上出现异常这里的的代码不会执行");
        // }catch(IOException e){//多态：父类型引用指向子类型对象
        //     //IOException e = new FileNotFoundException();
        //     System.out.println("文件找不到");
        // }
        // try{
        //     FileInputStream fis = new FileInputStream("a.txt"); 
        //     System.out.println("以上出现异常这里的的代码不会执行");
        // }catch(Exception e){//多态：父类型引用指向子类型对象
        //     //Exception e = new FileNotFoundException();
        //     System.out.println("文件找不到");
        // }
        try{
            //创建输入流对象
            FileInputStream fis = new FileInputStream("a.txt");
            //读取文件，这边也会报异常，所以下面也要执行catch
            fis.read(); 
            System.out.println("以上出现异常这里的的代码不会执行");
            }catch(FileNotFoundException e){
                System.out.println("文件找不到");
            }catch(IOException e){
                System.out.println("读取文件异常");
            }
        try{
            //Java8新特性
            //创建输入流对象
            FileInputStream fis = new FileInputStream("a.txt");
            //这里是运行时异常,编写程序时可以处理也可以不处理
            System.out.println(100/0); 
            //这里采用或者的关系处理异常，｜代表或者的关系
            }catch(FileNotFoundException | ArithmeticException e){
                System.out.println("文件找不到,或者除0异常都有可能发生");
            }

    }
}
