package 常用类.StringBuffer;

// 如果以后要进行大量的字符串拼接,用加号会创建大量字符串对像，建议使用StringBuffer或者是StringBuilder
// java.lang.StringBuffer;
// java.lang.StringBuilder;
public class Test2 {
    public static void main(String[] args) {
        // StringBuffer底层是一个byte数组，初始化容量是16
        StringBuffer stringBuffer=new StringBuffer();
        // 可以用append方法进行字符串拼接
        // append方法如果在byte数组16的容量用完会自动扩容
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");  
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        //自动会调用toString方法
        System.out.println(stringBuffer); 
        // 如何优化StringBuffer性能
        // 在创建StringBuffer对象的时候，给定一个初始容量，最好减少底层byte数组扩容的次数
        // 下面是指定初始化容量的StringBuffer对象(字符串缓冲区对象)
        StringBuffer sb=new StringBuffer(100);
        //StringBuilder方法
        
           
         


    }
}
