/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import model.admin;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mina george
 */
public class AdminCRUD {

    public static int InsertAdmin(admin admin, Session s) {
        s.beginTransaction();
        int x = 0;
        try {
            x = (int) s.save(admin);
            s.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    public static List getAdminsData(Session s) {
        Query q = s.createQuery("from admin");
        q.setFirstResult(0);

        List<admin> per = q.list();
        return per;

    }

    public static List getOneAdminData(String username, Session s) {
        Query q = s.createQuery("from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<admin> per = q.list();
//            for (user p : per) {}                          
        return per;

    }

    public static Boolean CheckUsername(String username, Session s) {
        Query q = s.createQuery("from admin where username=:n");
        q.setParameter("n", username);
        q.setFirstResult(0);

        List<admin> per = q.list();
        if (!per.isEmpty()) {
            return true;
        }

        return false;

    }

    public static String CheckUserPassword(String username, Session s) {
        String password = "ccc";

        Query q = s.createQuery("select pass from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<admin> per = q.list();

        for (admin p : per) {
            password = p.getPass();
        }

        return password;

    }

    public static Boolean CheckEmail(String email, Session s) {
        Query q = s.createQuery("from admin where email=:n");
        q.setParameter("n", email);
        q.setFirstResult(0);

        List<admin> per = q.list();
        if (!per.isEmpty()) {
            return true;
        }

        return false;
    }

    public static admin updateAdmin(String user, Session s) {

        int id = 0;
        s.beginTransaction();
        Query q = s.createQuery("from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", user);
        List<admin> per = q.list();
        for (admin p : per) {
            id = p.getAdmin_id();
        }
        admin forUpdate = (admin) s.load(admin.class, id);

        return forUpdate;
    }

    public static void DeleteAdmin(String user, Session s) {
        s.beginTransaction();
        int id = 0;

        Query q = s.createQuery("from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", user);
        List<admin> per = q.list();
        for (admin p : per) {
            id = p.getAdmin_id();
        }
        admin forDelete = (admin) s.load(admin.class, id);
        s.delete(forDelete);
        s.getTransaction().commit();

    }

}
