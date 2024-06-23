

public class Test7 {
    //数据类型  整型
    /*
     java中编写整数型字面值一般有三种表示方式：
     1.十进制：一种缺省默认的方式
     2.八进制：要在开头加上0
     3.十六进制：在开头加上0x
     数据类型    取值范围
     byte      -128--127
     short    -32768--32767
     int     -2147483648-2147483647
     long
     计算机二进制三种表现形式
     原码
     反码
     补码
     正数的补码和原码相同
     负数的补码：负数绝对值对应的二进制码，所有二进制取反再加一
     */
    public static void main(String[] args) {
        int a=10;//10
        int b=010;//8
        int c=0x10;//16
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b+c);
        //123默认为int类型，i定义为int类型，所以int类型的123赋值给int类型的变量i
        int i=123;
        System.out.println(i);
        //456是int类型，变量j定义为long类型，int类型的456赋值给long类型的j
        //int类型是小容量，long类型是大容量，小容量可自动转化为大容量，称为自动类型转换
        long j=456;
        System.out.println(j);
        //编译错误long i=2147483648；
        // 2147483648超过int类型的取值范围，和赋值给long没有关系
        //解决方法：在2147483648后加上L即可把数字的int类型在开始就转化为long类型
        //以下程序不存在类型转换
        long k=2147483648L;
        System.out.println(k);
        //大容量不能直接赋值给小容量，需要进行强制类型转换，但仍会损失精度
        // 100L是long类型赋值给long
        long m=100L;
        //long类型的m强转为int类型在赋值给int类型的y
        int y= (int)m;//强制类型转化：在前面加上（转换类型）
        System.out.println(y);
        //byte l=128;会报错，128是int数据类型赋值给byte数据类型但超过byte数据类型的范围，
        // 大容量赋值给小容量必须强转，会损失精度导致误差较大
        byte l=(byte)128;
        System.out.println(l);
    }
}

