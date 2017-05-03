package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import listener.DB;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");

        DB db = new DB();
        db.s.getTransaction().begin();
        db.tx = db.s.getTransaction();
    
      out.write("\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/overlay.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!--[if it IE 9]>\r\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\r\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
            } else if (!request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("course.jsp");
            }
        
      out.write("\r\n");
      out.write("        <!-- start header -->\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"overlay\">\r\n");
      out.write("\r\n");
      out.write("                <!--Start navigation bar -->\r\n");
      out.write("                <nav class=\"navbar\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\"><h3>LINK<span class=\"main-color\">ME</span></h3></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                        <div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <!--\r\n");
      out.write("                                                                <li class=\"active\" ><a href=\"#home\">Home</a></li>\r\n");
      out.write("                                                                <li><a href=\"#about\">About</a></li>\r\n");
      out.write("                                                                <li><a href=\"#project\">Courses</a></li>\r\n");
      out.write("                                                                <li><a href=\"#news\">Events</a></li>\r\n");
      out.write("                                                                <li class=\"last\"><a href=\"#contact\">Contact</a></li-->\r\n");
      out.write("                                <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                                <li><a href=\"#courses\">Courses</a></li>\r\n");
      out.write("                                <li><a href=\"#about\">ABOUT</a></li>\r\n");
      out.write("                                <li><a href=\"#event\">EVENT</a></li>\r\n");
      out.write("                                <li><a href=\"#contact\">CONTACT</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div><!-- /.navbar-collapse -->\r\n");
      out.write("                    </div><!-- /.container-fluid -->\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- End Nav Section-->\r\n");
      out.write("                <!-- End navigation bar -->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"intro text-center\" >\r\n");
      out.write("                            <h1 class=\"upper\"> Now you can <span class=\"main-color\"> Develop</span> yourself <span class=\"main-color\"> ! </span> </h1>\r\n");
      out.write("                            <p> You can create your own profile and stay up for\r\n");
      out.write("                                the new tecnology courses and event on one place </p>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"buttons\">\r\n");
      out.write("                                <a href=\"signUp.jsp\" class=\"upper\"> Sign Up </a>\r\n");
      out.write("                                <a href=\"login.jsp\" class=\"upper\" > Log in </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"arrow\"><i class=\"fa fa-chevron-down\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- end header -->\r\n");
      out.write("        <!-- start features -->\r\n");
      out.write("        <!-- Start New Courses Section-->\r\n");
      out.write("        <section class=\"newCourses text-center\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h2 class=\"upper\">New Courses</h2>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                        <div class=\"course\" id=\"courses\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"images/java.png\" alt=\"course\"/>\r\n");
      out.write("                                <span>Web Design</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                        <div class=\"course\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"images/java.png\" alt=\"course\"/>\r\n");
      out.write("                                <span>Web Design</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                        <div class=\"course\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"images/java.png\" alt=\"course\"/>\r\n");
      out.write("                                <span>Web Design</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                        <div class=\"course\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"images/java.png\" alt=\"course\"/>\r\n");
      out.write("                                <span>Web Design</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                        <div class=\"course\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"images/java.png\" alt=\"course\"/>\r\n");
      out.write("                                <span>Web Design</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                        <div class=\"course\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"images/java.png\" alt=\"course\"/>\r\n");
      out.write("                                <span>Web Design</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"course.jsp\" class=\"btn btn-info allCourses\">All Courses</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- End New Courses Section-->\r\n");
      out.write("        <!-- Start Testimonials Section-->\r\n");
      out.write("        <section class=\"testimonials\">\r\n");
      out.write("            <div class=\"container\" id=\"about\">\r\n");
      out.write("                <h2>What People Say About us!</h2>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\" col-md-6 testi\">\r\n");
      out.write("                        <img src=\"images/person.jpg\" alt=\"person\">\r\n");
      out.write("                        <div class=\"info\"  >\r\n");
      out.write("                            <p>âNullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.â</p>\r\n");
      out.write("                            <h3>Chanel Iman</h3>\r\n");
      out.write("                            <span>Ceo Of Pinterest</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 testi\">\r\n");
      out.write("                        <img src=\"images/person.jpg\" alt=\"person\">\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                            <p>âNullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.â</p>\r\n");
      out.write("                            <h3>Chanel Iman</h3>\r\n");
      out.write("                            <span>Ceo Of Pinterest</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 testi\">\r\n");
      out.write("                        <img src=\"images/person.jpg\" alt=\"person\">\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                            <p>âNullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.â</p>\r\n");
      out.write("                            <h3>Chanel Iman</h3>\r\n");
      out.write("                            <span>Ceo Of Pinterest</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 testi\">\r\n");
      out.write("                        <img src=\"images/person.jpg\" alt=\"person\">\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                            <p>âNullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.â</p>\r\n");
      out.write("                            <h3>Chanel Iman</h3>\r\n");
      out.write("                            <span>Ceo Of Pinterest</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- End Testimonials Section-->\r\n");
      out.write("        <!-- Start New Events Section-->\r\n");
      out.write("        <section class=\"newEvents\">\r\n");
      out.write("            <h2 class=\"upper text-center\">What&rsquo;s New?</h2>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <p class=\"text-center lead\">Get the latest Events from our blog</p>\r\n");
      out.write("            <div class=\"container\" id=\"event\">\r\n");
      out.write("                <div class=\"row event\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <img src=\"images/images.jpg\" width=\"509\" height=\"293\" class=\"img-responsive picsGall\"/>\r\n");
      out.write("                        <h3><a href=\"#\">Lorem Ipsum Dolor sit Amet Pelenntesque Sodales!</a></h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><i class=\"fa fa-calendar\"></i>April 25, 2014</li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-folder-open\"></i>Staff</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-comments\"></i>17 comments</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit quisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. adipiscing vitae vel quam proin eget mauris eget. <a class=\"readMore\" href=\"#\">Read More <i class=\"fa fa-angle-right\"></i></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <img src=\"images/images.jpg\" width=\"502\" height=\"275\" class=\"img-responsive picsGall\"/>\r\n");
      out.write("                        <h3><a href=\"#\">Nam in Nisl id Ipsum Feugiat Posuere ut sit Amet Sem</a></h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><i class=\"fa fa-calendar\"></i>April 25, 2014</li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-folder-open\"></i>Staff</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-comments\"></i>17 comments</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit quisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. adipiscing vitae vel quam proin eget mauris eget. <a class=\"readMore\" href=\"#\">Read More <i class=\"fa fa-angle-right\"></i></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"events.html\"  class=\"btn btn-info allEvents\">All Events</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- End New Events Section-->\r\n");
      out.write("        <!--start our team section-->\r\n");
      out.write("        <section class=\"our-team text-center\">\r\n");
      out.write("            <div class=\"team\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>Meet Our Team</h2>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInLeft\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Hoda Ahmed</h4>\r\n");
      out.write("                                <p>Web Designer</p>\r\n");
      out.write("                                <a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"linked\" href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInUp\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Marwa Amer</h4>\r\n");
      out.write("                                <p>Web Developer</p>\r\n");
      out.write("                                <a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"linked\" href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInUp\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Mohamed Fayez</h4>\r\n");
      out.write("                                <p>Web Develop</p>\r\n");
      out.write("                                <a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"linked\" href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInUp\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Mina George</h4>\r\n");
      out.write("                                <p>Web Developer</p>\r\n");
      out.write("                                <a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"linked\" href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInUp\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Mostafa Aboelnasr</h4>\r\n");
      out.write("                                <p>Web Developer</p>\r\n");
      out.write("                                <a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"linked\" href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInUp\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Mahmoud Abdelwahab</h4>\r\n");
      out.write("                                <p>Web Developer</p>\r\n");
      out.write("                                <a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"linked\" href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInDown\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Moustafa Ahmed</h4>\r\n");
      out.write("                                <p >Database Admin</p>\r\n");
      out.write("                                <a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a class=\"linked\" href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6\" >\r\n");
      out.write("                            <div class=\"person wow zoomInRight\" data-wow-duration=\"1s\" data-wow-offset=\"300\">\r\n");
      out.write("                                <img class=\"img-responsive img-circle hvr-bubble-float-bottom img-thumbnail\" src=\"images/person.jpg\" alt=\"person\"/>\r\n");
      out.write("                                <h4>Nasrallah Adel</h4>\r\n");
      out.write("                                <p >Web Developer</p>\r\n");
      out.write("                                <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook-square fa-2x\"></i></a>\r\n");
      out.write("                                <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter-square fa-2x\"></i></a>\r\n");
      out.write("                                <a href=\"#\" class=\"linked\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!--end our team section-->\r\n");
      out.write("        <!-- start contact section-->\r\n");
      out.write("        <section class=\"contact-us text-center\">\r\n");
      out.write("            <div class=\"contact\"id=\"contact\" >\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <i class=\"fa fa-headphones fa-5x\"></i>\r\n");
      out.write("                        <h2>Contact Us</h2>\r\n");
      out.write("                        <form role=\"form\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input class=\"form-control input-lg\" type=\"text\" placeholder=\"User Name\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input class=\"form-control input-lg\" type=\"text\" placeholder=\"Enter Your Email\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input class=\"form-control input-lg\" type=\"text\" placeholder=\"Cell Phone\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <textarea class=\"form-control input-lg\" placeholder=\"Enter Your Message\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"btn btn-info btn-lg btn-block bu-m\">Contact Us</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- end contact section-->\r\n");
      out.write("        <!-- start scroll up-->\r\n");
      out.write("        <div id=\"scroll\">\r\n");
      out.write("            <i class=\"fa fa-chevron-up fa-2x\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end scroll up-->\r\n");
      out.write("        <!-- Start Footer Section-->\r\n");
      out.write("        <footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- End Footer Section-->\r\n");
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
