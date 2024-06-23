
public class Test8 {
    //浮点型
    /*
    float单精度（4个字节）
    double双精度（8个字节精度较高）
    double的精度太低，不适合做财务软件，财务涉及到钱的问题要求精度较高，
    所以有更准确的数据类型，只不过这种数据类型不是基本数据类型而是引用数据类型：java.math.BigDecimal
    java程序员基于一套强大的类库进行开发，
    java的SE类库字节码："C:\Program Files\Java\jdk-14.0.1\lib\jrt-fs.jar"
    java的SE类库的源码："C:\Program Files\Java\jdk-14.0.1\lib\src.zip"
    例如(String[] args)使用的就是String.class字节码文件
    在java中所有float型字面值默认当做double类型来处理，要想把字面值当做float类型处理，必须要在字面值之后加上F
     */
    public static void main(String[] args) {
        //3.0是double类型，a是double类型不存在类型转换
        double a=3.0;
        System.out.println(a);
        //float b=5.1;   5.1是double类型，b是float类型，大容量转换为小容量需要加上强置类型转换符
        //解决方法：第一种
        float b=(float)5.1;
        //第二种：
        float m=5.1F;
        System.out.println(b);
        System.out.println(m);
    }
}
