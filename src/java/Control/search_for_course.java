/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import listener.DB;
import model.courses;

/**
 *
 * @author nasrallah
 */
public class search_for_course extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    selection se = new selection();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            selection se = new selection();
            String key = request.getParameter("key");
            System.out.println("Key\"" + key + "\"");

            List<courses> co = se.get_all_course(key);

            String divs = "";
            int i = 0;
            System.out.println("sizeeee : " + co.size());

            for (courses elem : co) {
                divs += " <li><a href=\"" + elem.getLink() + "\" >" + elem.getName() + "</a></li>";
                System.out.println(elem.getName());
//                divs += "<div class=\"e\">\n"
                //                        + "                <img class=\"img\" src=\"" + elem.getSourceImage() + " \" alt=\"Courses\"/>\n"
                //                        + "                <h3><a href=\"" + elem.getLink() + "\"> " + elem.getName() + " </a></h3>\n"
                //                        + "                <p><b> By :</b> " + elem.getInst() + " </p>\n"
                //                        + "\n"
                //                        + "\n"
                //                        + "                <div class=\"stars\">\n"
                //                        + "\n"
                //                        + "\n"
                //                        + "                    <p><b> Course Rate :</b></p>\n"
                //                        + "                    <fieldset class=\"rating\">\n"
                //                        + "                        <input type=\"radio\" id=\"star5" + i + " \" name=\"rating" + i + "\" value=\"5\" /><label class = \"full\" for=\"star5" + i + "\" title=\"Awesome - 5 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star4half " + i + "\" name=\"rating" + i + "\" value=\"4 and a half\" /><label class=\"half\" for=\"star4half" + i + "\" title=\"Pretty good - 4.5 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star4" + i + " name=\"rating" + i + "\" value=\"4\" /><label class = \"full\" for=\"star4" + i + "\" title=\"Pretty good - 4 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star3half" + i + "\" name=\"rating" + i + "\" value=\"3 and a half\" /><label class=\"half\" for=\"star3half" + i + "\" title=\"Meh - 3.5 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star3" + i + "\" name=\"rating" + i + "\" value=\"3\" /><label class = \"full\" for=\"star3" + i + "\" title=\"Meh - 3 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star2half" + i + "\" name=\"rating" + i + "\" value=\"2 and a half\" /><label class=\"half\" for=\"star2half" + i + "\" title=\"Kinda bad - 2.5 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star2" + i + "\" name=\"rating" + i + "\" value=\"2\" /><label class = \"full\" for=\"star2" + i + "\" title=\"Kinda bad - 2 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star1half" + i + "\" name=\"rating" + i + "\" value=\"1 and a half\" /><label class=\"half\" for=\"star1half" + i + "\" title=\"Meh - 1.5 stars\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"star1" + i + "\" name=\"rating" + i + "\" value=\"1\" /><label class = \"full\" for=\"star1" + i + "\" title=\"Sucks big time - 1 star\"></label>\n"
                //                        + "                        <input type=\"radio\" id=\"starhalf" + i + "\" name=\"rating" + i + "\" value=\"half\" /><label class=\"half\" for=\"starhalf" + (i++) + "\" title=\"Sucks big time - 0.5 stars\"></label>\n"
                //                        + "                    </fieldset>\n"
                //                        + "                </div>\n"
                //                        + "\n"
                //                        + "                <p style=\"font-size: 14px\"><a class=\"readMore\" href=\"<%   out.print(elem.getLink()); %>\"> <a href=\"" + elem.getLink() + " %>\">Take Course</a> <i class=\"fa fa-angle-right\"></i></a></p>\n"
                //                        + "            </div>";
            }

            se.con.close();
            response.getWriter().write(divs);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(search_for_course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(search_for_course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
