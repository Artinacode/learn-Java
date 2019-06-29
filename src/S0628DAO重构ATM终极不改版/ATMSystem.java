package S0628DAO重构ATM终极不改版;


import java.util.Scanner;

public class ATMSystem {
    Scanner sc = new Scanner(System.in);
    CustomerDAO dao = new CustomerDAO();
    private int cuid ; //当前登录的用户的卡号
    public  ATMSystem(){

    }
    public void query(){
        System.out.println(dao.queryname(cuid)+",您的余额为:"+ dao.querymoney(cuid));
    }
    public void save(){
        System.out.println("请输入您要存入的金额:");
        int inmoney = sc.nextInt();
        dao.save(cuid,inmoney);
        System.out.println("存入成功");
    }
    public void get(){
        System.out.println("请输入您要取出的金额:");
        int outmoney = sc.nextInt();
        dao.get(cuid,outmoney);
        System.out.println("取出成功");
    }
    public void change(){
        System.out.println("请输入您要转入的账号:");
        int theid = sc.nextInt();
        System.out.println("请输入您要转入的金额");
        int themoney = sc.nextInt();
        dao.get(cuid,themoney);
        dao.save(theid,themoney);
        System.out.println("转账成功");
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
    public void regis(){
        int uid;
        String uname;
        String upass;
        System.out.println("请输入您的姓名:");
        uname = sc.nextLine();
        System.out.println("请输入账号:");
        uid = sc.nextInt();
        sc.nextLine();
        while (dao.findSameId(uid)){
            System.out.println("账号已存在,请重新输入");
            uid = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("请设置密码:");
        upass = sc.nextLine();
        dao.regis(uname,uid,upass);
        System.out.println(uname+",您的账号已注册成功");
        System.out.println("您的账号是:"+ uid);
        System.out.println("密码是:"+ upass);
        begin();

    }
    public  void begin(){
        System.out.println("欢迎使用山理犇客ATM系统");
        System.out.println("1 注册 2 登录 3 退出系统");
        int num0;
        num0 =sc.nextInt();
        sc.nextLine();
        int uid;
        if(num0 ==1){
           regis();
        }
        else if (num0 == 2){
            if(login()){

                //显示
                int num=0;
                while(num != 5){
                    System.out.println("1查 2增 3取 4转 5销 6退");
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
                            begin();
                        case 6:
                            System.out.println("感谢使用山理犇客ATM");
                            System.out.println("再见！");
                            break;
                        default:
                            break;
                    }
                }
            }else {
                System.out.println("卡号密码错误，登陆失败");
            }

        }
        else if(num0 == 3)
        {

        }
        else {
            System.out.println("请重新输入");
            begin();
        }

    }
}
