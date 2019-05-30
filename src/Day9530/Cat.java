package Day9530;

/**
 * 宠物猫
 * @author mengxing
 */

public class Cat {
    //成员属性: 昵称,年龄,体重,品种
    String name;
    int month;
    double weight;
    String species;
    //方法:跑动 吃东西

    //跑动的方法
    public  void run(){
        System.out.println("跑了一步");
    }
    public void run(String name){
        System.out.println(name+"快跑");
    }
    //吃饭的方法
    public  void eat(){
        System.out.println("吃了一口");
    }
}
