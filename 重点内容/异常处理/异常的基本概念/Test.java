package 异常处理.异常的基本概念;

public class Test {
    public static void main(String[] args) {
        //什么是异常
        //下面的异常信息是JVM自动打印的
        //Exception in thread "main" java.lang.ArithmeticException:
        //上面报错就是异常,这是一种异常处理机制
        //程序执行过程中,发生了不正常的情况,这种不正常的情况叫异常
        //java语言是很完善的语言，提供了异常处理方法，下面程序出现异常
        //java就把异常信息打印输出到控制台，供程序员参考

        // int a=10;
        // int b=0;
        // int c=a/b;
        // System.out.println(c);
        //程序员看到异常信息，就知道程序出现异常，然后修改程序
        int a=10;
        int b=0;
        if(b==0){
            System.out.println("除数不能为0");
        }else{
            int c=a/b;
            System.out.println(c);
        } 
        
    }
}
