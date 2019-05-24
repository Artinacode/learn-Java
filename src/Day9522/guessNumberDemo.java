package Day9522;

import java.util.Scanner;

//一个猜数字游戏
public class guessNumberDemo {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10);
       // System.out.println(num);
        int guess;
        int k = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("请在0~~~10之间猜一个数:");
            guess = sc.nextInt();
            k++;
            if(guess<num)
                System.out.println("It will be more");
            else System.out.println("It will be less");
        }
        while(guess != num&&k<=5);
        switch (k){
            case 1:
                System.out.println("聪明绝顶!");
                System.out.println("您猜中了,答案是" + num );
                System.out.println("一共猜了"+k+"次");
                break;
            case 2:
                System.out.println("聪慧过人");System.out.println("您猜中了,答案是" + num );
                System.out.println("一共猜了"+k+"次");break;
            case 3:
                System.out.println("You are so cute");System.out.println("您猜中了,答案是" + num );
                System.out.println("一共猜了"+k+"次");break;
            case 4:
                System.out.println("oh 你终于猜对了");System.out.println("您猜中了,答案是" + num );
                System.out.println("一共猜了"+k+"次");break;
            case 5:
                System.out.println("您是蒙对的吧");System.out.println("您猜中了,答案是" + num );
                System.out.println("一共猜了"+k+"次");break;
            default:
                System.out.println("抱歉,5次机会已经用完了");break;
        }

    }
}
