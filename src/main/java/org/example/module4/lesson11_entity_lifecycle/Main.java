package org.example.module4.lesson11_entity_lifecycle;

import org.example.module4.lesson9_orm_hibbernate.HibernateUtil;
import org.example.module4.lesson9_orm_hibbernate.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Main {
    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public static void main(String[] args) {
//
//        //Transient
//        User user = new User();
//        user.setFirstName("Mike");
//
//        //Persistent
//        try (Session session = sessionFactory.openSession()) {
//            Transaction tx = session.beginTransaction();
//            session.persist(user);
//            tx.commit();
//        }
//
//        //Detached
//        try (Session session = sessionFactory.openSession()) {
//            Transaction tx2 = session.beginTransaction();
//            user.setFirstName("John");
//            session.merge(user);
//            tx2.commit();
//        }
//        try (Session session = sessionFactory.openSession()) {
//            User user = session.load(User.class, 1L);
//            session.evict(user);
//            user.sayHello();
//
//        }

    }
}
