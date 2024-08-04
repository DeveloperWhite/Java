package 常用类.数字类;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        //随机生成5个不重复的随机数，重复则重新生成
        //把这五个随机数存入数组，要求数组中随机数不重复
        //首先准备一个数组，用来存储随机数
        int[] arr = new int[5];
        Random r = new Random();
        //数组存放不重复随机数逻辑
        // if (数组中不包含num) {
        //     就把这个数放到数组中
        // }
        //定义一个变量，用来记录数组中已经存放的随机数的个数
        int index=0;
        while (index<arr.length) {
            //生成100以内的随机数
            int num=r.nextInt(100);
            if(!contains(arr,num)){
                arr[index]=num;
                index++;
            }
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}
//单独写一个方法，判断数组中是否包含某个数
public static boolean contains(int[] arr, int num) {
    for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            return true;
        }
    }
    return false;
}
}
