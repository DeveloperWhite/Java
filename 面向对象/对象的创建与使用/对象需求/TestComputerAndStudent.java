package 对象的创建与使用.对象需求;
/*
定义一个计算机类
属性：
品牌
型号
颜色
定义一个学生类
属性：
学号：
姓名：
学生有一台笔记本电脑：
请编写程序来表示以上类，然后分别将类创建为对象
对象数量不限，然后让其中一个学生去使用一台笔记本电脑
然后编译运行
 */
public class TestComputerAndStudent {
    public static void main(String[] args) {
        //创建一个学生对象
        //创建一个笔记本对象
        //让学生对象和笔记本对象产生关系
        Student s=new Student();
        Computer m=new Computer();
        //手动赋值
        s.name="zhangSan";
        s.num=12;
        s.ownComputer=m;
        m.brand="Dell";
        m.style="G5";
        m.colour="red";
        //访问s同学的笔记本品牌
        System.out.println(s.ownComputer.brand);//Dell
        //修改品牌
        s.ownComputer.brand="Apple";
        System.out.println(s.ownComputer.brand);//Apple
        //s学生买了一台新的电脑，所以新电脑的品牌为空
        s.ownComputer=new Computer();
        System.out.println(s.ownComputer.brand);//Null
    }

}
