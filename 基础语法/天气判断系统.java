

public class 天气判断系统 {
    /*
    判断当前天气
    当外面下雨时：
    带雨伞
    判断性别
    性别为男：带一把大黑伞
    性别为女：带一把小花伞
    当外面是晴天时
    判断温度
    当天气温度在30度以上
    性别为男：戴墨镜
    性别为女：擦防晒霜
     */
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("欢迎使用本系统，您通过本系统可以进行一些简单的判断");
        System.out.println("说明1:1表示下雨，0表示晴天");
        System.out.println("说明2：1表示男，0表示女");
        System.out.println("说明3：温度为数字");
        //接受性别
        System.out.println("请输入性别：");
        int sex=s.nextInt();
        //接受天气状况
        System.out.println("请输入当前天气情况：");
        int weather=s.nextInt();
        //判断天气
        if (weather==1){
            if(sex==1){
                System.out.println("带一把大黑伞");
            }else if(sex==0){
                System.out.println("带一把小花伞");
            }else {
                System.out.println("对不起，您的性别是怎么回事");
            }
        } else if (weather==0) {
            //只有在晴天要接受温度
            System.out.println("请输入当前温度：");
            int tem=s.nextInt();
            if(tem>30){
                if(sex==1){
                    System.out.println("戴墨镜");
                }else if(sex==0){
                    System.out.println("擦防晒霜");
                }else {
                    System.out.println("对不起，您的性别是怎么回事");
                }
            }
        }else{
            System.out.println("天气状况不存在");
        }


    }
}
