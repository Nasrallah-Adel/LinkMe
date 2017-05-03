/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import listener.DB;
import model.courses;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mina george
 */
public class coursesCRUD {

    public static int InsertCourse(courses course) {

        int x = 0;
        try {
            x = (int) DB.s.save(course);
            DB.s.getTransaction().commit();
            DB.s.clear();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    public static List<courses> getcoursesData() {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from courses");
        q.setFirstResult(0);

        List<courses> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        return per;

    }

    public static List<courses> getOneCourseData(String username) {
        DB.s.beginTransaction();

        Query q = DB.s.createQuery("from courses where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<courses> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        return per;

    }

    public static courses updateCourse(String link) {

        int id = 0;
        DB.s.beginTransaction();

        Query q = DB.s.createQuery("from courses where link=:n");
        q.setFirstResult(0);
        q.setParameter("n", link);
        List<courses> per = q.list();
        for (courses p : per) {
            id = p.getCourse_id();
        }
        courses forUpdate = (courses) DB.s.load(courses.class, id);
        DB.s.getTransaction().commit();
        DB.s.clear();
        return forUpdate;
    }

    public static void Deletecourse(String link) {

        int id = 0;

        Query q = DB.s.createQuery("from courses where link=:n");
        q.setFirstResult(0);
        q.setParameter("n", link);
        List<courses> per = q.list();
        for (courses p : per) {
            id = p.getCourse_id();
        }
        courses forDelete = (courses) DB.s.load(courses.class, id);
        DB.s.delete(forDelete);
        DB.s.getTransaction().commit();
        DB.s.clear();

    }
}
