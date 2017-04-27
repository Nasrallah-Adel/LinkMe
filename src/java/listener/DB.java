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
public class DB implements ServletContextListener {
 Session s;
 Transaction tx;
 SessionFactory sf;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
 sf= new Configuration().configure()
             .buildSessionFactory();   //init
             s = sf.openSession();
       
          tx = s.beginTransaction();
          
          sce.getServletContext().setAttribute("Session", s);  
                    System.out.println("DB connected ");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
