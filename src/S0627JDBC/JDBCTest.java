package S0627JDBC;
/**
 * 连接数据库的测试
 */
import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
            String user="werty";
            String pass="wwwrr" ;
        try{
            /**
             * 加载数据库驱动
             */
            Class.forName("org.gjt.mm.mysql.Driver");
            /**
             * 创建数据库连接
             */
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8","root","");


            /**
             * 创建数据库执行对象
             */
            //System.out.println("连接成功？");
//            Statement stmt = conn.createStatement();
//            /**
//             * 执行SQL语句
//             */
//           stmt.executeUpdate("insert into uus (uname,upass,uid,umoney) values ('"+user+"','88888',1111,9)" );
//            ResultSet rs = stmt.executeQuery("select * from uus");
//            while(rs.next()){
//                System.out.println("ID:" + rs.getInt("id"));
//                System.out.println("name:"+ rs.getString("uname"));
//                System.out.println("password:" + rs.getString("upass"));
//                System.out.println("Money:" + rs.getInt("umoney"));
//                System.out.println();
//            }
            /**
             * 新时代的快递员
             */
            String sql = "insert into uus (uname,upass,uid,umoney) values (?,?,1111,9)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user);
            pstmt.setString(2,pass);
            pstmt.executeUpdate();
            //System.out.println(pstmt);
            /**
             * 处理结果集(针对查询操作)
             */

            /**
             * 关闭连接
             */
            //rs.close();
            pstmt.close();
            conn.close();
        }catch (Exception e){
            System.out.println("获得数据库连接出错");
            e.printStackTrace();
        }
    }
}
