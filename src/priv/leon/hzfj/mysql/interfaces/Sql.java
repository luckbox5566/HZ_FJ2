package priv.leon.hzfj.mysql.interfaces;

import priv.leon.hzfj.mysql.jdbc.JdbcSingleCilent;

import java.sql.Statement;

public abstract class Sql {
    public static String sql="";
    public static Statement statement= JdbcSingleCilent.single().getStatement();
    public abstract void sql();
}
