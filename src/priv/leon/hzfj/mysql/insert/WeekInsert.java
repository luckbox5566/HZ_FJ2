package priv.leon.hzfj.mysql.insert;

import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.mysql.interfaces.Insert;
import priv.leon.hzfj.mysql.interfaces.Sql;

import java.sql.SQLException;
import java.util.ArrayList;


public class WeekInsert extends Sql implements Insert{
    private ArrayList<Week> week_b_list=new ArrayList<>();

    public WeekInsert(ArrayList<Week> week_b_list) {
        this.week_b_list = week_b_list;
    }

    @Override
    public void sql() {

    }

    @Override
    public int insert() {
        int i=0;
        try {
            i=statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
