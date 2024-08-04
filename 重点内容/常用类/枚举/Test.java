package 常用类.枚举;

public class Test {
    public static void main(String[] args) {
        //枚举
        //分析下面代码的缺陷，返回值含义不明确
        //在这个返回值1和0中，1和0的含义不明确
        //例程序员写了返回值100，实际上已经出错了，和需求不符了，
        //但是程序也不会报错，编译器没检查出来
        //所以和需求就会不一致，所以需要改进,最好使用boolean类型，返回true和false
        //但是在以后的开发中，一种方法可能遇到多种返回值，boolean类型就不够用了
        //所以java就提供了枚举类型，专门用来解决这种情况
        boolean a=divide(10, 2);
        System.out.println(a);//1
        boolean b=divide(10, 0);
        System.out.println(b);//0

        
    }
    //编写一个方法，要求输入两个整数，如果能计算出结果，则返回1，否则返回0
    // public static int divide(int a,int b){
    //     try{
    //         int c=a/b;
    //         //这里要用try catch异常处理，后面会讲解
    //         //程序执行到这里,说明代码没有异常,所以返回1
    //         return 1;
    //     } catch (Exception e) {
    //         //程序执行到这里,说明代码有异常,所以返回0
    //         return 0;
    //     }
    // }
    public static boolean divide(int a,int b){
        try{
            int c=a/b;
            //这里要用try catch异常处理，后面会讲解
            //程序执行到这里,说明代码没有异常,所以返回1
            return true;
        } catch (Exception e) {
            //程序执行到这里,说明代码有异常,所以返回0
            return false;
        }
    }
}
