package Object类;

public class Test3{
  public static void main(String[] args) {
    /*Address u=new Address("江苏省","南通市","通州区");
    user c=new user("张三",u);*/
//换种写法
    user c1=new user("张三",new Address("江苏省","南通市","通州区"));
    user c2=new user("张三",new Address("江苏省","南通市","通州区"));
    System.out.println(c1.equals(c2));//true
    user c3=new user("张三",new Address("江苏省","徐州市","通州区"));
    System.out.println(c1.equals(c3));//false
  }
}
class user{
  String name ;
  //家庭住址
  Address addr;

  public user() {
  }

  public user(String name, Address addr) {
    this.name = name;
    this.addr = addr;
  }
  //equals方法重写
  //当每一个用户的姓名和家庭住址都相同时，表示同一个住户
  //只要不是类中自带的重写equals方法，都要在类中重写equals方法
  //判断的是user对象和user对象是否相等
  @Override
  public boolean equals(Object obj) {
    if(obj==null||!(obj instanceof user)) return false;
    if(obj==this)return true;
    //obj转型成user
    user u=(user)obj;
    //String类中自带的重写的equals方法
    //Address类中也要重写equals方法
    return this.name.equals(u.name)&&this.addr.equals(u.addr);
  }
}
class Address{
  String city;
  String street;
  //邮编
  String zipcode;

  public Address() {
  }

  public Address(String city, String street, String zipcode) {
    this.city = city;
    this.street = street;
    this.zipcode = zipcode;
  }
  //这里没有重写equals方法
  //判断的是Address对象和Address对象是否相等
  public boolean equals(Object obj) {
    if(obj==null||!(obj instanceof Address)) return false;
    if(obj==this)return true;
    //obj转型成user
    Address u=(Address)obj;
    //String类中自带的重写的equals方法
    //Address类中也要重写equals方法
    return this.city.equals(u.city)&&this.street.equals(u.street)&&this.zipcode.equals(u.zipcode);
  }

}