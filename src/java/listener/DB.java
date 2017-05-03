/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Web application lifecycle listener.
 *
 * @author mina george
 */
public class DB {

    public DB() {
        sf = new Configuration().configure().buildSessionFactory();
        s = sf.openSession();
    }

    public static SessionFactory sf = new Configuration().configure().buildSessionFactory();
    public static Session s = sf.openSession();
;

}
