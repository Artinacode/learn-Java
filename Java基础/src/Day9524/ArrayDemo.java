package Day9524;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray;
        String strArray[];
        intArray=new int[5];
        strArray=new String[10];
        float[] floatArray=new float[4];
        char[] ch={'a','b','c','d'};
        System.out.println("长度为:"+ch.length);
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]+"");
        }
        //输出字符串数组最后一个元素
        System.out.println(strArray[strArray.length-1]);
    }
}
