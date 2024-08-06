package org.example.module4.lesson12_improved_mapping;

import org.example.module4.lesson9_orm_hibbernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.createQuery("from UserExt", UserExt.class);
        session.close();
    }
}
