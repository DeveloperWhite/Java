package 对象的创建与使用.Customer;
public class TestCustomer {
    public static void main(String[] args) {
        Customer s=new Customer();
        System.out.println(s.id);
        /*
        s=null;
        System.out.println(s.id);
        报错：java.lang.NullPointerException
        问题：空引用访问实例相关数据一定会出现空指针异常
        实例相关数据：表示数据访问的时候必须有对象的参与（例如id和对象Customer参与，所以称为实例相关数据）
         */





    }
}
