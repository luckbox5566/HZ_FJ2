package priv.leon.hzfj.hibernate.session.insert;

import org.hibernate.Transaction;
import priv.leon.hzfj.app.bean.NewHouseCanSell;
import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.hibernate.HibernateSingle;
import priv.leon.hzfj.hibernate.interfaces.Insert;
import priv.leon.hzfj.hibernate.interfaces.Session;

import java.util.ArrayList;

public class NewHouseCanSellSession extends Session implements Insert {
    private ArrayList<NewHouseCanSell> can_sell_list=new ArrayList<>();

    public NewHouseCanSellSession(ArrayList<NewHouseCanSell> can_sell_list) {
        this.can_sell_list = can_sell_list;
        session= HibernateSingle.single().getSessionFactory().openSession();
    }

    @Override
    public void insert() {
        try{
            Transaction transaction = session.beginTransaction();//开启一个新的事务
            for(NewHouseCanSell week:can_sell_list){
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
