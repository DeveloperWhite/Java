

public class Test6 {
    //转义字符  \  所以不能直接打印输出‘\’
    /*
      println表示输出完后要换行，print表示输出完后不换行
      例：'\n'属于换行符，属于char数据类型
         '\t'属于制表符（tab），在两个字母之间会有大空格
         '\\'第一个反斜杠是转义字符，能将第二个反斜杠转义成普通的字符并输出

     */
    public static void main (String[]args){
        char c='\n';
        System.out.print("A");
        System.out.print(c);
        System.out.println("B");
        char b='\t';
        System.out.print("A");
        System.out.print(b);
        System.out.println("B");
        System.out.println("\\");//*******'\\'第一个反斜杠是转义字符，能将第二个反斜杠转义成普通的字符并输出
        //控制台上不允许输出一个普通单引号，反斜杠具有转义功能将第二个单引号转义成普通的单引号字符
        System.out.println('\'');
        System.out.println('"');
        System.out.println("\"HelloWord\"");
        char d ='中';
        System.out.println(d);
        //JDK中自带的native2ascii.exe命令可将文字转换为unicode编码形式
        // （直接在cmd中运行即可，直接在cmd中输入native2ascii回车然后输入中文回车即可得到unicode编码）jdk 9之后没有native2ascii命令
        char e='\u4e2d';//‘中’的unicode编码是4e2d，反斜杠u（把u转义）作用：表示后面一串某个文字的unicode编码
        System.out.println(e);

    }
}
