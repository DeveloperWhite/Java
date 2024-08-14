package 异常处理.异常的基本概念;

import 数组.homework.stack;

public class Test3 {
    public static void main(String[] args) {
        //异常的继承结构
        //UML图是统一建模语言的缩写，UML图是用来设计软件的
        ///一种图形化的语言,一般是软件架构师用来设计软件的
        //在UML图中，可以描述类与类之间的关系，程序执行的流程，对象的状态变化
    //                                                        Object（从上往下，上面是下面的父类）
    //                                                       throwable（不管是错误还是异常都是可以抛出的）
    // （所有error下发生的都是不可处理的，直接退出）error                              exception
    //               (等)virtual machine error      IOerror       exception subclass    runtime exception  
    //                   stack overflow error            （上面不是类名，而是表示exception直接子类）（NullPointerException
    //                                                                                          ClassCastException  
    //                                                                                         IllegalArgumentexception）
    //                                                                                         NumberFormatException 
    //所有runtime exception及下面的子类都是运行时异常，所有exceptionsubclass及下面的直接子类都是编译时异常
    //编译时异常不是在编译时发生的，而在编写程序时，预先对这种异常进行处理，否则编译器报错，编译时异常发生概率较高，又叫受检异常，受控异常  
    //运行时异常在编写程序阶段可以处理，也可以不处理，运行时异常发生概率较低，又叫非受检异常，非受控异常
    //＊＊＊对Java中异常处理的两种方式：
    //在方法声明处使用throws关键字声明异常，表示该方法不处理异常，而是交给上一级
    //在方法中使用try...catch...语句进行异常的捕捉
    //注意，如果异常一直上抛，最终会抛给JVM，JVM会终止程序
    System.out.println(100/0);
    //下面这行代码不在运行，因为上面抛出了异常，最终会抛给JVM，JVM会终止程序
    System.out.println("HelloWorld");




        
    }
}
