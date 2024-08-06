package org.example.module4.lesson9_orm_hibbernate;

import lombok.Getter;
import org.example.module4.lesson10_hql.Address;
import org.example.module4.lesson12_improved_mapping.UserExt;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    @Getter
    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration()
                .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect")
                .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
                .setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/javarush")
                .setProperty("hibernate.connection.username", "root")
                .setProperty("hibernate.connection.password", "root")
                .setProperty("hibernate.hbm2ddl.auto", "update")
                .setProperty("hibernate.show_sql", "true")
                //.setProperty("hibernate.format_sql","true")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(UserExt.class);

        sessionFactory = configuration.buildSessionFactory();
    }

}
