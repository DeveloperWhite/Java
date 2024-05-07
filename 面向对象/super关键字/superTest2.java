package super关键字;
//super(实际参数列表)
//解决父类的私有变量在子类中访问的问题
public class superTest2 {
  public static void main(String[] args) {
    creditAccount c=new creditAccount();
    System.out.println(c.getAccount()+","+c.getBalance()+","+c.getCredit());
    creditAccount c1=new creditAccount("111",111.0,111.0);
    System.out.println(c1.getAccount()+","+c1.getBalance()+","+c1.getCredit());
  }
}
//账户类
class Account{
  //属性
  private String account;
  private double balance;

  public Account() {
  }

  public Account(String account, double balance) {
    this.account = account;
    this.balance = balance;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
//信誉账户类
class creditAccount extends Account {
  //特有的属性，信誉度
  private double credit;
  public creditAccount(){

  }
  //因为account和balance在Account类中是私有属性，只能在本类中访问，而在creditAccount类中不能直接访问
  public creditAccount(String account, double balance,double credit) {
  /*this.account = account;
    this.balance = balance;
  */
  //以上的两行代码，在恰当的位置正好可以使用super(account,balance)，通过子类的构造方法构造父类的构造方法，这样就解决了父类的私有变量在子类中访问的问题
  super(account,balance);
  this.credit = credit;

  }
  public double getCredit() {
    return credit;
  }
  public void setCredit(double credit) {
    this.credit = credit;
  }
}
