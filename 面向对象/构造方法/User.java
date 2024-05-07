package 构造方法;
public class User {
    //构造方法User
    public User(){
        System.out.println("Hello");
    }
    public User(int i){
        System.out.println(i);
    }
    public User(String m){
        System.out.println(m);
    }
    public User(int i,String m){
        System.out.println(i+"+"+m);
    }
}
