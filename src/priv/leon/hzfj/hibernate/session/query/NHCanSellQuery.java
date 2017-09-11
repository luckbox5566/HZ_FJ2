package priv.leon.hzfj.hibernate.session.query;

import org.hibernate.Transaction;
import priv.leon.hzfj.app.bean.NewHouseCanSell;
import priv.leon.hzfj.hibernate.HibernateSingle;
import priv.leon.hzfj.hibernate.interfaces.Query;
import priv.leon.hzfj.hibernate.interfaces.Session;

import java.util.ArrayList;
import java.util.List;

public class NHCanSellQuery extends Session implements Query{
    ArrayList<NewHouseCanSell> new_house_can_sell=new ArrayList<>();
    @Override
    public <T> List<T> query() {
        try{
            session= HibernateSingle.single().getSessionFactory().openSession();
            org.hibernate.query.Query query=session.createQuery("from nh_can_sell");
            List list=query.list();
            for(int i=0;i<list.size();i++){
                new_house_can_sell.add((NewHouseCanSell) list.get(i));
            }

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
        return (List<T>) new_house_can_sell;
    }
}
