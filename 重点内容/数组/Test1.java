package 数组;

import java.security.Principal;

//数组
/*
1.JAVA语言中的数组是一种引用数据类型，不属于基本数据类型，数组的父类是Object类
2.数组是一个容器，可以同时容纳多个元素
3.数组当中可以存储基本数据类型的数据，也可以存储引用数据类型的元素
4.数组是引用类型，所以数组对象是在堆内存当中的(数组是存储在堆当中的)
5.数组中如果存储的是Java对象的话，实际上存储的是对象的：引用(内存地址)，数组中不能直接存储Java对象
6.数组一旦创建，Java中规定，长度不可变
7.数组的分类：一维数组，二维数组，三维数组，多维数组.......
8.所有数组对象中都有length属性(Java自带的)用来获取数组中元素的个数
9.Java中的数组要求数组中的元素类型统一，比如int类型的数组只能存储int类型的数据
10.数组存储元素时，元素内存地址连续，实际上是一种简单的数据机构
11.数组中首元素的内存地址，作为整个数组对象的内存地址
12.数组中每一个元素都是有下标的，下标从0开始以1递增，最后一个元素的下标是length-1，对元素进行存取的时候都要通过下标来进行
13.int 基本数据类型，int[]，person[]是引用数据类型
14.数组的优点：检索效率高：因为数组的每一个元素在数组上存储是连续的，元素类型相同，
所以每一个元素的占用空间大小一样，知道第一个元素的内存地址空间，就能直接定位到任意一个数组元素的地址，检索效率高
15.数组的缺点：由于连续存储，所以在删除元素，增加元素时，效率很低，不能存储大数据，很难找到一块连续的大内存空间
定义一个一维数组：
int array1 []这种是c++的写法不建议
int [] array1;
double [] array2;
boolean [] array3;
String [] array4;
初始化一维数组：
静态初始化：int [] array1={100，200，300};
动态初始化：int [] array1=new int[5];这里的5表示数组的元素个数，初始化一个5个元素的数组，每个元素默认值为0
* */
public class Test1 {
//  这里面定义的数组的形式是c++的写法
  public static void main(String[] args) {
//    当创建数组的时候确定数组中具体存储哪些数组元素时用静态,不确定数组中存储哪些数据时,采用动态,预先分配空间
//    静态初始化一维数组
//    使用静态初始化方式，声明一个int类型的数组
    int [] a1={100,200,300};
//    输出数组长度
    System.out.println(a1.length);
//    通过下标对元素中的下标进行存取
//    取
    System.out.println(a1[0]);
    System.out.println(a1[a1.length-1]);
//    改
    a1[0]=111;
    System.out.println(a1[0]);
//一维数组的遍历
    for(int i=0;i<a1.length;i++){
      System.out.println(a1[i]);
    }
//    System.out.println(a1[6]);会出现一个著名的异常,数组下标越界异常
//    从最后一个元素遍历到第一个元素
    for(int i= a1.length-1;i>=0;i--){
      System.out.println(a1[i]);
    }



//    动态初始化一维数组
    int[] a2=new int[4];
//    遍历数组
    for(int i=0;i<a2.length;i++){
      System.out.println(a2[i]);
    }
//    字符串
    String[] a3=new String[4];
//    遍历数组
    for(int i=0;i<a3.length;i++){
      System.out.println(a3[i]);
    }
//    调用数组遍历方法
//    静态：int [] a5={100,200,300};
//    printArray(a5);
//    另一种简化，不能直接写后面大括号：
//    printArray(new int[]{100,200,300});
//    动态：
    printArray(new int[6]);
//    查看main方法中的String args[]数组有什么用，数组长度默认为0
    System.out.println("JVM给传递过来的String数组参数的数组长度："+args.length);
    //  创建一个长度为0的String数组对象，并输出他的长度
    String[] strs=new String[0];
//    以下代码表示数组对象创建了，但数组中没有任何数据
//    String[] strs={};
    printLength(strs);
//    例如这样运行，java Test1 abc xyz def ，这个时候JVM就会自动将abc def xyz 通过空格的方式分离，然后自动放到String数组中，主要用来收集用户参数
//    main方法上面的String数组主要用来接受用户输入参数
    //    遍历数组输入main中String数组
    for(int i=0;i< args.length;i++){
      System.out.println(args[i]);
    }
  }

  public static void printArray(int[] a4){
    for(int i=0;i<a4.length;i++){
      System.out.println(a4[i]);
    }
  }
  //打印String数组长度的方法
  public static void printLength(String [] args){
    System.out.println(args.length);
  }

}
