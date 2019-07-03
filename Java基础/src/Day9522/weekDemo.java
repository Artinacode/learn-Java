package Day9522;

import java.util.Scanner;

public class weekDemo {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("请输入1-7之间的数字");
        int n = day.nextInt();
     //   String week = day.next();
        //week = week.toUpperCase();
        switch(n){
            case 1:
                System.out.println("星期一");break;
            case 2:
                System.out.println("星期二");break;
             default:
                 System.out.println("超出范围");
        }
    }
}
