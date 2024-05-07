public class Test10 {
    //运算符
    /*
    算术运算符：
    +  加号
    -  减号
    *  乘号
    /  除号
    %  求余数（取模）
    ++  自加1
    --  自减1
    关系运算符：
    >,<,>=,<=,==,!=  (==是关系运算符，=是赋值运算符)
    关系运算符的结果一定是布尔类型：true/false，比较变量中保存的值的大小
    逻辑运算符：要求两边的算子都是布尔类型，结果也必须是布尔类型
    &  逻辑与（并且）  两边都是true才为真
    |  逻辑或（或者）  两边只要有一个true就是真
    !  逻辑非  取反
    ^  逻辑异或  两边算子不一样就是真
    &&  短路与  和逻辑与结果相同，存在短路现象
    ||  短路或  和逻辑或结果相同，存在短路现象
    字符串连接运算符：
    “+”运算符在java中有两种作用：
    加法运算符：加号两边都是数字才是加法运算
    字符串连接运算：两边的数据有一个是字符串类型，一定进行字符串连接运算，运算结果还是字符串类型
    三元运算符：
    语法规则：布尔表达式？表达式1：表达式2（看布尔表达式为真时，把表达式1作为表达式运行结果，为假则把表达式2作为结果）
    赋值类运算符：
    基本赋值运算符：=
    扩展的赋值运算符：扩展类的赋值运算符不改变运损结果类型
    +=   byte i=5   i+=5 -------  i=（byte）（i+5）一开始是byte型最后也应该强转为byte类型
    -=
    *=
    /=
    %=
     */
    public static void main(String[] args) {

        //算术运算符
        int i=10;
        int j=3;
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
        int k=10;
        k++;
        System.out.println(k);
        //m++
        /*
        int m=100;
        int b=m++;//先把m的值赋给b在对m做++运算
        System.out.println(m);//101
        System.out.println(b);//100
         */
        //++m
        int m=100;
        int b=++m;//先对m做++运算在把m的值赋给b
        System.out.println(m);//101
        System.out.println(b);//101
        // 这里的数值还是100是因为调用了println函数，先将n赋值给println函数中的x在进行++操作
        int n=100;
        System.out.println(n++);//100
        //这里的数值是101是因为调用了println函数，先将d进行++操作在将此时的值赋值给println函数中的x进行输出
        int d=100;
        System.out.println(++d);//101

        //关系运算符
        int e=10;
        int f=10;
        System.out.println(e>f);
        System.out.println(e<f);
        System.out.println(e>=f);
        System.out.println(e<=f);
        System.out.println(e==f);
        System.out.println(e!=f);

        //逻辑运算符
        System.out.println(5>3&5>4);//true
        //逻辑与和短路与
        int x=10;
        int y=8;
        /*
        逻辑与：比较执着，不管真假，前后必须执行完
        System.out.println(x<y&++x<y);
        System.out.println(x);//11
         */
        //短路与：比较智能，看到第一个表达式为假，后一个表达式不执行，直接短路
        System.out.println(x<y&&++x<y);
        System.out.println(x);//10
        //在某些特殊的业务逻辑中要求两边的表达时都执行，要用逻辑与，而使用逻辑与可能导致后边的算子不执行
        //第一个表达式执行结果为true，则会发生短路或
        //第一个表达式执行结果为false，则会发生短路与

        //赋值类运算符
        byte o=10;
        o+=5;//其实不等同于o=o+5，等同于o=（byte）（o+5）
        System.out.println(o);

        //字符串运算符
        System.out.println(10+20+"30");//3030 从左向右依次运算 左边加号是求和，右边加号是字符串连接运算
        System.out.println(10+(20+"30"));//102030  先算括号里面的，字符串
        int a=10;
        int c=20;
        //动态输出
        System.out.println(a+"+"+c+"="+(a+c));//10+20=30
        //string是引用数据类型，起名username，赋值zhangsan
        String username="zhangsan";
        System.out.println("恭喜您，欢迎"+username+"回来！");

        //三元运算符，三目运算符
        boolean sex=true;
        System.out.println(sex?"男":"女");
    }
}
