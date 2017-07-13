package com.company.hibernate.workshop.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();

    public static SessionFactory getSession() {
        return SESSION_FACTORY;
    }

    public static void closeSession() {
        getSession().close();
    }

}