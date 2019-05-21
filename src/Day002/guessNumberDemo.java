package Day002;

import java.util.Scanner;
//一个猜数字游戏
public class guessNumberDemo {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10);
       // System.out.println(num);
        int guess;
        do{
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if(guess<num)
                System.out.println("It will be more");
            else System.out.println("It will be less");
        }
        while(guess != num);

        System.out.println("您猜中了,答案是" + num );
    }
}
