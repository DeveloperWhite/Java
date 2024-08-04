package 常用类.数字类;

import java.text.DecimalFormat;

import final关键字.D;

public class Test {
    public static void main(String[] args) {
        //DecimalFormat专门负责数字格式化
        //DecimalFormat df=new DecimalFormat("数字格式");
        //数字格式有哪些
        //# 代表任意数字
        //. 代表任意小数点
        //, 代表千分位
        //0 代表不够时补0
        //表示加入千分位，保留两位小数
        DecimalFormat df=new DecimalFormat("###,###.##");
        //给个数字转化成String
        String s=df.format(123456789.123456789);
        System.out.println(s);
        DecimalFormat df2=new DecimalFormat("###,###.0000");
        String s2=df2.format(123456789.12);
        System.out.println(s2);
        


         
    }
}
