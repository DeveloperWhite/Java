package static关键字;
public class chineseTest {
  public static void main(String[] args) {
    //创建中国人对象1
    Chinese zhangSan=new Chinese("1","张三");
    System.out.println(zhangSan.id+"，"+zhangSan.name+"，"+ Chinese.country);
    //创建中国人对象2
    Chinese liSi=new Chinese("2","李四");
    System.out.println(liSi.id+"，"+liSi.name+"，"+ Chinese.country);
  }
}
