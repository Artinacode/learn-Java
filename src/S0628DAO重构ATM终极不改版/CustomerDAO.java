package S0628DAO重构ATM终极不改版;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.zip.CheckedOutputStream;

public class CustomerDAO extends FactoryDatabase{
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    public CustomerDAO() {
            super();
    }
    /**
     * 登陆功能
     */
    public int login (int uid,String upass){
        try {
            String sql = "select * from detail where uid = ? and upass = ? ";
            pstmt = getConn().prepareStatement(sql);
            pstmt.setInt(1,uid);
            pstmt.setString(2,upass);
            rs = pstmt.executeQuery();
            if(rs.next()){
              //  System.out.println("noe");
                return rs.getInt("uid");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            close(rs,pstmt,null);
        }
        return -1;
    }
}
