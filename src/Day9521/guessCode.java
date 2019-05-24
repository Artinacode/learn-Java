package Day9521;

public class guessCode {
    public static void main(String[] args) {

        int rand1 = (int)(Math.random()*33);//随机数的使用
        int rand2 = (int)(Math.random()*33);
        int rand3 = (int)(Math.random()*33);
        int rand4 = (int)(Math.random()*33);
        int rand5 = (int)(Math.random()*33);
        int rand6 = (int)(Math.random()*33);
        //for(int i=1;i<5;i++)
        {
            System.out.println("The guess code is ："+ rand1+ " " + rand2+" "+rand3+" " + rand4+" "+rand5+ " "+rand6);
        }


    }

}
