package priv.leon.hzfj.hibernate.factotry;

import priv.leon.hzfj.hibernate.interfaces.Session;
import priv.leon.hzfj.hibernate.session.insert.*;

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
            case "insert_can_sell":
                NewHouseCanSellSession sellSession= (NewHouseCanSellSession) session;
                sellSession.insert();
                break;
            case "insert_ranking":
                NewHouseRankingSession newHouseRankingSession= (NewHouseRankingSession) session;
                newHouseRankingSession.insert();
                break;
            case "insert_sign":
                NewHouseSignSession newHouseSignSession= (NewHouseSignSession) session;
                newHouseSignSession.insert();
                break;
            case "insert_sign_type":
                NewHouseSignTypeSession newHouseSignTypeSession= (NewHouseSignTypeSession) session;
                newHouseSignTypeSession.insert();
                break;
            case "insert_zones":
                NewHouseZonesSession newHouseZonesSession= (NewHouseZonesSession) session;
                newHouseZonesSession.insert();
                break;

        }
    }
}
