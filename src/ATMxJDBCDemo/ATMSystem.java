package ATMxJDBCDemo;

import S0627JDBC.SignDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ATMSystem {

    //private ArrayList ulist = new ArrayList();
    Scanner input = new Scanner(System.in);
    Customer cust;   //当前登录成功的用户
    /**
     * 构造方法初始化4名顾客并存储到集合中
     */
    public ATMSystem() {

    }

    public void query() {
        System.out.println("**********************");
        System.out.println("卡号:"+cust.getId());
        System.out.println("储户姓名:"+cust.getUsername());
        System.out.println("余额:"+cust.getMoney());
        System.out.println("**********************");
        ///////////////////////////////////////////////

    }

    public void save() {
        System.out.println("请输入您要存入的金额:");
        int saveMoney = input.nextInt();
        cust.setMoney(cust.getMoney()+saveMoney);
        System.out.println("存款成功！");
    }

    public void get() {
        System.out.println("请输入您要取出的金额:");
        int getMoney = input.nextInt();
        if(cust.getMoney() >= getMoney){
            cust.setMoney(cust.getMoney() - getMoney);
            System.out.println("取款成功！");
        }else {
            System.out.println("余额不足！");
        }

    }
//    public void change() {
//        System.out.println("请输入您要转入的账号：");
//        int inid = input.nextInt();
//        for(int i=0;i<ulist.size();i++){
//            Customer c = (Customer)ulist.get(i);
//            if(c.getId() == inid) {
//                System.out.println("请输入您要转账的金额：");
//                int inMoney = input.nextInt();
//                c.setMoney(c.getMoney() + inMoney);
//                cust.setMoney(cust.getMoney() - inMoney);
//                System.out.println("转账成功！");
//                return;
//            }
//        }
//        System.out.println("没有您要转入的卡号！");
//    }
    //登录成功
//    public boolean login() {
//
//        System.out.println("请输入密码:");
//        int mypwd = input.nextInt();
//        for(int i=0;i<ulist.size();i++){
//            Customer c = (Customer)ulist.get(i);
//            if(c.getPwd()==mypwd) {
//                cust = c;
//                return true;
//            }
//        }
//        return false;
//    }

    public void begin() {


        /////////////////////////////////////////////////////////////////////
        System.out.println("欢迎使用东软ATM自动提款机");
        System.out.println("请选择以下功能：1.注册账户 2.登陆系统");
        int  sw = input.nextInt();
        switch (sw){
            case 1:
                SignDemo si =new SignDemo();
                si.signin();
                begin();
            case 2:
                SignDemo su =new SignDemo();
                if(su.signup()) {
                    //////////////
                    //////////////
                    //显示功能菜单
                    int num = 0;
                    while(num != 5) {
                        System.out.println("请选择以下功能:1.查询信息2.用户存款3.用户取款4.实时转账5.退卡");
                        num = input.nextInt();
                        switch (num) {
                            case 1:
                                query();
                                break;
                            case 2:
                                save();
                                break;
                            case 3:
                                get();
                                break;
                            case 4:
                                // change();
                                break;
                            case 5:
                                System.out.println("谢谢使用东软ATM");
                                break;
                            default:
                                break;
                        }
                    }
                }else {
                   begin();
                }
                break;

        }


    }
}
