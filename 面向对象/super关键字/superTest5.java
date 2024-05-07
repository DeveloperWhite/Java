package super关键字;
//super.不仅可以访问属性，也可以访问方法
public class superTest5 {
  public static void main(String[] args) {
    cat c=new cat();
    c.yiDong();
  }
}
class Animal{
  public void move(){
    System.out.println("Aniaml move");
  }
}
class cat extends Animal{
    //对父类中的move方法进行重写
  public void move(){
    System.out.println("cat move");
  }
  public void yiDong(){
    this.move();
    move();//相当于this.move（）
    super.move();
  }
}
