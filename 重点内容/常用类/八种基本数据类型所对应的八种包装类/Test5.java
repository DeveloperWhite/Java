package 常用类.八种基本数据类型所对应的八种包装类;

public class Test5 {
    public static void main(String[] args) {
        // Integer类中常用的方法有：
        // 手动装箱
        Integer i = new Integer(100);
        // 自动装箱
        Integer i1 = 100;
        // 手动拆箱
        int j = i.intValue();
        System.out.println(j);
        // 自动拆箱
        int k = i1;
        System.out.println(k);
        Integer l = new Integer("123");
        // 字符串至少也的是数字，不是数字不能包装成Integer，下面会报错
        //Integer m= new Integer("中文");
        //System.out.println(m);
        //重点方法parseInt(String s)：将字符串解析成int类型，传参String，返回int
        // 在网页上输入的123往往是字符串，所以，在数据库中要求存储数字，
        // 需要将字符串解析成int类型
        int n = Integer.parseInt("123");
        //字符串中文解析成int类型会报错，数字格式化异常
        //int o = Integer.parseInt("中文");
        System.out.println(n+123);///246
        // ..............................................................
        //以下内容作为了解，不需要掌握，都是静态方法
        //static String toBinaryString(int i)：将int类型十进制转换成二进制字符串
        String s = Integer.toBinaryString(3);
        System.out.println(s);
        //static String toHexString(int i)：将int类型十进制转换成十六进制字符串
        String t = Integer.toHexString(16);
        System.out.println(t);
        //static String toOctalString(int i)：将int类型十进制转换成八进制字符串
        String u = Integer.toOctalString(8);
        System.out.println(u);
        //静态的valueOf(String s)：int类型也可以转，将String类型转化成Integer，作为了解
        Integer v = Integer.valueOf("123");
        Integer w = Integer.valueOf(123);
        System.out.println(v);
        System.out.println(w); 
        //总结
        // String转int：Integer.parseInt(String)
        // int转String：String.valueOf(int)
        // Integer转String：String.valueOf(Integer) 
        // String转Integer：Integer.valueOf(String)
        // int转Integer：装箱，也可以用方法:Integer.valueOf(int)
        // Integer转int：拆箱,也可以用方法:intValue()








    }
}
