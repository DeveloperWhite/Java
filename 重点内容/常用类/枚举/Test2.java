package 常用类.枚举;

public class Test2 {
    //枚举类型
    //还是刚才的例子，如果用枚举类型，代码如下
    //枚举是引用类型，所以可以定义多个枚举对象
    //枚举中每一个值可以看做是常量
    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));
        
    }
    public static Result divide(int a,int b){
        try{
            int c=a/b;
            //这里要用try catch异常处理，后面会讲解
            //程序执行到这里,说明代码没有异常,所以返回1
            return Result.SUCEESS;
        } catch (Exception e) {
            //程序执行到这里,说明代码有异常,所以返回0
            return Result.FAIL;
        }
    }

}
//定义一个枚举类型
enum Result{
    //SUCEESS可以看做枚举过程中的一个值
    //FAIL可以看做枚举过程中的一个值
    SUCEESS,FAIL
}
