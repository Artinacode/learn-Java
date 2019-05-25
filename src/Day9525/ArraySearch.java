package Day9525;

import java.util.Scanner;

public class ArraySearch {
    public  boolean search (int n,int[] arr){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                flag=true;
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入要查找的数据");
        int n1=sc.nextInt();
        ArraySearch as=new ArraySearch();
        boolean flag=as.search(n1,arr1);
        if(flag)
            System.out.println("Get it");
        else
            System.out.println("Can't get it");
    }
}
