package 数组;

//main中的String赎罪会自动把终端运行后面添加的字符传入数组之中
public class TestString {
    public static void main(String[] args) {
      //查看main方法中的String args[]数组有什么用，数组长度默认为0
      System.out.println("JVM给传递过来的String数组参数的数组长度："+args.length);
      //创建一个长度为0的String数组对象，并输出他的长度
      //String[] strs=new String[0];
//    以下代码表示数组对象创建了，但数组中没有任何数据
//    String[] strs={};
      //printLength(strs);
//    例如这样运行，java Test1 abc xyz def ，这个时候JVM就会自动将abc def xyz 通过空格的方式分离，然后自动放到String数组中，主要用来收集用户参数
//    main方法上面的String数组主要用来接受用户输入参数
//    如果是在idea上运行可以找到运行下面的编辑配置，传入程序实参，应用运行即可
      //遍历数组输入main中String数组
      for(int i=0;i< args.length;i++){
        System.out.println(args[i]);
      }
    }
    //打印String数组长度的方法
    public static void printLength(String [] args){
      System.out.println(args.length);
    }
}
