package S0627JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SignDemo {
    Scanner sc = new Scanner(System.in);

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    // String inn = sc.nextLine();
    int s;
    String ss;
    String uname;
    public  void signin() {

        /**
         * 开启数据库
         */

        System.out.println("欢迎注册ATM系统");
        System.out.println("请输入您的姓名:");
        uname = sc.nextLine();
        System.out.println("请输入您要注册的账号:");
        s = sc.nextInt();
        sc.nextLine();
        //System.out.println("您的账号是"+ s);
        System.out.println("请设置您的密码");
        ss = sc.nextLine();
        // System.out.println("密码是"+ ss);
        ///////////////////////////////
        try {
            /**
             * 加载数据库驱动
             */
            Class.forName("org.gjt.mm.mysql.Driver");
            /**
             * 创建数据库连接
             */
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test", "root", "123456");
            /**
             * 创建数据库执行对象
             */
            //System.out.println("连接成功？");
            Statement stmt = conn.createStatement();
            /**
             * 执行SQL语句
             */
            int count =stmt.executeUpdate("insert into uus (uname,upass,uid,umoney) values ('" + uname + "','" + ss + "','" + s + "',0)");
            if(count>0){
                System.out.println("恭喜您注册成功!");

                System.out.println("您的账号是:" + s);
                System.out.println("您的密码是:" + ss);
            }else {
                System.out.println("注册失败！！！");
            }

            /////////////////
            /**
             * 处理结果集(针对查询操作)
             */

            /**
             * 关闭连接
             */
            //     rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("获得数据库连接出错");
            e.printStackTrace();
        }
    }

    public  boolean signup() {
        boolean fg = false;
        //Scanner sc = new Scanner(System.in);
       // String inn = sc.nextLine();
        System.out.println("请输入账号");
        s = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入密码");
        ss = sc.nextLine();

        try {
            /**
             * 加载数据库驱动
             */
            Class.forName("org.gjt.mm.mysql.Driver");
            /**
             * 创建数据库连接
             */
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test", "root", "123456");
            /**
             * 创建数据库执行对象
             */
            //System.out.println("连接成功？");
            Statement stmt = conn.createStatement();
            /**
             * 执行SQL语句
             */

            ResultSet rs = stmt.executeQuery("select * from uus where uid = "+s+" and upass = '"+ss+"'");

            /**
             * 登陆的【笨】方法
             */
 //           int p = 0;
//            while (rs.next()) {
//                if (rs.getInt("uid")==s && rs.getString("upass").equals(ss)) {
//                    p++;
//                    System.out.println("登陆成功,请稍后...");
//                    fg = true;
//                }
            /**
             * 登陆的优化方法
             */
            if(rs.next()){
                System.out.println("登陆成功,请稍后...");
                fg = true;
            }
            if (!fg)
                System.out.println("卡号/密码有误,请重试");
            /////////////////
            /**
             * 处理结果集(针对查询操作)
             */

            /**
             * 关闭连接
             */
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("获得数据库连接出错");
            e.printStackTrace();
        }
        ///////////////////////////////
        return fg;
    }

}




