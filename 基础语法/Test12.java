

public class Test12 {
    //类体：建议在一个Java文件中只定义一个class，即之只定义一个类名
    //方法
    /*
    计算三个需求其实就是计算一个需求
    计算两个int类型的数据之和
    只不过每一次参与的数据不同
    则可以用到方法
    在Java中有这样一种机制
    某个功能代码只需要写一遍
    要使用这个功能，只需要给这个功能传递具体的数值
    这个功能完成之后返回一个具体地结果
    这样代码就可以重复利用，提高代码的复用性
    方法的本质:就是一段代码片段，这段代码片段可以完成相应的功能，并且可以被重复使用
    方法定义在类体当中，一个类体中可以定义多个方法，方法编写的位置没有先后之分，可以随意
    方法体中不能再定义方法，方法由Java语句编写而成，方法体中的代码遵循自上而下顺序执行
    1.方法的基础语法
    方法的定义，语法结构：
    [修饰符列表] 返回值类型 方法名 （形式参数表列）{
                方法体;
    }
     修饰符列表：先统一写成public static（以后讲）
     方法修饰符列表中有static关键字时，怎么调用这个方法？
     对于方法的修饰符列表中带有static关键字的方法，调用时，类名可以不写
     若定义另一个类名A时，则在调用时即调用其他类中的方法，不是本类，必须加上类名.方法名，类名不能省，
           类名.方法名（实际参数列表）;
     返回值类型：一个方法可以完成一个特定的功能，
     这个功能结束时会返回一个特定的结果，执行结果可能是一个具体存在的数据，
     该数据就是返回值，数据都是有类型的，此处指定的的数据的具体类型，
     包括所有的基本数据类型和引用数据类型，若没有具体的返回值类型就写void
     若不是void类型，则在方法体中必须写出return+值，并保证该值类型必须与返回值类型相同，否则就会报错
     若是void类型，在方法体中不能写return+值这样的语句，但可以写return;（作用：强行终止当前执行的方法）这样的语句
     只要带有return关键字的语句执行，return语句所在的方法结束
     方法名：
     只要是合法的标识符
     最好见名知意
     最好是动词
     方法名首字母要小写，后面每个单词首字母大写，遵循驼峰书写
     形式参数列表：
     形参是局部变量：int a ，double b等等
     形参的个数可以是多个
     多个形参间用逗号隔开
     形参中期关键作用的就是形参的数据类型，形参的名字就是局部变量的名字
     方法在调用的时候要求形参和实参的个数和数据类型对应相同
     类型不同的时候要求能够进行相应的类型转换（自动类型转换或强制类型转换）
     深入return语句：
     带有return关键字的语句只要执行，所在的方法执行结束，
     在同一个作用域下，return语句不能编写任何代码，因为这些代码所愿执行不到
     方法在执行过程中，在JVM中的内存是如何分配的，内存是如何变化的？（难点）看笔记
     1.方法只定义，不调用，是不会执行的，并且在JVM中不会给该方法分配运行所属的内存空间，只有在调用时，才会分配运行内存空间
     2.在JVM内存主要划分为3块内存空间：
     方法区内存
     堆内存
     栈内存
     3.方法代码片段属于.class字节码文件的一部分，字节码文件在类加载的时候将其放到了方法区中，
     所以JVM的3块内存空间中方法区空间中最先有数据，存放了代码片段，代码片段在方法区内存中虽然只有一份，
     但是却可以重复调用，调用时会分配所属的活动场所，活动场所在栈内存中分配，所以，栈内存中分配方法运行的所属内存空间
     4.方法在调用时瞬间，会给该方法分配内存空间，此时在栈中将发生压栈动作，方法执行结束后，给该方法分配的内存空间会全部释放，此时发生弹栈动作
     5.局部变量在方法体中声明，局部变量运行阶段内存在栈中分配
     方法在调用的时候，在传递参数时，实际上传递的是变量中保存的那个值，而非变量
    2.方法的重载机制overload
    功能相似的时候，方法的名字可以相同，考虑方法重载机制虽然调用的不同方法，但却给人感觉在调用一个方法，代码美观
    功能不相似的时候，尽可能让方法名不同
    方法重载运用的条件：
    1.在同一个类当中
    2.方法名相同
    3.参数列表不同：包括局部变量数量不同，顺序不同（int在前，double在后等等），类型不同（一个int类型，一个double类型）
    4.用两个不同的返回值类型不能区分两个方法即不能使用方法重载，局部变量中的变量名也不能区分两个方法即不能使用方法重载机制
    5,。方法重载机制只和方法名和参数列表有关，和返回值类型，修饰符列表无关
    3.方法的递归调用
    自己调用自己，递归必须有结束条件，没有结束条件一定会发生栈内存溢出
    递归可以不使用尽量别用，除非必须用到递归，比如目录拷贝
     */
    public static void main(String[] args) {
        //public static是修饰符列表，
        // void表示返回值类型，
        // main表示方法名：主方法，
        // （）中表示形式参数列表，
        // String[]表示一种引用数据类型，
        // args表示局部变量的变量名
        //主方法就要这么写，是程序运行的入口
        //自定义方法不是程序的入口，一般在主方法中调用自定义的方法，自定义方法体中也可以调用其他自定义方法
        //调用sumInt方法
        Test12.sumInt(10,20);//对于方法的修饰符列表中带有static关键字的方法，调用时，类名（Test12.）可以不写
        Test12.sumInt(666,888);
        Test12.sumInt(100,222);
        Test12.sum1(10L,20L);//100L只能说是隐式转换
        Test12.sum1(10,20);//存在自动类型转换 int转long 小容量向大容量转称为自动类型转换
        Test12.sum1((long)3.0,20);//存在强制类型转换，double转long，大容量转小容量存在强制类型转换
        A.doSome();//调用其他类A，不是本类时，不能省略类名A.
        int i=divide(10,3);//调用后得到的返回值可以通过变量法来接收，变量的数据类型必须和返回值类型相同，或能进行自动类型转换
        System.out.println(i);
        long x=divide(10,3);//自动类型转换，小容量转化为大容量
        System.out.println(x);
        m();
        //sumInt1,sumDouble,sumLong 三个方法虽然功能不同，但功能能相似，都是求和，对于程序员来说不太方便，在Java中可以使用重载机制
        int result1=sumInt1(1,2);
        System.out.println(result1);
        double result2=sumDouble(1.0,2.0);
        System.out.println(result2);
        long result3=sumLong(1L,2L);
        System.out.println(result3);
        //调用方法的时候，就像在调用一个方法一样，参数类型的不同，对应调用的方法不同，此时区分方法不再依靠方法名，而是依靠的是参数的数据类型
        System.out.println(sum(1,2));
        System.out.println(sum(1.0,2.0));
        System.out.println(sum(1L,2L));
        //doSome();//运行后会停不下来，一直运行下去，因为没有结束条件
        useSum(100);//不用递归求和（1-100）
        //递归求和（1-100）
        int n=100;
        int result=useSum1(n);
        System.out.println(result);
        //不用递归求阶乘
        useFactorial(5);
        //递归求阶乘
        int result4=useFactorial1(5);
        System.out.println(result4);
    }
    //计算两个int类型的数据的方法
    public static void sumInt(int a,int b){
        int c=a+b;
        System.out.println(a+"+"+b+"="+c);
    }
    public static void sum1(long a,long b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static int divide(int a,int b){
        return a/b;
    }
    //返回值类型为void时运行return;语句
    public static void m(){
        for(int i=0;i<=10;i++){
            if(i==5){
                return;//终止整个m方法
                //break;//只是终止for循环
            }
            System.out.println(i);
        }
        System.out.println("hello");
    }
    //不用重载机制，定义下列三个方法分别计算int类型，double类型，long类型的两数据的和
    public static int sumInt1(int a,int b){
        return a+b;
    }
    public static double sumDouble(double a,double b){
        return a+b;
    }
    public static long sumLong(long a,long b){
        return a+b;
    }
    //以下的三个方法构成方法重载机制
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static long sum(long a,long b){
        return a+b;
    }
    public static void doSome(){
        System.out.println("begin");
        doSome();
        System.out.println("over");
    }
    //不用递归求和（1-100）
    public static void useSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    //递归求和（1-100）
    public static int useSum1(int n){
        if(n==1){
            return 1;
        }
        return n+useSum1(n-1);
    }
    //不用递归计算阶乘
    public static void useFactorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
    //递归求阶乘
    public static int useFactorial1(int n){
        if(n==1){
            return 1;
        }
        return n*useFactorial1(n-1);
    }
}
class A{//其他类A
    public static void doSome() {
        System.out.println("Hello");
    }
}
