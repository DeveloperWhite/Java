
public class 简单计算器系统 {
    /*
    实现简单计算器中的加减乘除取模
    1.所有数据从键盘中输入
    2.使用switch语句进行判断
    3.需要从控制台输入三次：第一个数字，运算符，第二个数字
    场景：
    欢迎使用简单计算器系统：
    请输入第一个数字：10
    请输入运算符：+
    请输入第二个数字：20
    运算结果：10+20=30
     */
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("欢迎使用简单计算器系统：");
        System.out.println("请输入第一个数字：");
        int num1=s.nextInt();
        System.out.println("请输入运算符：");
        String operate=s.next();
        System.out.println("请输入第二个数字：");
        int num2=s.nextInt();
        int result=0;
        switch(operate){
            case"+":{
                result=num1+num2;
                break;
            }
            case"-":{
                result=num1-num2;
                break;
            }
            case"*":{
                result=num1*num2;
                break;
            }
            case"/":{
                result=num1/num2;
                break;
            }
            case"%": {
                result = num1 % num2;
                break;
            }
        }
        System.out.println("运算结果为："+num1+operate+num2+"="+result);

    }
}
