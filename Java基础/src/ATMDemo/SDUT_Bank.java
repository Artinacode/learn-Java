package ATMDemo;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class SDUT_Bank {
    public static void main(String[] args) {
        Atm.say_hello();
        Newpeople neo=new Newpeople(); //初始化储户
       // System.out.println(neo.getPwd());
        neo.setpeople();
        ////////////////////////
        Signin s =new Signin();
        s.sign(neo);//登陆模块
        //////////////////////////
        //功能模块
    }
}
