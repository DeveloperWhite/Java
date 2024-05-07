package 继承;
//信用卡账户
public class creditAccount extends bankAccount{
  //账号
  private String account;
  //余额
  private double balance;
  //信誉指数
  private double credit;

  public creditAccount() {
  }

  public creditAccount(String account, double balance, double credit) {
    this.account = account;
    this.balance = balance;
    this.credit = credit;
  }
/*因为父类bankAccount中有这些代码，所以直接继承
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
  }*/

  public double getCredit() {
    return credit;
  }

  public void setCredit(double credit) {
    this.credit = credit;
  }
}
