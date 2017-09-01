package priv.leon.hzfj.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSingle {
    private static  HibernateSingle hibernateSingle=null;
    private static  StandardServiceRegistry registry=null;
    private static SessionFactory sessionFactory=null;
    private HibernateSingle() {
        registry=new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static HibernateSingle single(){
        if(hibernateSingle==null){
            hibernateSingle=new HibernateSingle();
        }
        return hibernateSingle;
    }

    public  SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
