package Day9524;
//输入一个数 求阶乘
import java.util.Scanner;

public class FacDemo {
    public int fac(int n){
        int s=1;
        for(int i=1;i<=n;i++){
            s*=i;
        }
        return s;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        FacDemo fac=new FacDemo();
        System.out.println(fac.fac(sc.nextInt()));

    }
}
