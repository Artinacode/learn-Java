package Day9524;

public class MaxFloat {
    //求最大值的方法
    public void max(float a,float b){
        float t;
        if(a>b)
            t=a;
        else
            t=b;
        System.out.println("max="+ t);
    }

    public static void main(String[] args) {
        int a=5,b=6;
        MaxFloat Max=new MaxFloat();
        Max.max(a,b);
    }
}
