package ATMDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Signin {
    public  void  sign(Newpeople neo){
        System.out.println("请输入账号");
        Scanner sc = new Scanner(System.in);
        Scanner sw = new Scanner(System.in);
        int you;
        you=sc.nextInt();
        System.out.println("请输入密码");
        int youpwd=sw.nextInt();
        System.out.println("checking,please wait");
        Newpeople si = new Newpeople();
        int i=1;
        if(i==1){
            //登录成功
            System.out.println("欢迎使用ATM自动提款机");
            //显示功能菜单
            int num = 0;
            while(num != 4) {
                System.out.println("请选择以下功能:1.查询信息2.用户存款3.用户取款4.退卡5.转账");
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("**********************");

                        System.out.println("**********************");
                        break;
                    case 2:
                        System.out.println("请输入您要存入的金额:");
                        int saveMoney = sc.nextInt();
                       //money = money + saveMoney;
                        System.out.println("存款成功！");
                        break;
                    case 3:
                        System.out.println("请输入您要取出的金额:");
                        int getMoney = sc.nextInt();
                       // if(money >= getMoney){
                       //     money = money - getMoney;
                            //System.out.println("取款成功！");
                       // }else {
                       //     System.out.println("余额不足！");
                       // }

                        break;
                    case 4:
                        System.out.println("谢谢使用东软ATM");
                        break;
                    case 5:
                        System.out.println("请输入转账账户");
                        System.out.println("请输入转账金额");
                    default:
                        break;
                }
            }
        }else
            //登录失败
            System.out.println("卡号、密码错误,登录失败！");
        }
    }

