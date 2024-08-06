package org.example.module4.lesson9_orm_hibbernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

//        //insert user
//        Transaction insertTransaction = session.beginTransaction();
//        User insertUser = new User("John", "Snow", 18);
//        session.persist(insertUser);
//        insertTransaction.commit();
//
//        //read user
        User readUser = session.get(User.class, 1L);
        System.out.println(readUser);
//
//        //read all users
//        for (User user : session.createQuery("from User", User.class).list()) {
//            System.out.println(user);
//        }
//
//        //delete user
//        Transaction deleteTransaction = session.beginTransaction();
//        User deleteUser = session.get(User.class, 2L);
//        session.remove(deleteUser);
//        deleteTransaction.commit();

    }
}
