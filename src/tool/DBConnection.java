package tool;

import java.sql.*;

/**
 * @author Brendan Lee
 */
public class DBConnection {

    //将连接数据库的数据设置为常量防止被改变
    private static final String JDBC_driver = "oracle.jdbc.driver.OracleDriver";
    private static final String JDBC_url= "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String JDBC_user = "JXC";
    private static final String JDBC_pwd = "JXC";

    //私有化Connection 每当需要用到DBConnection的时候就new一个新的,化解了线程的并发
    private Connection conn;

    /**
     * 将DBConnection的构造函数默认为false,则默认不开启事务,如需开始事务则new的时候往里传入true
     */
    public DBConnection() {
        this(false);
    }

    /**
     * 判断是否开始事务
     * @param isTransaction 是否开启事务
     */
    private DBConnection(boolean isTransaction){
        try {
            Class.forName(JDBC_driver);
            conn =DriverManager.getConnection(JDBC_url,JDBC_user,JDBC_pwd);
            conn.setAutoCommit(!isTransaction);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     * @throws SQLException 抛出异常
     */
    public void commit() throws SQLException {
        if(!conn.getAutoCommit()){
            conn.commit();
        }
    }

    /**
     * 回滚事务
     * @throws SQLException 抛出异常
     */
    public void rollback() throws SQLException {
        if(!conn.getAutoCommit()){
            conn.rollback();
        }
    }


    /**
     * 提交数据
     * @param sql 要执行的sql语句
     * @param param 传入的参数
     * @return 插入的行数
     * @throws SQLException 抛出异常
     */
    public int update(String sql,Object...param) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(sql);
        setParam(ps,param);
        return ps.executeUpdate();
    }

    /**
     * 查找数据
     * @param sql 要执行的sql语句
     * @param param 传入的参数
     * @return Result set object
     * @throws SQLException 抛出异常
     */
    public ResultSet select(String sql, Object...param) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(sql);
        setParam(ps,param);
        return ps.executeQuery();
    }


    /**
     * 关闭连接
     */
    public void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * 遍历往PreparedStatement添加数值
     * @param ps Prepared statement object
     * @param paramArr 参数数组
     * @throws SQLException 抛出异常
     */
    private void setParam(PreparedStatement ps , Object [] paramArr) throws SQLException {
        for (int i = 0; i < paramArr.length; i++) {
            Object param = paramArr[i];
            String type = param.getClass().getCanonicalName();
            int index = i + 1;
            switch (type){
                case "java.lang.String":
                    ps.setString(index,(String)param);
                    break;
                case "java.lang.Integer":
                    ps.setInt(index,(Integer)param);
                    break;
                case "java.lang.Double":
                    ps.setDouble(index,(Double)param);
                    break;
                case "java.lang.Float":
                    ps.setFloat(index,(Float)param);
                    break;
                default:
                    break;
            }
        }
    }




}
