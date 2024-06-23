package 数组;

/*二维数组*/
//
public class Test4 {
  public static void main(String[] args) {
//    静态初始化二维数组
    int[][] a = {
            {100, 200, 300},
            {10, 20, 30, 40},
            {0}
    };
    printArray(a);
//    动态初始化
    int[][] array = new int[3][4];
//    注意区分
    System.out.println(a.length);//4
    System.out.println(a[0].length);//3
    System.out.println(a[0][0]);//100
//    遍历二维数组
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.println(a[i][j]);
      }
    }
  }
  public static void printArray(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.println(a[i][j]);
      }
    }
  }
}