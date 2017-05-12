package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Control.eventCRUD;
import Control.UserCRUD;
import model.user;
import model.Event;
import java.util.List;
import org.hibernate.SessionFactory;
import Control.coursesCRUD;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import java.util.List;

public final class events_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,800\"/>\r\n");
      out.write("    <!-- IE compatibilty meta-->\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <!-- Mobile meta-->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>LinkMe</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/registration.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/events.css\"/>\r\n");
      out.write("\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/events.css\"/>\r\n");
      out.write("\r\n");
      out.write("        ");


            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
            }

            if (request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("login.jsp");
            }
            user u = new user();
            u = (user) request.getSession().getAttribute("user");
            u = UserCRUD.getOneUserData(u.getEmail());
            
            request.getSession().setAttribute("user", u);
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <!--Start navigation bar -->\r\n");
      out.write("            <nav class=\"navbar\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
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
      out.write("                            <li><a href=\"conact_us.jsp\">CONTACT</a></li>\r\n");
      out.write("                            <li><a href=\"Profile.jsp\">Profile</a></li>\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("                                <strong>Salman</strong>\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-down\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"navbar-login\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-lg-4\">\r\n");
      out.write("                                                <p class=\"text-center\">\r\n");
      out.write("                                                    <span class=\"glyphicon glyphicon-user icon-size\"></span>\r\n");
      out.write("                                                </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-8\">\r\n");
      out.write("                                                <p class=\"text-left\"><strong>Salman Khan</strong></p>\r\n");
      out.write("                                                <p class=\"text-left small\">crazytodevelop@@gmail.com</p>\r\n");
      out.write("                                                <p class=\"text-left\">\r\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-primary btn-block btn-sm\">Profile</a>\r\n");
      out.write("                                                </p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"divider navbar-login-session-bg\" ></li>\r\n");
      out.write("                                <li><a href=\"#\">Edit <span class=\"glyphicon glyphicon-cog pull-right\"></span></a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\">logout<span class=\"glyphicon glyphicon-log-out\" style=\"padding-left: 250px\"></span></a></li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul> \r\n");
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
      out.write("        <section class=\"Event\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <label class=\"search\" for=\"search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </i>Search</label>\r\n");
      out.write("\r\n");
      out.write("                <input type=\"search\" name=\"search\" class=\"form-control\" id=\"search\" placeholder=\"Search Events\">\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
 
            List<Event> ev = eventCRUD.geteventData();

                int i = 0;
                for (Event elem : ev) {
            
            
      out.write("\r\n");
      out.write("            <div class=\"e\">\r\n");
      out.write("                <img class=\"img\" src=\"");
 out.print(elem.getSrcImage());
      out.write("\" alt=\"events\"/>\r\n");
      out.write("                <h3><a href=\"");
 out.print(elem.getLinke());
      out.write('"');
      out.write('>');
 out.print(elem.getName());
      out.write("</a></h3>\r\n");
      out.write("                <ul class=\"contents\" >\r\n");
      out.write("                    <li><i class=\"fa fa-calendar\"></i> ");
 out.print(elem.getDate());
      out.write("</li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li><i class=\"fa fa-map-marker\"></i> ");
 out.print(elem.getSpeaker());
      out.write("</li>\r\n");
      out.write("                </ul >\r\n");
      out.write("                  </div>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
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
      out.write("</html>");
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
