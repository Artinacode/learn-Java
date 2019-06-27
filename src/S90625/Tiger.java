package S90625;

public class Tiger extends animal{
    public void eat(){
        super.eat();//super能调用父类继承过来的一切方法
        System.out.println("meat emmm");
    }
}
