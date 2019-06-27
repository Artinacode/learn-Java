package S90624atm;

import Day9522.MethodDemo;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args){
        MethodDemo.printStar();
        System.out.println("欢迎使用SDUT Bank");
        MethodDemo.printStar();
        int ID = 10001;
        int pwd=88888;
        String username = "张三";
        int money =100;
        /////
        Scanner input = new Scanner(System.in);
        System.out.println("请输入密码");
        int mypwd = input.nextInt();
        if(pwd == mypwd){
            System.out.println("欢迎使用山梨ATM");
            //            //功能菜单
            int num = 0;
            while(num!=4){
                System.out.println("请输入数字选择功能:1.查询信息2.用户存款3.用户取款4.退卡");
                num=input.nextInt();
                if(num == 1)
                    System.out.println("半仙儿,您的账户已经被注销");
            }
        }else{
            System.out.println("卡号/密码错误");
        }
    }
}
