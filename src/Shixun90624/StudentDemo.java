package Shixun90624;

public class StudentDemo {
    private String name;
   private int ID;//学号
    //String ame;//姓名
    double score;
//g构造方法：：无返回值类型
    public StudentDemo(int id,String name,double score){
        this.ID=id;
        this.name=name;
        this.score=score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static void main(String[] args) {
        StudentDemo stud1 = new StudentDemo(1,"22",333);
     //   stud1.setID(16);
        System.out.println(stud1.getID());
    }
}
