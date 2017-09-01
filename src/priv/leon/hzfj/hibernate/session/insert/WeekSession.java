package priv.leon.hzfj.hibernate.session.insert;

import org.hibernate.Transaction;
import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.hibernate.HibernateSingle;
import priv.leon.hzfj.hibernate.interfaces.Insert;
import priv.leon.hzfj.hibernate.interfaces.Session;

import java.util.ArrayList;

public class WeekSession extends Session implements Insert{
    private ArrayList<Week> week_list=new ArrayList<>();

    public WeekSession(ArrayList<Week> week_list) {
        this.week_list = week_list;
        session();
    }

    @Override
    public void insert() {
        try{
            Transaction transaction = session.beginTransaction();//开启一个新的事务
            for(Week week:week_list){
                session.save(week);
            }
            transaction.commit();//提交事务
        } catch (Exception e){
        e.printStackTrace();
        //回滚事务
        session.getTransaction().rollback();
        }finally{
          if(session!=null){
            if(session.isOpen()){
                //关闭session
                session.close();
            }
        }
    }

    }
}
