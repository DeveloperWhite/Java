    package 常用类.String;

/*String类中的常见构造方法和方法*/
public class Test4 {
  public static void main(String[] args) {
    //  最常见的字符串方法
    String x="abc";
//  构造方法
//  传一个byte类型的数组
    byte [] bytes={97,98,99};//97是a，98是b，99是c
    String s1=new String(bytes);
//    输出字符串的时候输出的不是字符串内存地址，而是字符串，在输出的时候会自动调用toString方法，说明String类中toString方法已经重写了
    System.out.println(s1);
//    将byte数组中的一部分转化为字符串
//    第一个元素表示数组，第二个元素表示数组起始元素下标的具体位置，第三个表示长度
    String s2=new String(bytes,1,2);
    System.out.println(s2);//bc
//    将char数组全部转化为字符串
    char [] chars={'a','b','c'};
    String s3=new String(chars);
    System.out.println(s3);
//    将char数组部分转化为字符串
    String s4=new String(chars,1,2);
    System.out.println(s4);


//    方法
//    返回指定索引的char值
//    字符串可以表示一个对象，所以就可以有点方法
    char c="中国人".charAt(1);
    System.out.println(c);
//    equals方法和compareto方法的区别：
//    equals只可以看出两个字符串是否相等
//    compareto不仅能看出两个字符串是否相等，也能看出谁大谁小
//    用于字符串之间比较大小
//    按字符顺序比较两个字符串大小关系，比较的时候是按照一个一个字母进行比较
    System.out.println("abc".compareTo("abc"));//返回0
    System.out.println("abcd".compareTo("abce"));//返回-1，前小后大按照字符顺序
    System.out.println("abce".compareTo("abcd"));//返回1，按照前大后小字符顺序
//    判断字符串之间的包含关系，返回boolean类型
    System.out.println("Hello word".contains("word"));
//    判断当前字符串是否以某个字符串结尾
    System.out.println("Hello word".endsWith("word"));
//    判断当前字符串是否以某个字符串结尾
    System.out.println("Hello word".startsWith("Hello"));
//    判断两个字符串是否相等，忽略大小写
    System.out.println("HELLO WORD".equalsIgnoreCase("hello word"));
//    将字符串对象转化为字节数组中的数字
    byte[] bytes1="Hello word".getBytes();
//    遍历出来
    for(int i=0;i<bytes1.length;i++) {
      System.out.println(bytes1[i]);
    }
//    判断某个子字符串在当前字符串中第一次出现位置的索引
    System.out.println("c++javapythonphpcc#java".indexOf("java"));//3
//    判断某个字符串是否为空
    String m="";
    System.out.println(m.isEmpty());//true
    System.out.println("abc".length());//3
//    面试题
//    判断数组长度和字符串长度不一样，数组长度length是属性，字符串长度是调用length方法
//    判断某个子字符串在当前字符串中最后一次出现位置的索引
    System.out.println("c++javapythonphpcc#java".lastIndexOf("java"));
//    替换原字符串中老的字符串为新的字符串
    String newString="http://www.baidu.com".replace("http://","https://");
    System.out.println(newString);
//    拆分字符串，可用于账号密码的拆分
    String[] ymd="1980-10-11".split("-");//将1980-10-11以-进行拆分，得到的返回值是一个数组
    for(int i=0;i<ymd.length;i++){
      System.out.println(ymd[i]);
    }
//    截取字符串，括号中写下标，一个是开始一个是结束，也可以只写一个表示到最后
    System.out.println("https:/www.baidu.com".substring(7,10));
//    将字符串转化成char数组
    char[] cha="我是中国人".toCharArray();
    for(int i=0;i<cha.length;i++){
      System.out.println(cha[i]);
    }
//    转化成小写
    System.out.println("ABCDeFJhijk".toLowerCase());
//    转化成大写
    System.out.println("ABCDeFJhijk".toUpperCase());
//    去除字符串前后空白，中间空白去不了，防止输入登录界面，用户名或密码时出现空白
    System.out.println("        Hello          word           ".trim());
//    String中只有一个方法是静态的，不需要new对象，上面没有new对象是因为字符串就是对象，valueOf将非字符串转化成字符串
    String str=String.valueOf(3.14);
    System.out.println(str);
    //     这个静态的value方法，参数是一个对象时，会调用toString方法，将对象转化为字符串
    //这里调用obj中没有重写的toString方法，输出的是对象的内存地址 ，下面重写了toString方法，输出的是自定义的toString方法  
    String ss=String.valueOf(new customer());
    System.out.println(ss);
    //研究下println底层的原理
    System.out.println(100); 
    System.out.println(3.14);
    System.out.println(true);
    //首先println方法会调用String.valueOf方法，其实调用obj.toString方法，将对象转化为字符串，然后调用print方法，将字符串输出
    Object obj=new Object();
    //实际上这边obj自动调用了toString方法，将对象转化为字符串
    //本质上println这个方法在输出任何数据时，都会调用String.valueOf方法，将对象转化为字符串
    System.out.println(obj);
  }
}
class customer{
    //重写toString方法
    public String toString(){
        return "我是自定义的toString方法";
    }
}
