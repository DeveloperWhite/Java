package 异常处理.异常的基本概念;

public class Test2 {
    public static void main(String[] args) {
        //java语言中异常是以什么形式存在的
        //异常在java语言中是以类和对象的形式存在的
        //通过异常类实例化异常对象
        NumberFormatException e = new NumberFormatException("数字格式化异常");
        System.out.println(e);
        //java.lang.NumberFormatException: 数字格式化异常
        //再通过异常类实例化异常对象
        NullPointerException e1 = new NullPointerException("空指针异常");
        System.out.println(e1);
        //java.lang.NullPointerException: 空指针异常
        int a=10;
        int b=0;
        //JVM执行到此处，会new一个异常对象，然后把异常对象抛出,打印输出到控制台
        int c=a/b;  
        System.out.println(c);
        //到此处，又会new一个异常对象，然后把异常对象抛出,打印输出到控制台
        System.out.println(10/0);

        


        


   




        




        
    }
    
}
