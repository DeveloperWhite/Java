package 异常处理.异常的基本概念;

public class Test10 {
    //finally语句块
    public static void main(String[] args) {
        //try和finally语句块一起使用，没有catch语句块
        //return语句只要执行方法结束
        //所以执行不到在外面的System.out.println("程序执行不到这里");
        //以下代码的执行顺序
        //1.执行try语句块
        //2.执行finally语句块
        //3.执行return语句
        try{
            System.out.println("程序正常结束");
            return;
        }finally{
            System.out.println("程序可以执行");
        }
        // System.out.println("程序执行不到这里");
    }
}
