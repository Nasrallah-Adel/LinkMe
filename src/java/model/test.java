/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author mina george
 */
public class test {

//        
//        static    Transaction tx = s.beginTransaction();
    public static void main(String[] args) {
        user u = new user();
        u.setCareer("dfdfd");
        u.setEmail("dfdffsdf");
        u.setF_name("Ggsfgsdfg");
        u.setL_name("dfhdhs");
        u.setLevel("fdfsdf");
        u.setPass("xgdfd");
        u.setUser_id(2);
        u.setUsername("dgg");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();   //init
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
        s.beginTransaction();
        s.delete(u);
        s.getTransaction().commit();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
        s.close();
    }

}
