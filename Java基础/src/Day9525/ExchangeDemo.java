package Day9525;
//方法中的值交换  主方法中值不变
public class ExchangeDemo {
    public void  swap(int a,int b){
        int temp;
        System.out.println("交换前a="+a+",b="+b);
        temp=a;a=b;b=temp;
        System.out.println("交换后:a="+a+",b="+b);
    }
    public  void swapTest(){
        int m=5,n=4;
        System.out.println("交换前m="+m+",n="+n);
        swap(m,n);
        System.out.println("交换后:m="+m+",n="+n);
    }

    public static void main(String[] args) {
      ExchangeDemo ed=new ExchangeDemo();
      ed.swapTest();
    }

}
