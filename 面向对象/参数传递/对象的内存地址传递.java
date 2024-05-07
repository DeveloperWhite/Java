package 参数传递;
//一开始创建User对象，调用的构造方法User将age赋值为10，将对象的内存地址赋值给User u1，u1存储在栈内存中指向堆内存中的对象User，
// 然后调用add方法在栈内存中给add方法内存空间，将u1指向的User对象的内存地址进行值传递传递给add中的局部变量u，
// 因为有相同的指向User对象的内存地址，所以两个栈内存中的局部变量能够指向相同的堆内存中User对象，所以两者的输出值均为对象中age为11
public class 对象的内存地址传递 {
  public static void main(String[] args) {
    User u1=new User(10);
    对象的内存地址传递.add(u1);//11
    System.out.println(u1.age);//11
  }
  public static void add(User u){
    u.age++;
    System.out.println(u.age);
  }
}
class User{
  int age;
  public User(int a){
    age=a;
  }
}
