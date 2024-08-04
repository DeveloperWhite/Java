package 常用类.数字类;

import java.math.BigDecimal;

import final关键字.B;

public class Test2 {
    public static void main(String[] args) {
        //BigDecimal：大数据，不属于基本数据类型，属于引用数据类型(java对象)
        //BigDecimal是java.math包下专门用来处理大数字的类
        //财务软件中不能使用int和double，因为它们无法满足财务软件中精确计算的需求
        //BigDecimal类中提供了精确计算的方法，财务软件中可以使用
        BigDecimal bd1 = new BigDecimal(100);
        //这个100不是普通的100，而是精度极高的100
        BigDecimal bd2 = new BigDecimal(200);
        //精度极高的200
        //加法，不能直接使用+，因为+是字符串的连接符，要用到BigDecimal类中的方法(add)
        BigDecimal add1 = bd1.add(bd2);
        System.out.println(add1);
        //除法等系列方法
        BigDecimal div1 = bd1.divide(bd2);
        System.out.println(div1);
    }
    
}
