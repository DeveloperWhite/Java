package 关于Java语言中的包和import;
//关于JAVA语言当中的包机制：
/*
1.java中引入package这种语法机制主要为了方便程序管理，
不同功能的类被放到不同的软件包当中查找比较方便，管理比较方便，易维护
2.定义package:在Java源程序的第一行编写package语句
3.package只能编写一个语句
4.语法结构：package 包名;
5.包名的命名规范：公司域名倒序+项目名+模块名+功能名
6.包名要求全部小写，包名也是标识符，一个包将来对应一个目录
例如：package com.bjpowernode.javase.day1//4个目录（目录间用点隔开）
7.使用package机制后，类名不再是package1了，类名变成com.bjpowernode.javase.day1.package1
8.如何运行：先编译，编译后将源程序文件和生成的class文件放到包名指定的目录下，才能运行，在该类下创建对象不能直接写类名，
要将包名一起写上，当两个测试java文件在一个包中时包名可以省略
9.简化上述写法：import 包名.* 即导入包名
10.import用来导入类，同一个包下的类不需要导入，不在同一个包下的类需要手动导入，需要编写在package语句下，class语句上
导入类：import 类名
导入包：import 包名.*
11.不是java.lang包下，并且不在同一个包下的时候，需要import进行引入
 */
public class package1 {
}
