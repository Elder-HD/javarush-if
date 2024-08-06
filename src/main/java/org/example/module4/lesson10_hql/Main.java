package org.example.module4.lesson10_hql;

import org.example.module4.lesson9_orm_hibbernate.HibernateUtil;
import org.example.module4.lesson9_orm_hibbernate.User;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    private static final Session session = HibernateUtil.getSessionFactory().openSession();
    public static void main(String[] args) {
//        getUsersGreaterThanAge(15);
//        getAgeSum();
//        createUserWithAddress();
//        joinUserWithAddress();
//        getUsersFromValues();
//        System.out.println(session.createQuery("from User u order by age desc").list());
//        getUsersWithNamedQuery();
//        getUsersWithNativeQuery();


    }

    private static void getUsersWithNativeQuery() {
        NativeQuery<User> nativeQuery = session.createNativeQuery("select * from user where id = :id", User.class);
        nativeQuery.setParameter("id", 1);
        System.out.println(nativeQuery.list());
    }

    private static void getUsersWithNamedQuery() {
        System.out.println(session.createNamedQuery("User.findAll", User.class).list());
        Query<User> namedQuery = session.createNamedQuery("User.findById", User.class);
        namedQuery.setParameter("id", 1);
        System.out.println(namedQuery.uniqueResult());
    }

    private static void getUsersFromValues() {
        Query<User> query = session.createQuery("SELECT u from User u WHERE u.age IN (:ageSet)",User.class);
        query.setParameterList("ageSet", new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(query.list());
    }

    private static void joinUserWithAddress() {
        Query<Object[]> query = session.createQuery("SELECT u.firstName, a.street FROM User u JOIN u.address a where u.address.id = a.id", Object[].class);
        List<Object[]> list = query.list();

        for (Object[] str : list) {
            System.out.println(str[0] + " - " + str[1]);
        }
    }

    private static void createUserWithAddress() {
        Transaction transaction = session.beginTransaction();
        Address address = new Address("Lviv", "Horodotska");
        User user = new User("Homer", "Sympson", 40);
        user.setAddress(address);
        session.merge(user);
        transaction.commit();
    }

    private static void getUsersGreaterThanAge(int age) {
        Query<User> query = session.createQuery("SELECT u FROM User u WHERE u.age > :age", User.class);
        query.setParameter("age",age);
//        query.setFirstResult(1);
//        query.setMaxResults(1);
        try (ScrollableResults<User> scroll = query.scroll()) {
            while (scroll.next()) {
                scroll.get();
            }
        }
        List<User> list = query.list();
        System.out.println(list);
    }

    private static void getAgeSum() {
        Query<Long> query = session.createQuery("SELECT SUM(u.age) FROM User u", Long.class);
        System.out.println(query.uniqueResult());
    }
}
