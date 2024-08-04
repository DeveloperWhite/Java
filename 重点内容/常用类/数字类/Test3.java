package 常用类.数字类;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //随机数，产生随机数，创建随机数对象
        Random r = new Random();
        //随机产生一个int取值范围的整数
        int i = r.nextInt();
        System.out.println(i);
        //随机产生一个int取值范围的整数，范围是[0,100]，不能产生101
        int j = r.nextInt(101);
        System.out.println(j);
    }
}
