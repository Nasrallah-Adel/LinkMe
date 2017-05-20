/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;

/**
 *
 * @author nasrallah
 */
public class exam extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            List<String[]> ans = new ArrayList<String[]>();
            out.println("dadafavcdcsf kkkk " + request.getParameter("group-0"));
            for (int i = 0; i < 3; i++) {
                String[] str = new String[2];
                out.println("dadafavcdcsf kkkk " + request.getParameter("group-" + i));

                str = ((String) request.getParameter("group-" + i)).split("-");
                ans.add(str);
            }
            user u = (user) request.getSession().getAttribute("user");
            int sum = 0;
            List<model.exam> ex = new ArrayList<model.exam>();
            out.print(ans.get(0)[1]);
            for (int i = 0; i < 3; i++) {
                ex = examcrud.getOneCourseData(ans.get(i)[1]);

                out.println("nooooooooooo");
                if (ans.get(i)[0].equals(ex.get(0).getAnswer())) {
                    sum += 1;
                    out.println("yessssssssssss");
                }

            }
            if (sum == 3) {

                UserCRUD.updateuser_lev(u, (u.getLevel() + 1));

            } else {

            }

            response.sendRedirect("Profile.jsp");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
