/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import model.Event;
import model.courses;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mina george
 */
public class examCRUD {
    
    public static List<Event> geteventData(Session s) {
        Query q = s.createQuery("from courses");
        q.setFirstResult(0);

        List<Event> per = q.list();
        return per;

    }
}
