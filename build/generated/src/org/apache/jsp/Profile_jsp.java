package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--A Design by W3layouts\r\n");
      out.write("Author: W3layout\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>LinkMe </title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Creative Resume Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- bootstrap-css -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// bootstrap-css -->\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/profile.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"css/owl.theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/cm-overlay.css\" />\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<!-- font -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Roboto+Slab:100,300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- //font -->\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<!-- menu -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/main.js\"></script>\r\n");
      out.write("<!-- //menu --> \r\n");
      out.write(" ");

           
            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
            }

            if (request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("login.jsp");
            }

        
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() { \r\n");
      out.write("\t$(\"#owl-demo\").owlCarousel({\r\n");
      out.write(" \r\n");
      out.write("\t\tautoPlay: 3000, //Set AutoPlay to 3 seconds\r\n");
      out.write("\t\tautoPlay:true,\r\n");
      out.write("\t\titems : 3,\r\n");
      out.write("\t\titemsDesktop : [640,5],\r\n");
      out.write("\t\titemsDesktopSmall : [414,4]\r\n");
      out.write(" \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("}); \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"overlay\">\r\n");
      out.write("\t\t<!--Start navigation bar -->\r\n");
      out.write("\t\t<nav class=\"navbar\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\"><h3>LINK<span style=\"color: #01a39b\" >ME</span></h3></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"course.html\">COURSES</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">ABOUT</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"events.html\">EVENT</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#contact\">CONTACT ME</a></li>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>Salman</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-down\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"navbar-login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user icon-size\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-left\"><strong>Salman Khan</strong></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-left small\">crazytodevelop@@gmail.com</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary btn-block btn-sm\">Profile</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"divider navbar-login-session-bg\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Account Settings <span class=\"glyphicon glyphicon-cog pull-right\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">User stats <span class=\"glyphicon glyphicon-stats pull-right\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Messages <span class=\"badge pull-right\"> 42 </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Favourites Snippets <span class=\"glyphicon glyphicon-heart pull-right\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Sign Out <span class=\"glyphicon glyphicon-log-out pull-right\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- /.navbar-collapse -->\r\n");
      out.write("\t\t\t</div><!-- /.container-fluid -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!-- End Nav Section-->\r\n");
      out.write("\t\t<!-- End navigation bar -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- banner -->\r\n");
      out.write("\t<div class=\"banner\" id=\"home\">\r\n");
      out.write("\t\t<!-- menu -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"m_nav_container\" class=\"m_nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Profile.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">about</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">courses</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Event</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Contact</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- menu -->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"w3l-banner-grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 w3ls-banner-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"w3-button\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3-button-info m_nav_item\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree-about-grids\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6 wthree-about-right\" style=\"padding-top: 3px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3 style=\"color: white\">Skills</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"skills-bar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<section class='bar'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<section class='wrap'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='wrap_right'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class='bar_group'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class='bar_group__bar thin' label='Css' show_values='true' tooltip='true' value='235'><button class=\"takeexam\" type=\"button\">Exam</button></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class='bar_group__bar thin' label='Photoshop' show_values='true' tooltip='true' value='675'><button class=\"takeexam1\" type=\"button\"> Exam</button></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class='bar_group__bar thin' label='illustratior' show_values='true' tooltip='true' value='456'><button class=\"takeexam2\" type=\"button\"> Exam</button></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class='bar_group__bar thin' label='Php' show_values='true' tooltip='true' value='245'><button class=\"takeexam3\" type=\"button\"> Exam</button></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='clear'></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div >\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 w3ls-banner-left\" style=\"padding-top: 50px\">\r\n");
      out.write("\t\t\t\t\t<h1 style=\"color: white\">Personal Details</h1>\r\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-banner-left-info\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Job Title</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>Web Designer </p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-banner-left-info\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Name</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>Hoda Ahmed</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"w3ls-banner-left-info\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Email Address</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>Hodaammar1995@gmail.com</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //banner -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/bars.js\"></script>\r\n");
      out.write("\t<script src=\"js/owl.carousel.js\"></script>\r\n");
      out.write("\t</div>\r\n");
      out.write("   </header>\r\n");
      out.write("</body>\t\r\n");
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
