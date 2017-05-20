/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import listener.DB;
import model.exam;
import model.user;
import org.hibernate.Query;

/**
 *
 * @author nasrallah
 */
public class examcrud {

    public static List<exam> getexamData(String v, String x) {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from exam where level = " + v + "and type = " + x);
        q.setFirstResult(0);

        List<exam> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        return per;

    }

}
