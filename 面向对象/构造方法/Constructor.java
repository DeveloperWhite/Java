package 构造方法;
public class Constructor {
    /*
    构造方法：
    1.构造方法又被称为构造函数/构造器
    2.语法结构：
    [修饰符列表] 构造方法名（形式参数列表）{
            构造方法体;
    }
    普通方法的语法结构：
    [修饰符列表] 返回值类型 方法名（形式参数列表）{
            方法体;
    }
    对于构造方法来说返回值类型不能指定，不能写void，如果写了就会变成普通方法
    构造方法的方法名必须和类名保持一致
    作用：通过构造方法的调用可以创造对象
    调用：
    普通方法：有static关键字修饰的方法调用：类名.方法名（实参）;没有static关键字修饰的方法调用：引用.方法名（形参）;
    构造方法：new 构造方法名（实参列表）;
    每一个构造方法执行结束后都有返回值，并且返回值类型就是构造方法所在类的类型，由于构造方法的返回值类型就是类本身，所以不需要写
    注释与取消注释：ctrl+/
    多行注释与取消：ctrl+shift+/
    当一个类中没有任何构造方法的时候，系统默认给这个类提供一个无参数的构造方法，方法被称为缺省构造器
    当我们已经在类中定义一个构造方法后，系统将不再默认提供缺省构造器，建议开发中手动提供无参数构造方法
    构造方法支持方法重载机制，若定义一个有参数的方法，定义一个无参数的方法；方法名相同，我们就可以通过调用时控制参数来调用相应的构造方法
    构造方法的另一个作用：创建对象的同时，初始化实例变量的内存空间（给实例变量赋初始默认值）
    成员变量中的实例变量，属于对象级别的变量，必须先有对象才能有实例变量，实例变量的内存空间是在构造方法执行过程中完成初始化的，
    即变量在赋默认值是在构造方法的执行过程中，所以构造方法能够初始化实例变量的内存空间
     */
        public static void main(String[] args) {
        //创建user对象
        //调用User类的构造方法来完成对象的创建
        // 调用无参数的User构造方法
        User u1=new User();//User为构造方法名，因为构造方法的方法名要和类名保持一致，所以他们相同
        //User u=new User（）;创建对象代码解释：需要调用构造方法User，并赋值给u来接收，又因为该构造方法的返回值类型与类的类型一致都是User所以用User类型来接收
        //调用有参数的构造方法User
        User u2=new User(5);
        User u3=new User("Hello");
        User u4=new User(5,"Hello");
        //展示第一个Account
        Account a1=new Account();
        //修改账号
        a1.setAccount("111");
        //展示账号
        System.out.println(a1.getAccount());
        //修改余额
        a1.setBalance(1111);
        //展示余额
        System.out.println(a1.getBalance());
        //展示第二个调用修改账户构造方法后的账户
        Account a2=new Account("22222222");
        //展示修改账号
        System.out.println(a2.getAccount());
        //展示第二个调用修改余额构造方法后的余额
        Account a3=new Account(22222.0);
        System.out.println(a3.getBalance());
        //同时修改账号和余额
        Account a4=new Account("333333",333333);
        System.out.println(a4.getAccount());
        System.out.println(a4.getBalance());
    }
}
