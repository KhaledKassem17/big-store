package com.software.team.BigStore.DBConnections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author tawfik
 */
public class Connection {

    private static SessionFactory sessionfactory;

    public Connection() {
        if (sessionfactory == null) {
            sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }
    }

    public void openFactory() {
        if (sessionfactory == null) {
            sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }
    }

    public void closeFactory() {
        if (sessionfactory != null) {
            sessionfactory.close();
        }
    }

    public Session getSession() {
        Session session = sessionfactory.openSession();
        session.beginTransaction();
        return session;
    }

}
