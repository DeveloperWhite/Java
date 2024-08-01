package 常用类.八种基本数据类型所对应的八种包装类;
// 在JDK 1.5之后，Java提供了自动装箱和自动拆箱的功能，
// 使得基本数据类型和包装类之间的转换变得非常方便。

public class Test3 {
    public static void main(String[] args) {
        // 基本数据类型能直接赋值给包装类
        // 自动装箱：基本数据类型能直接自动转化成引用数据类型
        Integer i = 100;
        System.out.println(i);
        // 自动拆箱：引用数据类型能直接自动转化成基本数据类型
        int j = i;
        System.out.println(j);
        Integer k = 1000;
        //为什么下面直接运算没有报错，上面是对象，对象如何进行数字的运算，
        //因为自动拆箱了，转化为基本数据类型
        System.out.println(k+1);
        //因为下面是对象，保存的是对象的地址，所以地址不一样，所以是false
        //相当于Integer l = new Integer(1000);
        Integer l = 1000;
        Integer m = 1000;
        //＝＝比较的是对象的内存地址，所以是false
        //＝＝不会触发自动拆箱，所以只会进行对象内存地址的比较
        System.out.println(l==m);//false
    }
}
