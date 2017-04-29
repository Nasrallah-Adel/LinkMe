/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
        u.setLevel("0");
        u.setVal("no");
        Boolean is_exist = UserCRUD.is_exist(u, s);

        s.getTransaction().commit();
        HttpSession hs = request.getSession();
        System.out.println(is_exist);
        if (is_exist) {

            hs.setAttribute("message", "user is exist");
            response.sendRedirect("signUp.jsp");
        } else {
            convert_to_hex cth = new convert_to_hex();
            try {
                send_mail(cth.stringToHex(u.getF_name()), email);
            } catch (MessagingException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            hs.setAttribute("user", u);
            doPost(request, response);

        }

    }

    public void send_mail(String code, String email) throws MessagingException {
        int result = 0;
        while (result == 0) {
            SMTP smtp = new SMTP();
            smtp.setTo(email);
            Properties prop = new Properties();
            javax.mail.Session ses = javax.mail.Session.getDefaultInstance(prop, smtp);
            MimeMessage mim = new MimeMessage(ses);
            mim.setContent(code, "text/html");
            mim.setSubject("validate");
            mim.setFrom(new InternetAddress(smtp.from));
            mim.addRecipient(Message.RecipientType.TO, (new InternetAddress(smtp.to)));
            Transport tr = ses.getTransport("smtps");
            tr.connect(smtp.d_host, smtp.port, smtp.d_user, smtp.d_pass);
            tr.sendMessage(mim, mim.getAllRecipients());
            tr.close();
            result = 1;
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
