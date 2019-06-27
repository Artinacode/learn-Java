package S0627JDBC;
/**
 * 连接数据库的测试
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test {
    public static void main(String[] args) {
       // String username = "root";
        //String password = "123456";
        try{
            /**
             * 加载数据库驱动
             */
            Class.forName("org.gjt.mm.mysql.Driver");
            /**
             * 创建数据库连接
             */
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test","root","");
            /**
             * 创建数据库执行对象
             */
            //System.out.println("连接成功？");
            Statement stmt = conn.createStatement();
            /**
             * 执行SQL语句
             */
           // stmt.executeUpdate("insert into uus (uname,upass) values ('admin','999')" );
            ResultSet rs = stmt.executeQuery("select * from uus");

            /**
             * 处理结果集(针对查询操作)
             */
            
            /**
             * 关闭连接
             */
            stmt.close();
            conn.close();
        }catch (Exception e){
            System.out.println("获得数据库连接出错");
            e.printStackTrace();
        }
    }
}
