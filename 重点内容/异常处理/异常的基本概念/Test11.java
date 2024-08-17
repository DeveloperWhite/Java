package 异常处理.异常的基本概念;

public class Test11 {
    public static void main(String[] args) {
        //虽然说在return后面的finally语句块可以执行
        //但是如果退出JVM，finally语句块不会执行
        try{
            System.out.println("程序正常结束");
            //退出JVM
            System.exit(0);
        }finally{
            System.out.println("程序可以执行");
        }
    }
}
