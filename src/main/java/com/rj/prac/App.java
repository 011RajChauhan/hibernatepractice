package com.rj.prac;

import com.rj.prac.entities.Address;
import com.rj.prac.entities.Student;
import com.rj.prac.entities.User;
import com.rj.prac.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static SessionFactory sessionFactory;
    public static void main( String[] args )
    {
        System.out.println( "-------------------------starting application -------------------" );

        User user = new User("Rajan Chauhan");
        user.setOfficeAddress(new Address("noida","india"));
        user.setHomeAddress(new Address("delhi","india"));

        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(user);

        session.getTransaction().commit();
        session.close();

    }
}
