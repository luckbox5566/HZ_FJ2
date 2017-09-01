package priv.leon.hzfj.hibernate.factotry;

import priv.leon.hzfj.hibernate.interfaces.Session;
import priv.leon.hzfj.hibernate.session.insert.WeekSession;

public class HibernateDo {
    private Session session=null;
    private String sql="";

    public HibernateDo(Session session, String sql) {
        this.session = session;
        this.sql = sql;
    }

    public void commit(){
        switch (sql){
            case "insert":
                WeekSession weekSession=(WeekSession)session;
                weekSession.insert();
                break;
        }
    }
}
