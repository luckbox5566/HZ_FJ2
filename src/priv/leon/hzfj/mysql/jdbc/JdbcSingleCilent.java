package priv.leon.hzfj.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSingleCilent {
    private Connection conn=null;
    private static JdbcSingleCilent cilent=null;

    private static final String URL="jdbc:mysql://localhost:3306/MySQL57";
    private static final String USER="root";
    private static final String PASS="87320893";
    private JdbcSingleCilent() {

        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            conn=null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            conn=null;
        }
    }

    public static JdbcSingleCilent single(){
        if(cilent==null){
            cilent=new JdbcSingleCilent();
        }
        return cilent;
    }

    public Connection getConn() {
        return conn;
    }
}
