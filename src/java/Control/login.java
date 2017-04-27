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

        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        user per = new user();
        per.setEmail("ss@ss.d");
        per.setPass("aa");
        per = (UserCRUD.getOneUserData_e(email, s) == null) ? per : UserCRUD.getOneUserData_e(email, s);
        s.getTransaction().commit();
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

        if (per.getEmail().equals(email)) {
            System.out.println("check email");
            if (per.getPass().equals(pass)) {
                System.out.println("check pass");
                user u = new user();
                u.setUsername(email);
                u.setPass(pass);
                hs.setAttribute("aut", "true");
                response.sendRedirect("course.jsp");
            } else {
                hs.setAttribute("aut", "true");
                if (loginAttempt > 3) {
                    response.sendRedirect("index.jsp");
                } else {
                    int we = loginAttempt + 1;
                    hs.setAttribute("loginCount", we);
                    hs.setAttribute("message", "Invalid email or password. Please try again!");
                    response.sendRedirect("login.jsp");
                }
            }
        } else {
            if (loginAttempt > 3) {
                response.sendRedirect("index.jsp");
            } else {
                int we = loginAttempt + 1;
                hs.setAttribute("loginCount", we);
                request.setAttribute("message", "Invalid email or password. Please try again!");
                response.sendRedirect("login.jsp");
            }

        }

    }

}