package this关键字.this2;
public class UserTest {
  public static void main(String[] args) {
    //访问实例变量必须先创建对象
    User c=new User();
    //修改name
    c.setName("zhangsan");
    System.out.println(c.getName());
  }
}
