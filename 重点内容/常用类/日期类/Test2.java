package 常用类.日期类;

public class Test2 {
    public static void main(String[] args) {
        //获取自1970年1月1日00:00:00以来的毫秒数
        //1秒等于1000毫秒
        long time=System.currentTimeMillis();
        System.out.println(time);
        method();
        //简单总结一下System的方法
        //System.out（out是System类的静态变量）
        //后面的()是方法，没有的是属性
        //System.out.println();(print（）方法不是System类的，是PrintStream类的)
        //System.exit(0);退出虚拟机
        //System.gc();垃圾回收
        //System.currentTimeMillis();获取自1970年1月1日00:00:00以来的毫秒数
        //System.arraycopy();数组拷贝

    }
    //需求：统计一个方法执行了多少毫秒
    public static void method(){
        //开始多少秒
        long start=System.currentTimeMillis();
        for (int i = 0; i <1000000000 ; i++) {
        }
        //结束多少秒，相减得到执行了多少毫秒
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
