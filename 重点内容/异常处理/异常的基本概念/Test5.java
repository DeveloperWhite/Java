package 异常处理.异常的基本概念;

public class Test5 {
    // public static void main(String[] args)throws ClassNotFoundException {
    // //   第一种处理异常方式：在方法声明的位置上使用throws关键字向上抛出异常
    //          doSome();
    // }
    //上抛类似于推卸责任
    //捕捉之后这个异常就没了
    public static void main(String[] args) {
        //第二种处理异常的方式：在方法内部使用try...catch...进行补充
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome方法执行了");
    }
}