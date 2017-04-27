/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.user;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author nasrallah
 */
@WebServlet(name = "SignUp", urlPatterns = {"/SignUp"})
public class SignUp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fname, lname, username, email, pass, pass1, Tracks, message = "";
        fname = request.getParameter("firstName");
        lname = request.getParameter("lastName");
        username = request.getParameter("userNmae");
        email = request.getParameter("email");
        pass = request.getParameter("password");
        pass1 = request.getParameter("passwordConfirm");
        Tracks = request.getParameter("Tracks");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();
        model.user u = new user();
        u.setF_name(fname);
        u.setL_name(lname);
        u.setUsername(username);
        u.setEmail(email);
        u.setCareer(Tracks);
        u.setPass(pass);
        Boolean is_exist = UserCRUD.is_exist(u, s);

        s.getTransaction().commit();
        HttpSession hs = request.getSession();
        System.out.println(is_exist);
        if (is_exist) {

            hs.setAttribute("message", "user is exist");
            response.sendRedirect("signUp.jsp");
        } else {

            hs.setAttribute("user", u);
            doPost(request, response);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();
        user u = (user) request.getSession().getAttribute("user");
        int x = UserCRUD.InsertUser(u, s);
       s.getTransaction().commit();
        System.out.println("saved user   sd sd sd  sd ");
        if (x > 0) {
            response.sendRedirect("login.jsp");
        }
    }

}
