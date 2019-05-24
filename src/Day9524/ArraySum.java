package Day9524;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"个元素");
            a[i]=sc.nextInt();
        }
        System.out.println("数组的内容为");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println();
        System.out.println("累加和为:");
        System.out.println(sum);
    }
}
