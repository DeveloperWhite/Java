package 构造方法;
//账户类
public class Account {
    //账号
    private String account;
    //余额
    private double balance;
    //无参数构造器
    public Account(){
        //初始化实例变量的内存空间
    }
    //账号修改构造方法
    public Account(String s){
        account=s;
    }
    //修改余额构造方法
    public Account(double s){
        balance=s;
    }
    //同时修改账号和余额
    public Account(String t,double s){
        account=t;
        balance=s;
    }
    //封装后的get，set方法
    public void setAccount(String i){
        account=i;
    }
    public String getAccount(){
        return account;
    }
    public void setBalance(double i){
        balance=i;
    }
    public double getBalance(){
        return balance;
    }
}
