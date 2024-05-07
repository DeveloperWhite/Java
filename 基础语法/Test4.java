public class Test4 {
    //变量
    /*
    变量包含三部分：数据类型，名称，字面值（数据）
    变量是内存中存储元素的最基本单元
    数据类型：不同的数据有不同的数据类型，不同的数据类型底层会分配不同的大小空间
    声明/定义变量：数据类型 变量名
    变量赋值：变量名=字面值（先运算等号右边的表达式然后赋值给等号左边的变量）
    访问变量的两种方式：读取变量中保存的具体数据：get获取
                    修改变量中保存的具体数据：set设置
    在同一个作用域中变量名不能重名，但变量可以重新赋值
    作用域：访问变量的有效范围
    变量i在main方法体中可以访问，在doSome方法体中不能访问
    变量k在以下所有方法体中均可访问
    关于变量的分类：局部变量：在方法体中声明的变量
                 成员变量：在方法体外，类体之内声明的变量
    类体中不能编写java语句（声明变量除外）
     */
    static int k=90;//*******static不可去掉
    public static void main(String[] args) {//定义一个公开的静态的主方法
        int i=100;//局部变量
        System.out.println(i);//方法体，必须以分号结尾
        System.out.println(k);
        /*for(int m =0;m<10;m++){
        }
        System.out.println(m);
        m访问不了，因为m的作用域是for循环之内
         */
        int n;
        for(n=0;n<10;n++){
        }
        System.out.println(n);
       // n能访问，因为n的作用域是整个main方法体之内
    }
    int i=100;//成员变量
    public static void doSome(){
        System.out.println(k);
    }
}
