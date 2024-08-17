package 异常处理.异常的基本概念;

public class Test4 {
    public static void main(String[] args) {
        //现在在main方法中调用doSome方法
        //因为doSome方法中抛出了异常ClassNotFoundException
        //所以在调用doSome方法时需要预先处理异常
        //如果不处理异常，编译器会报错
        //doSome方法之所以报错，因为doSome方法声明的位置上用了throws ClassNotFoundException
        //而ClassNotFoundException是编译时异常，所以编译器会报错
        doSome();
    }
    //定义一个dosome方法，使用throws关键字抛出异常
    //在doSome方法执行的过程中，会出现ClassNotFoundException异常，又叫类找不到异常
    //这个异常父类是Exception，属于编译时异常
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome方法执行了");
    }
}
