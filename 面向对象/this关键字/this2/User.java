package this关键字.this2;
//this不能省略的情况：用来区分局部变量和实例变量时不能省略
//用户类
public class User {
  //属性
  private int id;
  private String name;
  //构造函数get，set
  public void setId(int a){
      id=a;//其实这里是this.id只不过this省略，id为实例变量，后者a为局部变量a
  }
  public int getId(){
    return id;
  }
  //此时为了区分这里的name和后面的name区分实例变量和局部变量时，this.不能省
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
}
