package Day9522;

import java.util.Scanner;

public class MethodDemo {
    public  static void printStar(){
        System.out.println("*************************");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
       // sc.next();
        MethodDemo myMethodDemo = new MethodDemo();
        myMethodDemo.printStar();
        System.out.println("欢迎来到Java的世界！");
        myMethodDemo.printStar();
    }
}
