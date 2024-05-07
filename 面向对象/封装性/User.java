package 封装性;

//用户类
public class User {
    //年龄
    //age属性私有化
    private int age;
    //set方法
    public void setAge(int a){
        if(a<0||a>150){
            System.out.println("对不起！您输入的程序不合法");
            return;
        }
        age=a;
    }
    //get方法
    public int getAge() {
        return age;
    }
}
