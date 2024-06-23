package 数组.homework;

//酒店的房间
public class Room {
  /*房间编号
  一楼：101,102，103，104，105,106
  二楼：201，202，203，204,205，206
  三楼：301，302，303，304，305，306
   */
  private int number;
  //房间类型：单人间，双人间，总统套房
  private String type;
  //房间状态：true表示空，false表示房间满
  private boolean status;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Room(int number, String type, boolean status) {
    this.number = number;
    this.type = type;
    this.status = status;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
//  equals方法重写
public boolean equals(Object obj) {
  //如果obj指向null或者obj没有指向Room
  if (obj == null || !(obj instanceof Room)) {
    return false;
  }
  //如果obj和this本来对象的内存地址相同
  if (obj == this) {
    return true;
  }
  //表示能转型
  Room m = (Room) obj;
  return this.number == m.number;
}
//  toString方法重写
//  把原来输出的对象内存地址转化为我们希望看到的具体信息
  @Override
  public String toString() {
    return "["+number+","+type+","+status+"]";
  }

  public static void main(String[] args) {
    Room room=new Room(101,"单人间",true);
    Room room1=new Room(102,"单人间",true);
    System.out.println(room.equals(room1));
    System.out.println(room);
    System.out.println(room1);
  }
}
