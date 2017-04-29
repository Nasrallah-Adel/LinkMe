package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                            <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            \\\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("            <!-- End Nav Section-->\n");
      out.write("        </header>\n");
      out.write("        <!-- Start form section-->\n");
      out.write("        <section class=\"form\" id=\"logIn\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"form-container\">\n");
      out.write("                    <h3 class=\"text-center\">Log Into Your Account</h3>\n");
      out.write("                    <form method=\"post\" action=\"login\">\n");
      out.write("                       \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password\"><i class=\"fa fa-key\" aria-hidden=\"true\"></i>Verification Code</label>\n");
      out.write("                            <input type=\"text\" name=\"vc\" class=\"form-control\" id=\"vc\" placeholder=\"Enter Your Verification Code\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-info\">Verify</button>\n");
      out.write("                       \n");
      out.write("                    </form>\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End form section-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </body>\n");
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
