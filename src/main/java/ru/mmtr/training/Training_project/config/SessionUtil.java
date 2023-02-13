package ru.mmtr.training.Training_project.config;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.data.jpa.provider.HibernateUtils;

public class SessionUtil {

    private Session session;
    private Transaction transaction;

    public Session getSession(){return session;}
    public Transaction getTransaction() {return transaction;}

    public Session openSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }

    public Session openTransaction(){
        session = openSession();
        transaction = session.beginTransaction();
        return session;
    }

    public  void closeSession(){session.close();}
    public void closeTransaction(){
        transaction.commit();
        closeSession();
    }

}
