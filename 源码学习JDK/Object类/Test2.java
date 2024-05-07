package Object类;
public class Test2 {
  public static void main(String[] args) {
    student c=new student(12,"南通小学");
    student c1=new student(12,"南通小学");
    System.out.println(c.equals(c1));//true
  }
}
class student{
  //学号
  int num;
  //所在学校
  String school;

  public student() {
  }

  public student(int num, String school) {
    this.num = num;
    this.school = school;
  }
  //重写toString方法

  @Override
  public String toString() {
    return "学号"+num+"学校"+school;
  }

  //重写equals方法
  //当一个学生的学号相同，学校相同时表示同一个学生
  //equals方法编写模式都是固定的，架子差不多
  @Override
  public boolean equals(Object obj) {
    if (obj == null || !(obj instanceof student)) return false;
    if (obj == this) return true;
    //向下转型
    student s = (student) obj;
    //String字符串比较要用equals方法
    /*
    若字符串是String s="abc"则可以用==去判断
    而String s=new String（"abc“），字符串是对象创建出来时，要用equals方法，
    但由于我们不知道String字符串如何定义出来的，所以统一用equals方法判断
    String属于引用数据类型，用equals方法
    */
    return this.num == s.num && this.school.equals(s.school);
  }
}