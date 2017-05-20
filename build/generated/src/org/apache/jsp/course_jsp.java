package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collections;
import java.util.ArrayList;
import Control.UserCRUD;
import model.user;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,800\"/>\n");
      out.write("        <!-- IE compatibilty meta-->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- Mobile meta-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>LinkMe</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/registration.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cousre.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,800\"/>\n");
      out.write("        <!-- IE compatibilty meta-->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- Mobile meta-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <script src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <title>LinkMe</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Exam.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#owl-demo\").owlCarousel({\n");
      out.write("\n");
      out.write("                    autoPlay: 3000, //Set AutoPlay to 3 seconds\n");
      out.write("                    autoPlay: true,\n");
      out.write("                    items: 1,\n");
      out.write("                    itemsDesktop: [1000, 5],\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        ");

            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
                response.sendRedirect("login.jsp");
            }
            if (request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("login.jsp");
            }
            user u = new user();
            u = (user) request.getSession().getAttribute("user");
            u = UserCRUD.getOneUserData(u.getEmail());
            request.getSession().setAttribute("user", u);
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <!--Start navigation bar -->\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><h3>LINK<span class=\"main-color\">ME</span></h3></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                            <li><a href=\"course.jsp\">COURSES</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("                            <li><a href=\"events.jsp\">EVENT</a></li>\n");
      out.write("                            <li><a href=\"contact_us.jsp\">CONTACT</a></li>\n");
      out.write("                            <li><a href=\"Profile.jsp\">Profile</a></li>\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("                                        <strong>");
 out.print(u.getF_name());  
      out.write("</strong>\n");
      out.write("                                        <span class=\"glyphicon glyphicon-chevron-down\"></span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <div class=\"navbar-login\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-lg-4\">\n");
      out.write("                                                        <p class=\"text-center\">\n");
      out.write("                                                            <span class=\"glyphicon glyphicon-user icon-size\"></span>\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-lg-8\">\n");
      out.write("                                                        <p class=\"text-left\"><strong>");
 out.print(u.getUsername());  
      out.write("</strong></p>\n");
      out.write("                                                        <p class=\"text-left small\">");
 out.print(u.getEmail());  
      out.write("</p>\n");
      out.write("                                                        <p class=\"text-left\">\n");
      out.write("                                                            <a href=\"#\" class=\"btn btn-primary btn-block btn-sm\">Profile</a>\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"divider navbar-login-session-bg\" ></li>\n");
      out.write("                                        <li><a href=\"#\">Edit <span class=\"glyphicon glyphicon-cog pull-right\"></span></a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"logout\">logout<span class=\"glyphicon glyphicon-log-out\" style=\"padding-left: 250px\"></span></a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <!-- End Nav Section-->\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- New section -->\n");
      out.write("        <section class=\"Course\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label class=\"search\" for=\"search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                    </i>Search</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"search\" name=\"search\" class=\"form-control\" id=\"search\" placeholder=\"Search Courses\">\n");
      out.write("                <ul id=\"myUL\" >\n");
      out.write("                    <div id=\"se\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- first course -->\n");
      out.write("            ");

                int j = 0;
                List<courses> co = coursesCRUD.getcoursesData();

                int i = 0;
                Collections.sort(co, new courses());
                for (courses elem : co) {
                    if (!elem.getLevel().equals(u.getLevel())) {
                        System.out.println("c leve : " + elem.getLevel());
                        System.out.println("u leve  :" + u.getLevel());
                        continue;
                    }
            
      out.write("\n");
      out.write("            <div class=\"e\">\n");
      out.write("                <img class=\"img\" src=\"");
out.print(elem.getSourceImage());
      out.write("\" alt=\"Courses\"/>\n");
      out.write("                <h3><a href=\"");
   out.print(elem.getLink()); 
      out.write("\"> ");
 out.print(elem.getName()); 
      out.write("</a></h3>\n");
      out.write("                <p><b> By :</b> ");
 out.print(elem.getInst());
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"stars\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <p><b> Course Rate :</b></p>\n");
      out.write("                    <fieldset class=\"rating\">\n");
      out.write("                        <input type=\"radio\" id=\"star5");
out.print(i);
      out.write("\" name=\"rating\" value=\"5\" /><label class = \"full\" for=\"star5");
out.print(i);
      out.write("\" title=\"Awesome - 5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star4half");
out.print(i);
      out.write("\" name=\"rating\" value=\"4 and a half\" /><label class=\"half\" for=\"star4half");
out.print(i);
      out.write("\" title=\"Pretty good - 4.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star4");
out.print(i);
      out.write("\" name=\"rating\" value=\"4\" /><label class = \"full\" for=\"star4");
out.print(i);
      out.write("\" title=\"Pretty good - 4 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star3half");
out.print(i);
      out.write("\" name=\"rating\" value=\"3 and a half\" /><label class=\"half\" for=\"star3half");
out.print(i);
      out.write("\" title=\"Meh - 3.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star3");
out.print(i);
      out.write("\" name=\"rating\" value=\"3\" /><label class = \"full\" for=\"star3");
out.print(i);
      out.write("\" title=\"Meh - 3 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star2half");
out.print(i);
      out.write("\" name=\"rating\" value=\"2 and a half\" /><label class=\"half\" for=\"star2half");
out.print(i);
      out.write("\" title=\"Kinda bad - 2.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star2");
out.print(i);
      out.write("\" name=\"rating\" value=\"2\" /><label class = \"full\" for=\"star2");
out.print(i);
      out.write("\" title=\"Kinda bad - 2 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star1half");
out.print(i);
      out.write("\" name=\"rating\" value=\"1 and a half\" /><label class=\"half\" for=\"star1half");
out.print(i);
      out.write("\" title=\"Meh - 1.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star1");
out.print(i);
      out.write("\" name=\"rating\" value=\"1\" /><label class = \"full\" for=\"star1");
out.print(i);
      out.write("\" title=\"Sucks big time - 1 star\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"starhalf");
out.print(i++);
      out.write("\" name=\"rating\" value=\"half\" /><label class=\"half\" for=\"starhalf");
out.print(i++);
      out.write("\" title=\"Sucks big time - 0.5 stars\"></label>\n");
      out.write("                    </fieldset>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p style=\"font-size: 14px\"><a class=\"readMore\" href=\"");
   out.print(elem.getLink()); 
      out.write("\"> <a href=\"");
   out.print(elem.getLink()); 
      out.write("\">Take Course</a> <i class=\"fa fa-angle-right\"></i></a></p>\n");
      out.write("            </div>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            <!--End-->\n");
      out.write("            <!--secand Course -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--End-->\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- start scroll up-->\n");
      out.write("        <div id=\"scroll\">\n");
      out.write("            <i class=\"fa fa-chevron-up fa-2x\"></i>\n");
      out.write("        </div>\n");
      out.write("        <!-- end scroll up-->\n");
      out.write("        <script src=\"js/bars.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var search_input = $('#search');\n");
      out.write("                search_input.on('change', function () {\n");
      out.write("                    alert(search_input.val());\n");
      out.write("                    var search_key = search_input.val();\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'search_for_course',\n");
      out.write("                        data: {\"key\": search_key},\n");
      out.write("                        method: 'POST',\n");
      out.write("                        success: function (result) {\n");
      out.write("                            if (search_key != \"\") {\n");
      out.write("\n");
      out.write("\n");
      out.write("                                console.log(result);\n");
      out.write("                                $('#se').html(result);\n");
      out.write("                            } else {\n");
      out.write("                                $('#se').html(\"<li><a href=\"#\" ></a></li>\");\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function () {\n");
      out.write("                            alert('internal server error');\n");
      out.write("                        },\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("    </script>\n");
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
