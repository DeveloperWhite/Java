public class Test9 {
    //布尔型
    /*
    在java语言中boolean类型只有两个值：true，false，没有其他值
    底层存储boolean只占一个字节，因为false的底层是0，true的底层是1
    八种基本数据类型转换规则：
    除布尔类型外，其他七中数据类型可互相转换
    小容量向大容量转换称为自动类型转换
    容量从小到大排名：byte，short，int，long，float，double，char
    char c=97（存在自动类型转换）
    大容量转换为小容量需要强制类型转换，加上强制类型转换符，才能编译通过，在运行阶段会损失精度
    当整数字面值没有超过byte，short，char的取值范围可直接赋值给byte，short，char类型的变量
    byte，short，char混合运算时，先转化为int数据类型再做运算
    多种数据类型混合运算时，先转化为容量最大的数据类型再做运算
     */
    public static void main(String[] args) {
        boolean loginSuccess=true;
        if (loginSuccess){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败");
        }
        char c=97;//a
        System.out.println(c);

    }
}
