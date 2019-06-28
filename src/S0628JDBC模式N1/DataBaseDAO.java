package S0628JDBC模式N1;

/**
 * JDBC 独立
 * 与业务层分离
 */
//业务层的数据问业务层要
// DAO层只操作数据库
public class DataBaseDAO {
    public boolean login(int mypwd){
        return true;
    }
}
