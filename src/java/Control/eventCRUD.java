/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import listener.DB;
import model.Event;
import model.courses;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mina george
 */
public class eventCRUD {

    public static List<Event> geteventData() {
        DB.s.beginTransaction();
        Query q = DB.s.createQuery("from Event");
        q.setFirstResult(0);

        List<Event> per = q.list();
        DB.s.getTransaction().commit();
        DB.s.clear();
        return per;

    }
}
