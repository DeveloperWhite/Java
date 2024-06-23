package 数组.homework;
/*酒店对象，酒店中有二维数组，二维数组模拟大厦所有房间*/
public class Hotel {
  private Room[][] rooms;

  public Hotel() {
    //动态初始化rooms数组
    rooms = new Room[3][10];//3行10列，3层楼，每层10个房间
//  创建30个Room对象放到数组中
//  怎么放，不能一个一个new，使用遍历
    for (int i = 0; i < rooms.length; i++) {
      for (int j = 0; j < rooms[i].length; j++) {
        if (i == 0)
          rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
        else if (i == 1) {
          rooms[i][j] = new Room((i + 1) * 100 + j + 1, "双人间", true);
        } else if (i == 2)
          rooms[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
      }
    }
  }

  //提供一个打印房间列表的方法
  public void print() {
//  打印房间状态
    for (int i = 0; i < rooms.length; i++) {
      for (int j = 0; j < rooms[i].length; j++) {
        Room room = rooms[i][j];
        System.out.print(room.toString());
        System.out.print('\t');
      }
//    换行
      System.out.println();
    }
  }

  //订房方法
//调用此方法需要传入一个房间编号
  public void order(int RoomNumber) {
//  订房最主要的是将room的staus状态由true修改为false
//  假设房间编号为207（下标编号为rooms【1】【6】）
//    通过房间编号拿到下标，获取对应的房间对象
    Room room = rooms[RoomNumber / 100 - 1][RoomNumber % 100 - 1];
    room.setStatus(false);
    System.out.println(RoomNumber+"已订房");
  }

  //退房方法
//调用此方法需要传入一个房间编号
  public void exit(int RoomNumber) {
//  订房最主要的是将room的staus状态由true修改为false
//  假设房间编号为207（下标编号为rooms【1】【6】）
//   通过房间编号拿到下标，获取对应的房间对象
    Room room = rooms[RoomNumber / 100 - 1][RoomNumber % 100 - 1];
    room.setStatus(true);
    System.out.println(RoomNumber+"已退房");
  }

}
