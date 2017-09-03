package priv.leon.hzfj.hibernate.interfaces;

import priv.leon.hzfj.hibernate.HibernateSingle;

public  abstract class Session {
    public static org.hibernate.Session session=null;
    public static void session(){
        //session= HibernateSingle.single().getSessionFactory().openSession();
    };

}
