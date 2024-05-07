package 对象的创建与使用.User;
//测试类
public class TestUserAndAddress {
    public static void main(String[] args) {
        //创建user对象
        User s=new User ();
        System.out.println(s.name);
        System.out.println(s.num);
        System.out.println(s.addr);
        //修改对象实例变量
        s.name="zhangSan";
        s.num=110;
        /*
        下面代码可以拆开来看
        Address a=new Address（）;
        s.addr=a;
         */
        s.addr=new Address();//此处不是仅仅能修改为字面值，也能修改为对象
        //引用可以是局部变量，也可以是成员变量
        System.out.println(s.name);//局部变量s
        System.out.println(s.addr.city);//成员变量addr
    }
}
