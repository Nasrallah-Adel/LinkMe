/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import listener.DB;
import model.user;

/**
 *
 * @author nasrallah
 */
public class verify extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        out.print(";df,d;,g");
        String vc = request.getParameter("vc");
        System.out.println("i am in valid.java and parameter for validation " + vc);
        convert_to_hex cth = new convert_to_hex();
        user u = new user();
        u = (user) request.getSession().getAttribute("user");
        System.out.println(u.getEmail() + "  ?" + vc + ":" + cth.stringToHex(u.getF_name()) + vc.equals(cth.stringToHex(u.getF_name())));
        if (vc.equals(cth.stringToHex(u.getF_name()))) {

            System.out.println("yse");
            UserCRUD.updateuser_val(u);//set user val to yes

            request.getSession().setAttribute("aut", "true");
            response.sendRedirect("course.jsp");
        } else {
            System.out.println("not verify ");
            response.sendRedirect("verif.jsp");
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

    }

}
