package S0628DAO重构ATM终极不改版;

import java.util.Scanner;

public class ATMSystem {
    Scanner sc = new Scanner(System.in);
    CustomerDAO dao = new CustomerDAO();
    private int cuid ; //当前登录的用户的卡号
    public  ATMSystem(){

    }
    public void query(){

    }
    public void save(){

    }
    public void get(){

    }
    public void change(){

    }
    public  boolean login(){
        System.out.println("请输入账号:");

        int uid = sc.nextInt();
        sc.nextLine();
        System.out.println("密码:");
        String upass=sc.nextLine();
        cuid = dao.login(uid,upass);
        if(cuid != -1){
            return true;
        }
        return false;
    }
    public  void begin(){
        if(login()){
            System.out.println("欢迎使用山理犇客ATM系统");
            //显示
            int num=0;
            while(num != 5){
                System.out.println("1查 2增 3取 4转 5退");
                num = sc.nextInt();
                switch (num){
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
                        change();
                        break;
                    case 5:
                        System.out.println("谢谢使用山理犇客ATM");
                        break;
                    default:
                        break;
                }
            }
        }else {
            System.out.println("卡号密码错误，登陆失败");
        }
    }
}
