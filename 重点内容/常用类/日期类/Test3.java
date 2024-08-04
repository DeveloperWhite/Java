package 常用类.日期类;

import java.sql.Date;
import java.text.SimpleDateFormat;

import final关键字.D;

public class Test3 {
    public static void main(String[] args) {
        //下面是这个时间1970年1月1日00:00:00:001
        Date date=new Date(1);//参数是毫秒数
        //日期格式化，按照指定格式输出，Date转化成String
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS");
        String str=sdf.format(date);
        System.out.println(str);
        //获取昨天此时的时间，总毫秒数减去一天的毫秒数
        //获取今天此时的时间
        Date date2=new Date(System.currentTimeMillis());
        String str2=sdf.format(date2);
        Date date1=new Date(System.currentTimeMillis()-24*60*60*1000);
        String str1=sdf.format(date1);
        System.out.println(str2);
        System.out.println(str1);
        
    }
}
