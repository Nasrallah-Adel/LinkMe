/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import listener.DB;
import model.admin;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mina george
 */
public class AdminCRUD {

    public static int InsertAdmin(admin admin) {
       
        int x = 0;
        try {
            x = (int) DB.s.save(admin);
            DB.s.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    public static List getAdminsData() {
        Query q = DB.s.createQuery("from admin");
        q.setFirstResult(0);

        List<admin> per = q.list();
        return per;

    }

    public static List getOneAdminData(String username) {
        Query q = DB.s.createQuery("from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<admin> per = q.list();
//            for (user p : per) {}                          
        return per;

    }

    public static Boolean CheckUsername(String username) {
        Query q = DB.s.createQuery("from admin where username=:n");
        q.setParameter("n", username);
        q.setFirstResult(0);

        List<admin> per = q.list();
        if (!per.isEmpty()) {
            return true;
        }

        return false;

    }

    public static String CheckUserPassword(String username) {
        String password = "ccc";

        Query q = DB.s.createQuery("select pass from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<admin> per = q.list();

        for (admin p : per) {
            password = p.getPass();
        }

        return password;

    }

    public static Boolean CheckEmail(String email) {
        Query q = DB.s.createQuery("from admin where email=:n");
        q.setParameter("n", email);
        q.setFirstResult(0);

        List<admin> per = q.list();
        if (!per.isEmpty()) {
            return true;
        }

        return false;
    }

    public static admin updateAdmin(String user) {

        int id = 0;
       
        Query q = DB.s.createQuery("from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", user);
        List<admin> per = q.list();
        for (admin p : per) {
            id = p.getAdmin_id();
        }
        admin forUpdate = (admin) DB.s.load(admin.class, id);

        return forUpdate;
    }

    public static void DeleteAdmin(String user) {
        
        int id = 0;

        Query q = DB.s.createQuery("from admin where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", user);
        List<admin> per = q.list();
        for (admin p : per) {
            id = p.getAdmin_id();
        }
        admin forDelete = (admin) DB.s.load(admin.class, id);
        DB.s.delete(forDelete);
        DB.s.getTransaction().commit();

    }

}
