package ATMDemo;

import java.util.ArrayList;

public class Newpeople extends people {
    ArrayList peo = new ArrayList();
    public ArrayList setpeople(){

        peo.add(new people(10001,"Amy",1001,true,0));
        peo.add(new people(10002,"Saly",1002,true,0));
        peo.add(new people(10003,"Lily",1003,false,0));
        peo.add(new people(10004,"Peter",1004,false,0));
        peo.add(new people(10005,"Tom",1005,false,0));
        System.out.println("生成储户成功");
        /////////////////////////////展示所有用户信息
        //  System.out.println("");
        // for(int i=0;i<peo.size();i++){
        //  people p1 = (people) peo.get(i);
        // p1.display();
        //   System.out.println();
        return peo;
    }


}
