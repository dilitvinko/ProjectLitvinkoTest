package myFirstWorkDB;

import myFirstWorkDB.entity.User1;
import myFirstWorkDB.persistence.HibernateUtil;
import org.hibernate.Session;

public class EnterPoint {

    public static void main(String args[]) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User1 user1 = new User1();

        //user1.setFirstName("holy");
        //user1.setLastName("web_java000");

        session.save(user1);
        session.getTransaction().commit();
    }

    public void addToDB(User1 user1){
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();


        user1.setFirstName("new");
        user1.setLastName("qwe");
        user1.setAge(25);


        session.save(user1);
        session.getTransaction().commit();
    }

}
