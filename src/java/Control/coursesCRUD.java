/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import model.courses;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mina george
 */
public class coursesCRUD {

    public static int InsertCourse(courses course, Session s) {
        s.beginTransaction();
        int x = 0;
        try {
            x = (int) s.save(course);
            s.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    public static List<courses> getcoursesData(Session s) {
        Query q = s.createQuery("from courses");
        q.setFirstResult(0);

        List<courses> per = q.list();
        return per;

    }

    public static List<courses> getOneCourseData(String username, Session s) {
        Query q = s.createQuery("from courses where username=:n");
        q.setFirstResult(0);
        q.setParameter("n", username);
        List<courses> per = q.list();
//            for (user p : per) {}                          
        return per;

    }

    public static courses updateCourse(String link, Session s) {

        int id = 0;
        s.beginTransaction();
        Query q = s.createQuery("from courses where link=:n");
        q.setFirstResult(0);
        q.setParameter("n", link);
        List<courses> per = q.list();
        for (courses p : per) {
            id = p.getCourse_id();
        }
        courses forUpdate = (courses) s.load(courses.class, id);

        return forUpdate;
    }

    public static void Deletecourse(String link, Session s) {
        s.beginTransaction();
        int id = 0;

        Query q = s.createQuery("from courses where link=:n");
        q.setFirstResult(0);
        q.setParameter("n", link);
        List<courses> per = q.list();
        for (courses p : per) {
            id = p.getCourse_id();
        }
        courses forDelete = (courses) s.load(courses.class, id);
        s.delete(forDelete);
        s.getTransaction().commit();

    }
}
