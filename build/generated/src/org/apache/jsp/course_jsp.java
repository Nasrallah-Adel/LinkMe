package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.user;
import model.courses;
import java.util.List;
import org.hibernate.SessionFactory;
import Control.coursesCRUD;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import java.util.*;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
        implements org.apache.jasper.runtime.JspSourceDependent {

    private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

    private static java.util.List<String> _jspx_dependants;

    private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

    public java.util.List<String> getDependants() {
        return _jspx_dependants;
    }

    public void _jspService(HttpServletRequest request, HttpServletResponse response)
            throws java.io.IOException, ServletException {

        PageContext pageContext = null;
        HttpSession session = null;
        ServletContext application = null;
        ServletConfig config = null;
        JspWriter out = null;
        Object page = this;
        JspWriter _jspx_out = null;
        PageContext _jspx_page_context = null;

        try {
            response.setContentType("text/html");
            pageContext = _jspxFactory.getPageContext(this, request, response,
                    null, true, 8192, true);
            _jspx_page_context = pageContext;
            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();
            _jspx_out = out;
            _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("<!DOCTYPE html>\r\n");
            out.write("<html>\r\n");
            out.write("    <head>\r\n");
            out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,800\"/>\r\n");
            out.write("        <!-- IE compatibilty meta-->\r\n");
            out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
            out.write("        <!-- Mobile meta-->\r\n");
            out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
            out.write("        <meta charset=\"UTF-8\">\r\n");
            out.write("        <title>LinkMe</title>\r\n");
            out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\r\n");
            out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
            out.write("        <link rel=\"stylesheet\" href=\"css/registration.css\"/>\r\n");
            out.write("        <link rel=\"stylesheet\" href=\"css/cousre.css\"/>\r\n");
            out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\r\n");
            out.write("    </head>\r\n");
            out.write("    <body>\r\n");
            out.write("        ");

            if (request.getSession().getAttribute("aut") == null) {

                response.sendRedirect("login.jsp");
            }

            user u = ((user) request.getSession().getAttribute("user"));
            System.out.println("user validate : " + u.getVal());
            if (u.getVal().equals("no")) {
                request.getSession().setAttribute("user", u);

                response.sendRedirect("verif.jsp");

                out.write("\r\n");
                out.write("        <header>\r\n");
                out.write("            <!--Start navigation bar -->\r\n");
                out.write("            <nav class=\"navbar\">\r\n");
                out.write("                <div class=\"container\">\r\n");
                out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
                out.write("                    <div class=\"navbar-header\">\r\n");
                out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
                out.write("                            <span class=\"sr-only\">Toggle navigation</span>\r\n");
                out.write("                            <span class=\"icon-bar\"></span>\r\n");
                out.write("                            <span class=\"icon-bar\"></span>\r\n");
                out.write("                            <span class=\"icon-bar\"></span>\r\n");
                out.write("                        </button>\r\n");
                out.write("                        <a class=\"navbar-brand\" href=\"#\"><h3>LINK<span class=\"main-color\">ME</span></h3></a>\r\n");
                out.write("                    </div>\r\n");
                out.write("\r\n");
                out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
                out.write("                    <div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
                out.write("                        <ul class=\"nav navbar-nav navbar-right\">\r\n");
                out.write("\r\n");
                out.write("                            <li><a href=\"course.jsp\">COURSES</a></li>\r\n");
                out.write("                            <li><a href=\"#\">ABOUT</a></li>\r\n");
                out.write("                            <li><a href=\"events.jsp\">EVENT</a></li>\r\n");
                out.write("                            <li><a href=\"#\">CONTACT</a></li>\r\n");
                out.write("                            <li><a href=\"Profile.jsp\">Profile</a></li>\r\n");
                out.write("                            <li><a href=\"logout\">LogOut</a></li>\r\n");
                out.write("                        </ul>\r\n");
                out.write("                    </div><!-- /.navbar-collapse -->\r\n");
                out.write("                </div><!-- /.container-fluid -->\r\n");
                out.write("\r\n");
                out.write("            </nav>\r\n");
                out.write("            <!-- End Nav Section-->\r\n");
                out.write("\r\n");
                out.write("        </header>\r\n");
                out.write("\r\n");
                out.write("        <!-- New section -->\r\n");
                out.write("        <section class=\"Course\">\r\n");
                out.write("            <div class=\"form-group\">\r\n");
                out.write("\r\n");
                out.write("\r\n");
                out.write("                <label class=\"search\" for=\"search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
                out.write("                    </i>Search</label>\r\n");
                out.write("\r\n");
                out.write("                <input type=\"search\" name=\"search\" class=\"form-control\" id=\"search\" placeholder=\"Search Courses\">\r\n");
                out.write("            </div>\r\n");
                out.write("\r\n");
                out.write("            <!-- first course -->\r\n");
                out.write("            ");

                List<courses> co = (List<courses>) coursesCRUD.getcoursesData();

                out.print(co.size());
                int i = 0;
                for (courses elem : co) {
                    if (!u.getCareer().toLowerCase().equals(elem.getType().toLowerCase())) {
                        continue;
                    }

                    out.write("\r\n");
                    out.write("            <div class=\"e\">\r\n");
                    out.write("                <img class=\"img\" src=\"");
                    out.print(elem.getSourceImage());
                    out.write("\" alt=\"Courses\"/>\r\n");
                    out.write("                <h3><a href=\"");
                    out.print(elem.getLink());
                    out.write(" \" target=\"_blank\"> ");
                    out.print(elem.getName());
                    out.write("</a></h3>\r\n");
                    out.write("                <p><b> By :</b> ");
                    out.print(elem.getInst());
                    out.write("</p>\r\n");
                    out.write("\r\n");
                    out.write("\r\n");
                    out.write("                <div class=\"stars\">\r\n");
                    out.write("\r\n");
                    out.write("\r\n");
                    out.write("                    <p><b> Course Rate :</b></p>\r\n");
                    out.write("                    <form action=\"rat\" method=\"POST\">\r\n");
                    out.write("\r\n");
                    out.write("                        <fieldset class=\"rating\">\r\n");
                    out.write("                            <input type=\"radio\" id=\"star5");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"5\" /><label class = \"full\" for=\"star5");
                    out.print(i);
                    out.write("\" title=\"Awesome - 5 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\" id=\"star4half");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"4 and a half\" /><label class=\"half\" for=\"star4half");
                    out.print(i);
                    out.write("\" title=\"Pretty good - 4.5 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\" id=\"star4");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"4\" /><label class = \"full\" for=\"star4");
                    out.print(i);
                    out.write("\" title=\"Pretty good - 4 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\" id=\"star3half");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"3 and a half\" /><label class=\"half\" for=\"star3half");
                    out.print(i);
                    out.write("\" title=\"Meh - 3.5 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\" id=\"star3");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"3\" /><label class = \"full\" for=\"star3");
                    out.print(i);
                    out.write("\" title=\"Meh - 3 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\" id=\"star2half");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"2 and a half\" /><label class=\"half\" for=\"star2half");
                    out.print(i);
                    out.write("\" title=\"Kinda bad - 2.5 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\" id=\"star2");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"2\" /><label class = \"full\" for=\"star2");
                    out.print(i);
                    out.write("\" title=\"Kinda bad - 2 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\" id=\"star1half");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"1 and a half\" /><label class=\"half\" for=\"star1half");
                    out.print(i);
                    out.write("\" title=\"Meh - 1.5 stars\"></label>\r\n");
                    out.write("                            <input type=\"radio\"type=\"submit\" id=\"star1");
                    out.print(i);
                    out.write("\" name=\"rating");
                    out.print(i);
                    out.write("\" value=\"1\" /><label class = \"full\" for=\"star1");
                    out.print(i);
                    out.write("\" title=\"Sucks big time - 1 star\"></label>\r\n");
                    out.write("                            <input type=\"radio\" type=\"submit\"id=\"starhalf");
                    out.print(i++);
                    out.write("\" name=\"rating");
                    out.print(i++);
                    out.write("\" value=\"half\" /><label class=\"half\" for=\"starhalf");
                    out.print(i++);
                    out.write("\" title=\"Sucks big time - 0.5 stars\"></label>\r\n");
                    out.write("                        </fieldset>\r\n");
                    out.write("                    </form>\r\n");
                    out.write("                </div>\r\n");
                    out.write("\r\n");
                    out.write("                <p style=\"font-size: 14px\"><a class=\"readMore\" href=\"");
                    out.print(elem.getLink());
                    out.write("\" target=\"_blank\" > <a href=\"");
                    out.print(elem.getLink());
                    out.write("\" target=\"_blank\">Take Course</a> <i class=\"fa fa-angle-right\"></i></a></p>\r\n");
                    out.write("            </div>\r\n");
                    out.write("            ");
                }
                out.write("\r\n");
                out.write("            <!--End-->\r\n");
                out.write("            <!--secand Course -->\r\n");
                out.write("\r\n");
                out.write("\r\n");
                out.write("            <!--End-->\r\n");
                out.write("        </section>\r\n");
                out.write("\r\n");
                out.write("        <!-- start scroll up-->\r\n");
                out.write("        <div id=\"scroll\">\r\n");
                out.write("            <i class=\"fa fa-chevron-up fa-2x\"></i>\r\n");
                out.write("        </div>\r\n");
                out.write("        <!-- end scroll up-->\r\n");
                out.write("        <script src=\"js/jquery-3.2.0.min.js\"></script>\r\n");
                out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\r\n");
                out.write("        <script src=\"js/custom.js\"></script>\r\n");
                out.write("    </body>\r\n");
                out.write("</html>\r\n");
            }
        } catch (Throwable t) {
            if (!(t instanceof SkipPageException)) {
                out = _jspx_out;
                if (out != null && out.getBufferSize() != 0) {
                    out.clearBuffer();
                }
                if (_jspx_page_context != null) {
                    _jspx_page_context.handlePageException(t);
                } else {
                    throw new ServletException(t);
                }
            }
        } finally {
            _jspxFactory.releasePageContext(_jspx_page_context);
        }
    }
}
