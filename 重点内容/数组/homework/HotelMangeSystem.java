package 数组.homework;

import java.util.Scanner;

/*编写程序，为酒店编写酒店管理系统，模拟订房，退房，打印所有房间状态等功能*/
public class HotelMangeSystem {

  public static void main(String[] args) {
//    创建酒店对象
    Hotel hotel=new Hotel();
//    首先输出友好页面
    System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
    System.out.println("请输入对应功能编号：【1】表示查看房间列表，【2】表示订房，【3】表示退房，【0】表示退出系统");
    Scanner s=new Scanner(System.in);
    while (true){
      System.out.println("请输入功能编号");
      int i=s.nextInt();
      if(i==1){
        hotel.print();
      } else if (i==2) {
        System.out.println("请输入订房编号：");
        int RoomNumber=s.nextInt();
        hotel.order(RoomNumber);
      } else if (i==3) {
        System.out.println("请输入退房编号：");
        int RoomNumber=s.nextInt();
        hotel.exit(RoomNumber);
      } else if (i==0) {
        System.out.println("退出系统");
      }else{
        System.out.println("您输入的功能编号不存在");
      }
    }
  }
}
