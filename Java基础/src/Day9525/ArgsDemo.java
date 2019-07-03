package Day9525;
//知识点:可变参数列表
public class ArgsDemo {
    public void sum (int... n){
        int sum=0;
        for(int i:n)
            sum+=i;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ArgsDemo ad=new ArgsDemo();
        ad.sum(1);
        ad.sum(1,2);
        ad.sum(1,2,3);
    }
}
