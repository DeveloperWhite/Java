package 继承;
//银行账户
public class bankAccount {
  //账号
  private String account;
  //余额
  private double balance;
  public bankAccount() {
  }
  public bankAccount(String account, double balance) {
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
