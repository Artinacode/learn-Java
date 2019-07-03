package S0628JDBC模式N1;

import S0627JDBC.SignDemo;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.println("1 sign up 2 sign in");
        Scanner sc = new Scanner( System.in);
        int num =sc.nextInt();
        if(num==1){
            //登陆操作
            SignDemo demo =new SignDemo();
            demo.signup();
        }else{
            //注册操作
            ///
            SignDemo demo =new SignDemo();
            demo.signin();
            ///
        }
    }
}
