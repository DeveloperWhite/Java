package 异常处理.异常的基本概念;

public class Test7 {
    //异常对象最重要的方法
    public static void main(String[] args) {
        //获取异常的简单描述信息
        //String msg = e.getMessage();
        //打印异常追踪的堆栈信息
        //exception.printStackTrace();
        NullPointerException e = new NullPointerException("空指针异常");
        System.out.println(e.getMessage());
        //打印异常追踪的堆栈信息
        e.printStackTrace();

    }
}
