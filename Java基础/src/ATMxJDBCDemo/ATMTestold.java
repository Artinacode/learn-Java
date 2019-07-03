package ATMxJDBCDemo;
import java.util.*;
public class ATMTestold {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //1.模拟1名储户
        int id = 10001; 		//卡号
        int pwd = 888888;		//密码
        String username = "张三";//姓名
        int money = 100; 		//余额

        //2.到ATM机器面前
        Scanner input = new Scanner(System.in);
        System.out.println("请输入密码:");
        int mypwd = input.nextInt();
        if(pwd == mypwd) {
            //登录成功
            System.out.println("欢迎使用东软ATM自动提款机");
            //显示功能菜单
            int num = 0;
            while(num != 4) {
                System.out.println("请选择以下功能:1.查询信息2.用户存款3.用户取款4.退卡");
                num = input.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("**********************");
                        System.out.println("卡号:"+id);
                        System.out.println("储户姓名:"+username);
                        System.out.println("余额:"+money);
                        System.out.println("**********************");
                        break;
                    case 2:
                        System.out.println("请输入您要存入的金额:");
                        int saveMoney = input.nextInt();
                        money = money + saveMoney;
                        System.out.println("存款成功！");
                        break;
                    case 3:
                        System.out.println("请输入您要取出的金额:");
                        int getMoney = input.nextInt();
                        if(money >= getMoney){
                            money = money - getMoney;
                            System.out.println("取款成功！");
                        }else {
                            System.out.println("余额不足！");
                        }

                        break;
                    case 4:
                        System.out.println("谢谢使用东软ATM");
                        break;
                    default:
                        break;
                }
            }
        }else {
            //登录失败
            System.out.println("卡号、密码错误,登录失败！");
        }
    }

}
