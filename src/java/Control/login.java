/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import listener.DB;
import model.user;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author nasrallah
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("i am in login.java");

        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        user per = new user();
        per.setEmail("ss@ss.d");
        per.setPass("aa");
        per = (UserCRUD.getOneUserData_e(email) == null) ? per : UserCRUD.getOneUserData_e(email);

        HttpSession hs = request.getSession();

        int loginAttempt;
        if (hs.getAttribute("loginCount") == null) {
            System.out.println("null att");
            hs.setAttribute("loginCount", 0);
            loginAttempt = 0;
        } else {
            System.out.println("not null att");
            loginAttempt = (Integer) hs.getAttribute("loginCount");
        }
        System.out.println("loginAttempt" + loginAttempt);

        if (per.getEmail().toLowerCase().equals(email.toLowerCase())) {
            System.out.println("check email");
            if (per.getPass().equals(pass)) {
                System.out.println("check pass");
                user u = new user();
DB d =new DB();
                u = UserCRUD.getOneUserData(email);
               
                hs.setAttribute("aut", "true");
                hs.setAttribute("user", u);

                response.sendRedirect("course.jsp");
            } else {
                hs.setAttribute("aut", "false");
                if (loginAttempt > 3) {
                    response.sendRedirect("index.jsp");
                } else {
                    hs.setAttribute("aut", "false");
                    int we = loginAttempt + 1;
                    hs.setAttribute("loginCount", we);
                    hs.setAttribute("message", "Invalid email or password. Please try again!");
                    response.sendRedirect("login.jsp");
                }
            }
        } else {
            hs.setAttribute("aut", "false");
            if (loginAttempt > 3) {
                response.sendRedirect("index.jsp");
            } else {
                hs.setAttribute("aut", "false");
                int we = loginAttempt + 1;
                hs.setAttribute("loginCount", we);
                request.setAttribute("message", "Invalid email or password. Please try again!");
                response.sendRedirect("login.jsp");
            }

        }

    }

}
