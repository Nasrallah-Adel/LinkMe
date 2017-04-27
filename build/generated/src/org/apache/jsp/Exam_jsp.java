package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Exam_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,800\"/>\r\n");
      out.write("    <!-- IE compatibilty meta-->\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <!-- Mobile meta-->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>LinkMe</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/registration.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Exam.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("     ");

           
            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
            }

            if (request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("login.jsp");
            }

        
      out.write("\r\n");
      out.write("    <!--Start navigation bar -->\r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><h3>LINK<span class=\"main-color\">ME</span></h3></a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li><a href=\"index.html\">HOME</a></li>\r\n");
      out.write("                    <li><a href=\"course.html\">COURSES</a></li>\r\n");
      out.write("                    <li><a href=\"#\">ABOUT</a></li>\r\n");
      out.write("                    <li><a href=\"events.html\">EVENT</a></li>\r\n");
      out.write("                    <li><a href=\"#\">CONTACT</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!-- /.navbar-collapse -->\r\n");
      out.write("        </div><!-- /.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- End Nav Section-->\r\n");
      out.write("</header>\r\n");
      out.write("<!-- New section -->\r\n");
      out.write("<section class=\"Event\">\r\n");
      out.write("    <h2 style=\"padding-left:500px\" ><b>Level 1 Quiz</b>  </h2> <br>\r\n");
      out.write("    <fieldset class=\"group\">\r\n");
      out.write("        <legend>1. A piece of icon or image on a web page associated with another webpage is called</legend>\r\n");
      out.write("        <ul class=\"checkbox\">\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb1\" value=\"url\" /><label for=\"cb1\">url</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb2\" value=\"hyperlink\" /><label for=\"cb2\">hyperlink</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb3\" value=\"plugin\" /><label for=\"cb3\">plugin</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb4\" value=\"none of the mentioned\" /><label for=\"cb4\">none of the mentioned</label></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <fieldset class=\"group\">\r\n");
      out.write("        <legend> 2. Dynamic web page</legend>\r\n");
      out.write("        <ul class=\"checkbox\">\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb7\" value=\"ans1\" /><label for=\"cb7\">is same every time whenever it displays</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb8\" value=\"portobello\" /><label for=\"cb8\">generates on demand by a program or a request from browser</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb9\" value=\"ypeppers\" /><label for=\"cb9\"> both (a) and (b)</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb10\" value=\"bcheese\" /><label for=\"cb10\">none of the mentioned</label></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset class=\"group\">\r\n");
      out.write("        <legend> 2. Dynamic web page</legend>\r\n");
      out.write("        <ul class=\"checkbox\">\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb19\" value=\"ans1\" /><label for=\"cb7\">is same every time whenever it displays</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb20\" value=\"portobello\" /><label for=\"cb8\">generates on demand by a program or a request from browser</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb21\" value=\"ypeppers\" /><label for=\"cb9\"> both (a) and (b)</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb22\" value=\"bcheese\" /><label for=\"cb10\">none of the mentioned</label></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset class=\"group\">\r\n");
      out.write("        <legend> 2. Dynamic web page</legend>\r\n");
      out.write("        <ul class=\"checkbox\">\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb11\" value=\"ans1\" /><label for=\"cb7\">is same every time whenever it displays</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb12\" value=\"portobello\" /><label for=\"cb8\">generates on demand by a program or a request from browser</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb13\" value=\"ypeppers\" /><label for=\"cb9\"> both (a) and (b)</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb14\" value=\"bcheese\" /><label for=\"cb10\">none of the mentioned</label></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset class=\"group\">\r\n");
      out.write("        <legend> 2. Dynamic web page</legend>\r\n");
      out.write("        <ul class=\"checkbox\">\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb15\" value=\"ans1\" /><label for=\"cb7\">is same every time whenever it displays</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb16\" value=\"portobello\" /><label for=\"cb8\">generates on demand by a program or a request from browser</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb17\" value=\"ypeppers\" /><label for=\"cb9\"> both (a) and (b)</label></li>\r\n");
      out.write("            <li><input type=\"radio\" id=\"cb18\" value=\"bcheese\" /><label for=\"cb10\">none of the mentioned</label></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <div class=\"buttons\">\r\n");
      out.write("        <a href=\"#\" class=\"upper\" style=\"color: #0f1215\"> Submit </a>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    // Using JQuery selectors to add onFocus and onBlur event handlers\r\n");
      out.write("\r\n");
      out.write("    $(document).ready( function() {\r\n");
      out.write("\r\n");
      out.write("            // Add the \"focus\" value to class attribute\r\n");
      out.write("            $('ul.checkbox li').focusin( function() {\r\n");
      out.write("                    $(this).addClass('focus');\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("\r\n");
      out.write("            // Remove the \"focus\" value to class attribute\r\n");
      out.write("            $('ul.checkbox li').focusout( function() {\r\n");
      out.write("                    $(this).removeClass('focus');\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    );\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- start scroll up-->\r\n");
      out.write("<div id=\"scroll\">\r\n");
      out.write("    <i class=\"fa fa-chevron-up fa-2x\"></i>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- end scroll up-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-3.2.0.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/bars.js\"></script>\r\n");
      out.write("    <script src=\"js/exam.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.js\"></script>");
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
