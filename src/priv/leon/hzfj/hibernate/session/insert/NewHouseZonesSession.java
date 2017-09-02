package priv.leon.hzfj.hibernate.session.insert;

import org.hibernate.Transaction;
import priv.leon.hzfj.app.bean.NewHouseSignType;
import priv.leon.hzfj.app.bean.NewHouseZones;
import priv.leon.hzfj.hibernate.interfaces.Insert;
import priv.leon.hzfj.hibernate.interfaces.Session;

import java.util.ArrayList;

public class NewHouseZonesSession extends Session implements Insert {
    private ArrayList<NewHouseZones> zones_list=new ArrayList<>();

    public NewHouseZonesSession(ArrayList<NewHouseZones> zones_list) {
        this.zones_list = zones_list;
    }

    @Override
    public void insert() {
        try{
            Transaction transaction = session.beginTransaction();//开启一个新的事务
            for(NewHouseZones week:zones_list){
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
