package S0628DAO重构ATM终极不改版;

import java.sql.*;

/**
 * 初始化 大桥构造
 */
public class FactoryDatabase {
    private Connection conn = null;
    public FactoryDatabase() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8", "root", "123456");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /**
     * 关闭方法
     */
    public  void close(ResultSet rs, PreparedStatement pstmt, Connection conn){
        try{
            if(rs != null){
                rs.close();
            }
            if(pstmt != null){
                pstmt.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * 子类通过getconn方法调用获得父类中的conn
     * @return 父类中建立的大桥
     */
    public Connection getConn(){
        return conn;
    }
}
