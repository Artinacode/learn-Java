package Day9525;

public class ArrayMethod {
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"     ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        ArrayMethod am=new ArrayMethod();
        am.printArray(arr);//传入数组的名字
    }
}
