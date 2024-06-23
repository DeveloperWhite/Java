

public class 素数练习题 {
    /*
    编写1-100内所有的素数，每八个换一行
    素数：又被称为质数，能够被1和自身整除，不能被其他数字整除的数字称为素数
    思路：int i=7
    7%1=0
    7%2=1
    7%3=1
    7%4=3
    7%5=2
    7%6=1
    7%7=0
    7是素数
     */
    public static void main(String[] args) {
        int count=0;//计数器
        for(int i=1;i<100;i++){
            boolean iSSuShu=true;
            for(int j=2;j<i;j++){
                if(i%j==0){//判断是否为素数
                    iSSuShu=false;
                    break;
                }
            }
            if (iSSuShu){
                count++;//用于每8个数字换行
                System.out.print(i+" ");
                if(count%8==0){//判断换行条件
                    System.out.println();
                }
            }
        }
    }
}
