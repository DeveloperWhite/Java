

public class Test11 {
    //控制语句
    /*
    选择结构：
    if，if...else
    if语法：
    第一种：
    if（布尔表达式）{
          java语句
           ......
    }
    第二种：
    if（布尔表达式）{
         java语句
    }else{
         java语句
    }
    第三种：
    if（布尔表达式）{
        java语句
    }else if（布尔表达式）{
        java语句
    }else if（布尔表达式）{
        java语句
    }
    第四种：
    if（布尔表达式）{
        java语句
    }else if（布尔表达式）{
        java语句
    }else if（布尔表达式）{
        java语句
    }else{
        java语句
    }
    switch
    switch语法：拿括号中的数据和case中的数据进行匹配，匹配成功执行冒号后的java语句，
    遇到break整个switch就结束了，假设第一个case中没有break，将不在判断第二个case是否匹配，
    直接继续执行第二个case中的java语句，这种被称为case穿透现象
    相同的Java语句在不同的case条件下可以合并
    例：case语句合并
    int i=10;
    switch（i）{
          case 1：case 2：case 3：case 10：
               java语句;
    }
    switch（int或String类型的字面值或变量）{
    case int或String类型的字面值或变量：
         java语句;
         ...
         break;
    case int或String类型的字面值或变量：
         java语句;
         ...
         break;
    case int或String类型的字面值或变量：
         java语句;
         ...
         break;
    default：
         java语句;
         ...
    }
    循环结构：
    for
    for循环语法：
    for（初始化表达式;布尔表达式;更新表达式）{
           Java语句;
    }
    执行过程：初始化表达式，布尔表达式，更新表达式都不是必须的，但两个分号一定要写，
    初始化表达式一定是最先执行的，并且只执行一次，布尔表达式必须是true/false，
    先执行初始化表达式，只执行一次，
           再判断布尔表达式是True/false，
               若为true，执行java语句，
                 执行更新表达式，
                 再判断布尔表达式真假，以此往复
               若为false，循环结束
    while
    while语法：
    while（布尔表达式）{
          循环体
    }
    循环原理：先判断布尔表达式的结果，若为真执行循环体，再判断布尔表达式结果，再执行循环体，再判断，再执行循环体......
    do....while
    do....while语法：
    do{
      循环体;
    }while（布尔表达式）;
    循环原理：先执行循环体，再判断布尔表达式为真，再执行循环体，再判断，再执行循环体，直到为假....
    控制循环的语句：
    break
    break语法：
    可单独为一句java语句，可用在switch语句中，也可使用在循环语句中，
    当循环到我们所需要的数据后即可以终止循环，这样可以减少资源的消耗
    continue
    continue语句：
    表示继续，也可以continue关键字加分号构成的Java语句，
    主要出现在循环语句中，用来控制循环语句的执行，表示当前本次循环结束，执行下一次循环继续执行
    其他用法：continue+循环名称表示从那次循环开始执行
     */
    public static void main(String[] args) {

        //if语句
        double distance=1.0;
        if(distance<5.0){
            System.out.println("去KFC吃饭");
        }
        /*
        成绩在【0,100】之间
        赋值等级
         */
        int score=95;
        if(score<0||score>100){
            System.out.println("输入成绩不合法");
        } else if (score>=90) {
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println("C");
        } else if (score>=60) {
            System.out.println("D");
        } else{
            System.out.println("不合格");
        }
        //第二种
        String grade="E";
        if(score<0||score>100){
            grade="不合格";
        } else if (score>=90) {
            grade="A";
        } else if (score>=80) {
            grade="B";
        } else if (score>=70) {
            grade="C";
        } else if (score>=60) {
            grade="D";
        }
        System.out.println(grade);

        //接受从键盘输入
        java.util.Scanner s=new java.util.Scanner(System.in);
        //next方法接受用户输入字符串
        String userInputContent=s.next();
        System.out.println("您输入了"+userInputContent);
        //输入数字
        int num=s.nextInt();
        System.out.println("您输入了"+num);

        //switch语句
        /*
        long x=100L;
        switch（x）编译报错，x为long类型，switch为int或String类型，大容量变小容量需要加强制类型转换符
         */
        long x=100L;//类型转换
        switch((int)x){}

        byte a=10;//类型转换
        switch(a){}

        short b=10;//类型转换
        switch(b){}

        char c='A';//类型转换
        switch(c){}

        String username="zhangsan";//String类型
        switch (username){}

        //for循环语句
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        //输出所有的奇数
        for(int i=1;i<=10;i+=2){
            System.out.println(i);
        }
        //输出所有的偶数
        for(int i=2;i<=10;i+=2){
            System.out.println(i);
        }
        //for循环嵌套for循环，
        // 只看最里面的循环，外面的循环只是把里面的执行多次，不可复杂化
        for(int i=0;i<=10;i++){
            //开始
            System.out.println("开始");
            for(int j=0;j<=5;j++){
                System.out.println(j);
            }
            System.out.println("结束");
            //结束，执行了10遍
        }

        //while语句
        //使用while循环输出1-10
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        //do...while语句
        int d=10;
        do{
            System.out.println(i);
            i++;
        }while (i<10);

        //break语句
        //终止循环，在默认情况下，break终止的是内层循环，
        // 要想终止其他层的循环可以在循环前加上名字和冒号，在break后加上你要终止的循环名称
        A:for(int e=1;e<=5;e++){
            B:for(int j=1;j<=5;j++){
            if (j==4){
                break ;
            }
            System.out.println(j);
            }
        }//表示中断内层循环，运行结果输出5遍123
        A:for(int m=1;m<=5;m++){
            B:for(int j=1;j<=5;j++){
                if (j==4){
                    break A ;
                }
                System.out.println(j);
            }
        }//当j为4时中断外层循环，就输出运行结果1遍123

        //continue语句
        for(int k=0;k<=10;k++){
            if(k==5){
                continue;
            }
            System.out.println(k);//012346789
        }
    }
}
