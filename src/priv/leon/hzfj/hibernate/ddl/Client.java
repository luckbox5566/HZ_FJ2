package priv.leon.hzfj.hibernate.ddl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import priv.leon.hzfj.app.bean.Week;

public class Client {
    public static void main(String[] args) {
        //但在5.1.0版本汇总，hibernate则采用如下新方式获取：
        //1. 配置类型安全的准服务注册类，这是当前应用的单例对象，不作修改，所以声明为final
        //在configure("cfg/hibernate.cfg.xml")方法中，如果不指定资源路径，默认在类路径下寻找名为hibernate.cfg.xml的文件
        final StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
        //2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();


        Session session=null;
        try{
            /****上面是配置准备，下面开始我们的数据库操作******/
            session = sessionFactory.openSession();//从会话工厂获取一个session

            Transaction transaction = session.beginTransaction();//开启一个新的事务

            Week week=new Week();
            week.setDate("date");
            week.setUrl("url");
            week.setTitle("title");
            session.save(week);
            transaction.commit();//提交事务
        }catch (Exception e){
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
