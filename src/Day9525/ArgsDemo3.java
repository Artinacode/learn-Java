package Day9525;
/**
 * 关于可变参数列表和重载的问题
 * @author mengxing
 * @version 1.0
 *
 */
public class ArgsDemo3 {
    //可变参数所在的方法最后被访问
    //文档注释
    public int plus(int a,int b){
        System.out.println("不带可变参数的方法!");
        return a+b;
    }
    public  int plus(int... a){
        int sum=0;
        for(int n:a){
            sum+=n;
        }
        System.out.println("带可变参数的方法!");
        return sum;
    }

    public static void main(String[] args) {
        ArgsDemo3 ad=new ArgsDemo3();
        System.out.println(ad.plus(1,2));
        System.out.println(ad.plus(1,2,3));
    }
}


