package 常用类.日期类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //java中对日期的处理
        //获取系统当前时间(精确到毫秒)
        Date nowTime=new Date();
        System.out.println(nowTime);
        //日期格式化，按照指定格式输出
        // SimpleDateFormat是java.text包下的一个类，专门用于日期格式化
        //SimpleDateFormat sdf=new SimpleDateFormat(指定日期格式);
        // yyyy年
        // MM月
        // dd日
        // HH时
        // mm分
        // ss秒
        // SSS毫秒（1000毫秒代表1秒，所以最高999，三位）
        //这边是有Date类型转化成String类型
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS");
        String str=sdf.format(nowTime);
        System.out.println(str);
        //日期字符串（String）类型转Date类型
        String str1="2020年05月01日 12:12:12:123";
        //SimpleDateFormat sdf1=new SimpleDateFormat("这里日期的格式要与String类型日期的格式一致");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS");
        //有一个方法parse(String str)将String类型日期转化成Date类型
        Date date=sdf1.parse(str1);
        //上面的parse方法会抛出异常，所以需要在上面加上throws Exception
        System.out.println(date);
    }
}