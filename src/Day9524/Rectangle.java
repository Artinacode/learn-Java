package Day9524;
//无参数 有返回值
public class Rectangle {
    public int area(){
        int length=10;
        int width=5;
        int getArea=length*width;
        return  getArea;//返回语句
    }

    public static void main(String[] args) {
        Rectangle rc=new Rectangle();
        System.out.println(rc.area());
    }
}
