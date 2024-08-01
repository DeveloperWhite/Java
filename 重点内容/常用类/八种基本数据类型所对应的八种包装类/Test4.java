package 常用类.八种基本数据类型所对应的八种包装类;

public class Test4 {
    public static void main(String[] args) {
        //java中为了提高程序执行的效率，将[-128,127]之间的包装对象提交创建好，
        //放到方法区的整数型常量池中了，目的是只要运用到这个区间的数据不需要在new了，
        //直接从方法区中取出来用就可以了
        //这里127中i和j指向的是同一个对象，保存的内存地址是同一个，不是新创建的
        //＝＝永远是对象的内存地址比较＊＊＊
        Integer i = 127;
        Integer j = 127;
        System.out.println(i==j);//true
        Integer k = 128;
        Integer l = 128;
        System.out.println(k==l);//false
    }
}
