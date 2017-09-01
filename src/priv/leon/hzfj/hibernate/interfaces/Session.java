package priv.leon.hzfj.hibernate.interfaces;

public  abstract class Session {
    public static org.hibernate.Session session=null;
    public abstract void session();
}
