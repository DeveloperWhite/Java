public class 九九乘法表 {
    /*
    1*1=1
    1*2=2 2*2=2
    1*3=3 2*3=6 3*3=9
    .............
     */

    public static void main(String[] args) {
        for(int i=1;i<=9;i++){//外层循环9次，i是行号，i*？=
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            //在里面的for循环即执行完一行后进行换行
            System.out.println("\n");
        }
    }
}
