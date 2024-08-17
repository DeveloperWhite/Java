package 异常处理.异常的基本概念;

public class Test12 {
    //finally面试题
    //常规思路这里是101
    //但是实际上是100
    //这个是一个特殊情况
    //java中有许多规则，一旦这么说了，就必须这么做
    //方法体中的代码必须按照自上而下的顺序执行()
    public static void main(String[] args) {
        int result=m();
        System.out.println(result);//100
    }
    public static int m(){
        int i=100;
        try{
            return i;
        }finally{
            i++;
        }
    }
}
