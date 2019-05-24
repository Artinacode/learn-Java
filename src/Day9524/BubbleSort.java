package Day9524;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a;
        a=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("排序前序列:");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        int temp;
        for (int i=0;i<a.length-1;i++)
            //内层循环控制每一趟排序
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        System.out.println("排序后序列:");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
