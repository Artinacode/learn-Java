package Day9530;

public class CatTest {
    public static void main(String[] args) {
        //对象实例化
        Cat one;
        one = new Cat();
        //栈:存储对象地址  堆:存储对象空间
        Cat two= one;//两个对象附带同一个内存信息
        //test
        one.eat();
        one.run();
        one.name="花花";
        one.month=2;
        one.species="AB";
        System.out.println(one.name);
        System.out.println(one.species);
        System.out.println(one.weight);
        one.run(one.name);
    }
}
