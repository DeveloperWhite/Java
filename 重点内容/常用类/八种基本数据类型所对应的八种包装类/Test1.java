package 常用类.八种基本数据类型所对应的八种包装类;

public class Test1 {
    public static void main(String[] args) {
//java中有八种基本数据类型，每种基本数据类型都有对应的包装类，均是引用数据类型，父类是Object
//下面有dosome方法，传入的是Object类型，但是我们需要传入基本数据类型，所以需要用到基本数据类型所对应的包装类
//把100这个数字包装成Integer类型
// 基本数据类型      对应的包装类
// byte              Byte
// short             Short
// int               Integer
// long              Long
// float             Float
// double            Double
// char              Character
// boolean           Boolean
// 以上八种基本数据类型的包装类中以Integer为例进行学习,Number类是integer类的父类    
       //123基本数据类型进行构造方法的包装，达到了基本数据类型向引用数据类型转换的目的
       //将基本数据类型包装成引用数据类型（装箱）
    //    Number类中有这样一些方法
    // bytevalue()以byte类型返回该Number的值/
    // shortvalue()以short类型返回该Number的值
    // intvalue()以int类型返回该Number的值
    // longvalue()以long类型返回该Number的值
    // floatvalue()以float类型返回该Number的值
    // doublevalue()以double类型返回该Number的值
    // charvalue()以char类型返回该Number的值
    // booleanvalue()以boolean类型返回该Number的值
    //斜杠划掉表示过时被弃用的方法
        Integer integer=new Integer(123);
        //将引用数据类型转换成基本数据类型（拆箱） 
        Float i=integer.floatValue();
        System.out.println(i);
        //将引用数据类型转换成基本数据类型
        int j=integer.intValue();
        System.out.println(j);
        // 关于integer的构造方法
        // Integer(int);
        // Integer(String);
        Integer integer1=new Integer(123);
        Integer integer2=new Integer("123");
        System.out.println(integer1);
        System.out.println(integer2);
    }
    public static void dosome(Object obj){
        System.out.println(obj);
    }
}
