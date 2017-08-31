package priv.leon.hzfj.hibernate.ddl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.cfg.Configuration;
import priv.leon.hzfj.app.bean.Week;

public class ExoprtDB {

    public static void main(String[] args) {
       Configuration cfr=new Configuration().configure();
       /*SchemaExport export=new SchemaExport(cfr);
       export.create(true,true);*/

    }
}
