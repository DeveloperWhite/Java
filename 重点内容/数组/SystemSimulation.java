package 数组;

/*模拟一个系统，系统需要输入用户名和密码才能进入*/
public class SystemSimulation {
  //用户名和密码输入到String数组中
  public static void main(String[] args) {
//    代表只有当输入两个数据输入时才能进入
    if(args.length !=2){
      System.out.println("使用系统时请输入用户名和密码，例如 zhangsan 123");
    }
//    程序执行到现在说明用户确实提供了用户名和密码
//    接下来判断用户名和密码是否正确
//    取出用户名
    String username=args[0];
//    取出密码
    String password=args[1];
//    假设用户名是admin，密码是123时才能登录，判断两个字符是否相等用equals方法
//    if(username.equals("admin")&&password.equals(123))如果这样用equals比较就会出现空指针异常
//    因为如果username为空就会出现空指针异常，而下面字符串不可能为空，即使后面username为空也不会出现异常
//    这样写把字符串放在前面就不会出现空指针异常，经验(老程序员)
    if("admin".equals(username)&&"123".equals(password)){
      System.out.println("登陆成功，欢迎"+username+"回来");
    }else{
      System.out.println("用户名不存在或密码错误");
    }
  }
}
