package Control;

import java.util.List;
import listener.DB;

import model.user;

import org.hibernate.Query;

/**
 *
 * @author mina george
 */
public class UserCRUD {

    public static int InsertUser(user user) {
        DB.s.beginTransaction();
        int x = 0;
        try {
            x = (int) DB.s.save(user);
            DB.s.getTransaction().commit();
            DB.s.clear();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    public static List getUsersData() {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from user");
        q.setFirstResult(0);

        List<user> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        return per;

    }

    public static user getOneUserData(String email) {
        DB.s.beginTransaction();

        Query q = DB.s.createQuery("from user where email=:n");
        q.setFirstResult(0);
        q.setParameter("n", email);
        List<user> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        return per.get(0);

    }

    public static user getOneUserData_e(String email) {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from user where email=:n");
        q.setFirstResult(0);
        q.setParameter("n", email);
        List<user> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        return (per.size() == 0) ? null : per.get(0);

    }

    public static Boolean CheckUsername(String username) {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from user where username=:n");
        q.setParameter("n", username);
        q.setFirstResult(0);

        List<user> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        if (!per.isEmpty()) {
            return true;
        }

        return false;

    }

    public static String CheckUserPassword(String username) {
        DB.s.beginTransaction();

        String password = "ccc";

        Query q = DB.s.createQuery("select pass from user where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<user> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        for (user p : per) {
            password = p.getPass();
        }

        return password;

    }

    public static Boolean CheckEmail(String email) {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from user where email=:n");
        q.setParameter("n", email);
        q.setFirstResult(0);
 DB.s.getTransaction().commit();
       
        List<user> per = q.list();
        if (!per.isEmpty()) {
            DB.s.clear();
            return true;
        }
        DB.s.clear();

        return false;
    }

    public static void updateuser_val(user u) {
        DB.s.beginTransaction();

        Query q = DB.s.createSQLQuery("UPDATE user SET val = \"yes\" WHERE email=:n");
        q.setFirstResult(0);
        q.setParameter("n", u.getEmail());
        q.executeUpdate();
       DB.s.getTransaction().commit();
        DB.s.clear();
    }

    public static void DeleteUser(String user) {
        DB.s.beginTransaction();

        int id = 0;

        Query q = DB.s.createQuery("from user where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", user);
        List<user> per = q.list();
        for (user p : per) {
            id = p.getUser_id();
        }
        user forDelete = (user) DB.s.load(user.class, id);
        DB.s.delete(forDelete);
         DB.s.getTransaction().commit();
        DB.s.clear();

    }

    public static boolean is_exist(model.user user) {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from user where email=:n");
        q.setFirstResult(0);
        q.setParameter("n", user.getEmail());
        DB.s.getTransaction().commit();
        DB.s.clear();
        List<user> per = q.list();

        return (per.size() == 0) ? false : true;
    }
}
