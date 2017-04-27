package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.courses;
import java.util.List;
import org.hibernate.SessionFactory;
import Control.coursesCRUD;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import java.util.List;

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
                request.getSession().setAttribute("aut", "false");
            }

            if (request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("login.jsp");
            }

        
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
      out.write("                            <li><a href=\"index.jsp\">HOME</a></li>\r\n");
      out.write("                            <li><a href=\"course.jsp\">COURSES</a></li>\r\n");
      out.write("                            <li><a href=\"#\">ABOUT</a></li>\r\n");
      out.write("                            <li><a href=\"events.jsp\">EVENT</a></li>\r\n");
      out.write("                            <li><a href=\"#\">CONTACT</a></li>\r\n");
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
                SessionFactory sf = new Configuration().configure().buildSessionFactory();

                Session s = sf.openSession();
                s.beginTransaction();
                List<courses> co = coursesCRUD.getcoursesData(s);
                s.getTransaction().commit();
                for (courses elem : co) {

            
      out.write("\r\n");
      out.write("            <div class=\"e\">\r\n");
      out.write("                <img class=\"img\" src=\"");
elem.getSourceImage();
      out.write("\" alt=\"Courses\"/>\r\n");
      out.write("                <h3><a href=\"");
   elem.getLink(); 
      out.write("\"> ");
 elem.getName(); 
      out.write("</a></h3>\r\n");
      out.write("                <p><b> By :</b> ");
 elem.getInst();
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"stars\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <p><b> Course Rate :</b></p>\r\n");
      out.write("                    <fieldset class=\"rating\">\r\n");
      out.write("                        <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"5\" /><label class = \"full\" for=\"star5\" title=\"Awesome - 5 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star4half\" name=\"rating\" value=\"4 and a half\" /><label class=\"half\" for=\"star4half\" title=\"Pretty good - 4.5 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"4\" /><label class = \"full\" for=\"star4\" title=\"Pretty good - 4 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star3half\" name=\"rating\" value=\"3 and a half\" /><label class=\"half\" for=\"star3half\" title=\"Meh - 3.5 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"3\" /><label class = \"full\" for=\"star3\" title=\"Meh - 3 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star2half\" name=\"rating\" value=\"2 and a half\" /><label class=\"half\" for=\"star2half\" title=\"Kinda bad - 2.5 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"2\" /><label class = \"full\" for=\"star2\" title=\"Kinda bad - 2 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star1half\" name=\"rating\" value=\"1 and a half\" /><label class=\"half\" for=\"star1half\" title=\"Meh - 1.5 stars\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"1\" /><label class = \"full\" for=\"star1\" title=\"Sucks big time - 1 star\"></label>\r\n");
      out.write("                        <input type=\"radio\" id=\"starhalf\" name=\"rating\" value=\"half\" /><label class=\"half\" for=\"starhalf\" title=\"Sucks big time - 0.5 stars\"></label>\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <p style=\"font-size: 14px\"><a class=\"readMore\" href=\"");
   elem.getLink(); 
      out.write("\"> <a href=\"");
   elem.getLink(); 
      out.write("\">Take Course</a> <i class=\"fa fa-angle-right\"></i></a></p>\r\n");
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
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
