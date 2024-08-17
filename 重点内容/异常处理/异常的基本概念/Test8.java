package 异常处理.异常的基本概念;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    public static void main(String[] args) {
        try
        {
            test();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            //打印异常追踪的堆栈信息
            e.printStackTrace();
            //下面是异常追踪的堆栈信息，一般从上面开始看
            //调试代码注意事项：快速定位bug位置
        // java.io.FileNotFoundException: a.txt (No such file or directory)
        // at java.base/java.io.FileInputStream.open0(Native Method)
        // at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
        // at java.base/java.io.FileInputStream.<init>(FileInputStream.java:158)
        // at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
        //到这里往上面都是sun提供的类，下面是用户自己写的类，上面不会有问题，往下面看
        //首先是22行出了问题，导致11行出问题，所以要从上往下看
        // at 异常处理.异常的基本概念.Test8.test(Test8.java:22)
        // at 异常处理.异常的基本概念.Test8.main(Test8.java:11)

        }
        //异常的捕捉能让程序继续执行，健壮性高
        System.out.println("程序继续执行");
    }
    private static void test() throws FileNotFoundException{
        new FileInputStream("a.txt");
    }
}
