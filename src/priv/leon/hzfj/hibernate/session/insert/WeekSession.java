package priv.leon.hzfj.hibernate.session.insert;

import priv.leon.hzfj.hibernate.HibernateSingle;
import priv.leon.hzfj.hibernate.interfaces.Insert;
import priv.leon.hzfj.hibernate.interfaces.Session;

public class WeekSession extends Session implements Insert{
    @Override
    public void session() {
       session=HibernateSingle.single().getSessionFactory().openSession();
    }


    @Override
    public int insert() {
        return 0;
    }
}
