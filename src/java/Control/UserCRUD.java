package Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import model.user;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mina george
 */
public class UserCRUD {

    public static int InsertUser(user user, Session s) {
       
        int x = 0;
        try {
            x = (int) s.save(user);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    public static List getUsersData(Session s) {
        Query q = s.createQuery("from user");
        q.setFirstResult(0);

        List<user> per = q.list();
        return per;

    }

    public static user getOneUserData(String username, Session s) {
        Query q = s.createQuery("from user where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<user> per = q.list();

        return per.get(0);

    }

    public static user getOneUserData_e(String email, Session s) {
        Query q = s.createQuery("from user where email=:n");
        q.setFirstResult(0);
        q.setParameter("n", email);
        List<user> per = q.list();

        return (per.size() == 0) ? null : per.get(0);

    }

    public static Boolean CheckUsername(String username, Session s) {
        Query q = s.createQuery("from user where username=:n");
        q.setParameter("n", username);
        q.setFirstResult(0);

        List<user> per = q.list();
        if (!per.isEmpty()) {
            return true;
        }

        return false;

    }

    public static String CheckUserPassword(String username, Session s) {
        String password = "ccc";

        Query q = s.createQuery("select pass from user where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<user> per = q.list();

        for (user p : per) {
            password = p.getPass();
        }

        return password;

    }

    public static Boolean CheckEmail(String email, Session s) {
        Query q = s.createQuery("from user where email=:n");
        q.setParameter("n", email);
        q.setFirstResult(0);

        List<user> per = q.list();
        if (!per.isEmpty()) {
            return true;
        }

        return false;
    }

    public static user updateuser(String user, Session s) {

        int id = 0;
        s.beginTransaction();
        Query q = s.createQuery("from user where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", user);
        List<user> per = q.list();
        for (user p : per) {
            id = p.getUser_id();
        }
        user forUpdate = (user) s.load(user.class, id);

        return forUpdate;
    }

    public static void DeleteUser(String user, Session s) {
        s.beginTransaction();
        int id = 0;

        Query q = s.createQuery("from user where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", user);
        List<user> per = q.list();
        for (user p : per) {
            id = p.getUser_id();
        }
        user forDelete = (user) s.load(user.class, id);
        s.delete(forDelete);
        s.getTransaction().commit();

    }

    public static boolean is_exist(model.user user, Session s) {

        Query q = s.createQuery("from user where email=:n");
        q.setFirstResult(0);
        q.setParameter("n", user.getEmail());
        List<user> per = q.list();

        return (per.size() == 0) ? false : true;
    }
}
