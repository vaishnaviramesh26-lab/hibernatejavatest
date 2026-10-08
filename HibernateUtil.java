package com.student;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory FACTORY =
            new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }

    public static void shutdown() {
        FACTORY.close();
    }
}
