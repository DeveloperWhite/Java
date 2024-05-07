package 对象的创建与使用.HusbandandWife;

public class TestHusbandAndWife {
    public static void main(String[] args) {
        //创建一个丈夫对象
        //创建一个妻子对象

        Husband m=new Husband();
        m.name="黄晓明";
        Wife a=new Wife();
        a.name="baby";
        //结婚：能够通过丈夫找到妻子，能够通过妻子找到丈夫
        m.w=a;//丈夫的m引用的Wife中的w相当于创建妻子对象的引用a
        a.h=m;//妻子的a引用的Husband中的h相当于创建丈夫对象的引用m
        //输出m的妻子的名字，有两种方式
        System.out.println(a.name);
        System.out.println(m.w.name);


    }
}
