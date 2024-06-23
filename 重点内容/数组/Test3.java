package 数组;

/*数组扩容*/
public class Test3 {
  public static void main(String[] args) {
//    在java开发中数组一旦确定了不可变，那数组满了怎么办。就要用到数组扩容
//    首先新建一个大容量数组，然后将原数组中的元素拷贝到新数组中
//    数组扩容效率低，涉及到拷贝，以后开发中尽可能少进行数组拷贝
//    源数组
    int[]src={1,11,2,3,4};
//    目标数组
    int[]dest=new int[20];
//    五个参数，分别是：源数组，源数组起始位置，目标数组，目标数组起始位置，拷贝长度，调用system中arraycopy方法进行调用
    System.arraycopy(src,1,dest,3,3);



  }
}
