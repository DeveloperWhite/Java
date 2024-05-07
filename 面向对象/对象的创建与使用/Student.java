package 对象的创建与使用;

public class Student {
    //定义一个类，类名student，代表所有学生对象，是一个学生模板
    //面向对象
    /*
    面向对象的三大特征：
    封装
    继承
    多态
    采用面向对象的方式开发一个软件：(专业术语要记住)
    面向对象的分析：OOA
    面向对象的设计：OOD
    面向对象的编程：OOP
    类和对象的概念：
    类：在现实世界中不存在，是一个模版，是一个概念，是人大脑抽象出来的东西，
    代表了一类事物，在现实世界中，对象A和对象B拥有共同的特征，进行抽象总结出的一个模板，这个模板称为类
    对象：是实际存在的个体，现实世界中实际存在
    软件开发的整个过程：
    观察现实世界，找出对象
    寻找了N个对象后，找出其共同特征
    程序员在大脑中形成一个模板（类）
    java代码来表述这个类
    java程序中有了类的定义
    通过类创建对象
    有了对象之后，让所有对象协作起来，产生一个完整的系统

    1.类的定义：
    语法结构：
    [修饰符列表] class 类名{、

    }
    数据类型：
    基本数据类型：
    byte
    short
    int
    long
    ....
    引用数据类型：
    String
    student
    System
    user
    customer
    Product
    .......
    能够定义：
    String address=....
    student s=......

    2.对象的创建与使用
    属性：变量定义在类体之中，方法体之外，这种变量称为成员变量
    通过一个类可以实例化N个对象
    实例化对象的语法：new 类名（）;
    new是java语言中的一种运算符
    作用为：创建对象，在JVM的堆内存当中开辟新的内存空间
    方法区内存空间：在类加载的时候，class字节码代码片段被加载到该内存空间中
    栈内存空间（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
    堆内存：new的对象在堆内存中存储
    Student s=new Student();
    Student是一个引用数据类型，s是一个变量名（称为引用），new Student（）是一个学生对象
    s作为局部变量，在栈内存中存储，它存放的是new Student（）在堆内存中存放的地址
    对象：new运算符在堆内存中开辟的新的空间
    引用：引用是一个变量，只不过这个变量保存着另一个对象的内存地址
    在Java语句中程序员只能通过引用去访问堆内存中对象内部的实例变量
    访问实例变量的语法：
    读取数据：引用.变量名
    修改数据：引用.变量名=值
    局部变量在栈内存中存储
    成员变量中的实例变量在java对象内部存储，而new的对象在堆内存中存储，即成员变量中的实例变量存储在堆内存当中
    变量分类：
    局部变量:在方法体中声明
    成员变量:在方法体外声明
    成员变量又分为：
    实例变量（类体中定义的变量，比如下面Student类中的num学号变量）：前边修饰符没有static
    静态变量：前边修饰符有static
    静态变量存储在方法区内存当中
    三块存储中变化最频繁的是栈内存，最先有数据的是方法区内存，垃圾回收器主要针对的是堆内存
    垃圾回收器：（自动垃圾回收机制 GC机制）
    在堆内存中Java对象成为垃圾数据的时候，即没有更多引用指向他的时候，垃圾回收器会考虑将该Java对象回收
     */
    //学号
    int num;
    //姓名
    String name;
    //性别
    boolean sex;
    //年龄
    int age;
    //住址
    String address;

    public static void main(String[] args) {
        Student s=new Student();//new开辟新的内存空间，创建对象
        //访问对象中的实例变量
        /*
        int stuNum=s.num;
        String stuName=s.name;
        int stuAge=s.age;
        boolean stuSex=s.sex;
        String stuAddress=s.address;
         */
        //也可以换一种写法
        System.out.println(s.num);
        System.out.println(s.name);
        System.out.println(s.sex);
        System.out.println(s.age);
        System.out.println(s.address);
        //修改对象实例变量
        s.num=100;
        s.name="zhangSan";
        s.age=22;
        s.sex=true;
        s.address="nanTong";
        System.out.println(s.num);
        System.out.println(s.name);
        System.out.println(s.sex);
        System.out.println(s.age);
        System.out.println(s.address);
        //通过类实例化一个全新的对象，相当于在堆内存中开辟一处新地区，创建新对象
        Student stu=new Student();
        System.out.println(stu.num);
        System.out.println(stu.name);
        System.out.println(stu.sex);
        System.out.println(stu.age);
        System.out.println(stu.address);
    }
}
