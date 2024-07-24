package 常用类.StringBuffer;
//在实际的开发中频繁使用字符串的拼接会有什么问题？
// java中的字符串是不可变的，每次拼接都会产生新的字符串对象，占用大量方法区内存空间，效率低
// String s＝"Hello”;
// s+="World";
// 上面的代码在方法区中产生了三个对象
// Hello
// World 
// HelloWorld
public class Test1 {
    public static void main(String[] args) {
        System.out.println(".()");
        String s="";
        // 这样做会给字符串方法区常量池造成很大的压力
        for (int i = 0; i < 10; i++) {
            s+=i;
            System.out.println(s);
        }
        
        
    }
}