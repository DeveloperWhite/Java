package 数组.算法;

import java.util.Arrays;

//算法在java中实际上不需要精通，因为java中已经封装好了，要排序调用方法即可
//java中提供了一个数组工具类Arrays
public class Arrays工具类
{
  public static void main(String[] args) {
    //工具类中大部分方法都是静态的
    int [] arr={1,2,23,21,4,33,66};
    //排序方法，Arrays工具类中方法特别多
    Arrays.sort(arr);
    //二分法查找，查找元素23的下标
    System.out.println(Arrays.binarySearch(arr,23));
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
      System.out.print('\t');
    }
  }
}
