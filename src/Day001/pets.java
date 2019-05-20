package Day001;

public class pets {
    public static void main(String[] args) {
        String[] pets = {"pets", "zeus", "Bin"};
        int x = pets.length;
        //random()方法可以取0~1之间的随机数
        int rand = (int )(Math.random() * x);
        String s = pets[rand];
        s = s + " " + "is a dog";
        System.out.println(s);
    }
}
