public class Test5 {
    //数据类型
    /*
    数据类型的作用是JVM在运行程序的过程中给该数据分配多大的内存空间
    数据类型的分类：基本数据类型：四大类，八小种：第一类：整数型 byte，short，int，long
                                          第二类：浮点型 float，double
                                          第三类：布尔型 boolean
                                          第四类：字符型 char
                 字符串不属于基本数据类型（String），属于引用数据类型：“abc”
                 基本数据类型占用空间大小：byte      1（字节）    取值范围：-128-127  可表示256个不同的数字
                                      short     2
                                      int       4
                                      long      8
                                      float     4
                                      double    8
                                      boolean   1
                                      char      2
                 计算机在任何情况下都只能识别二进制：例：100100101010
                 八种基本数据类型中char表示的是现实中的文字，文字和计算机的二进制不存在转换关系的，
                 因此，人提前制定好文字和计算机二进制编码的转换关系，这种关系被称为“字符编码”。
                 最先出现的字符编码（支持英文）是ASCII码，当解码和编码本是同一套对照表时会出现乱码
                 java语言源代码采用的是unicode编码方式，所以标识符可以写中文
                 引用数据类型：
     */
    public static void main(String[] args){
        char c='A';
        System.out.println(c);
    }
}
