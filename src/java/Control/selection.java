/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.courses;

/**
 *
 * @author nasrallah
 */
public class selection {

    Connection con;

    public selection() {
        con = connection.conn("LinkMe");
    }

    public List<courses> get_all_course(String key) {
        int i = 0;
        List<courses> all = new ArrayList<>();
        PreparedStatement pre;
        try {

            pre = (PreparedStatement) con.prepareStatement("SELECT * FROM courses WHERE name LIKE '%" + key + "%';");

            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                courses c = new courses();
                c.setName(rs.getString("name"));
                c.setLink(rs.getString("link"));
                c.setSourceImage(rs.getString("sourceimage"));
                c.setInst(rs.getString("inst"));
                System.out.println("name  ::::: " + rs.getString("name"));
                all.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(selection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return all;
    }

    public int get_count_course() {
        int i = 0;
        PreparedStatement pre;
        try {
            pre = (PreparedStatement) con.prepareStatement("SELECT * FROM course ; ");

            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(selection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }
}
