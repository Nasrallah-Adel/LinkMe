<%@page import="Control.eventCRUD"%>
<%@page import="Control.UserCRUD"%>
<%@page import="model.user"%>

<%@page import="model.Event"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="Control.coursesCRUD"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.util.List"%>
<html>
    <head>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,800"/>
        <!-- IE compatibilty meta-->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Mobile meta-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="UTF-8">
        <title>LinkMe</title>
        <link rel="stylesheet" href="css/font-awesome.min.css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/registration.css"/>
        <link rel="stylesheet" href="css/events.css"/>

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,800"/>
        <!-- IE compatibilty meta-->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Mobile meta-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="UTF-8">
        <script src="js/bootstrap.js"></script>
        <title>LinkMe</title>
        <link rel="stylesheet" href="css/font-awesome.min.css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/registration.css"/>
        <link rel="stylesheet" href="css/events.css"/>

        <%

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
        %>

    </head>
    <body>
        <header>
            <!--Start navigation bar -->
            <nav class="navbar">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">

                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"><h3>LINK<span class="main-color">ME</span></h3></a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">

                            <li><a href="course.jsp">COURSES</a></li>
                            <li><a href="about.jsp">ABOUT</a></li>
                            <li><a href="events.jsp">EVENT</a></li>
                            <li><a href="contact_us.jsp">CONTACT</a></li>
                            <li><a href="Profile.jsp">Profile</a></li>
                            <ul class="nav navbar-nav navbar-right">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                        <span class="glyphicon glyphicon-user"></span>
                                        <strong><% out.print(u.getF_name());  %></strong>
                                        <span class="glyphicon glyphicon-chevron-down"></span>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <div class="navbar-login">
                                                <div class="row">
                                                    <div class="col-lg-4">
                                                        <p class="text-center">
                                                            <span class="glyphicon glyphicon-user icon-size"></span>
                                                        </p>
                                                    </div>
                                                    <div class="col-lg-8">
                                                        <p class="text-left"><strong><% out.print(u.getUsername());  %></strong></p>
                                                        <p class="text-left small"><% out.print(u.getEmail());  %></p>
                                                        <p class="text-left">
                                                            <a href="#" class="btn btn-primary btn-block btn-sm">Profile</a>
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                        <li class="divider navbar-login-session-bg" ></li>
                                        <li><a href="#">Edit <span class="glyphicon glyphicon-cog pull-right"></span></a></li>
                                        <li class="divider"></li>
                                        <li><a href="logout">logout<span class="glyphicon glyphicon-log-out" style="padding-left: 250px"></span></a></li>

                                    </ul>
                                </li>
                            </ul> 
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->

            </nav>
            <!-- End Nav Section-->

        </header>

        <!-- New section -->
        <section class="Event">
            <div class="form-group">


                <label class="search" for="search"><i class="fa fa-search" aria-hidden="true"></i>
                    </i>Search</label>

                <input type="search" name="search" class="form-control" id="search" placeholder="Search Events">
            </div>
            <%
                List<Event> ev = eventCRUD.geteventData();

                int i = 0;
                for (Event elem : ev) {

            %>
            <div class="e">
                <img class="img" src="<% out.print(elem.getSrcImage());%>" alt="events"/>
                <h3><a href="<% out.print(elem.getLinke());%>"><% out.print(elem.getName());%></a></h3>
                <ul class="contents" >
                    <li><i class="fa fa-calendar"></i> <% out.print(elem.getDate());%></li>

                    <li><i class="fa fa-map-marker"></i> <% out.print(elem.getSpeaker());%></li>
                </ul >
            </div>
            <% }%>
        </section>

        <!-- start scroll up-->
        <div id="scroll">
            <i class="fa fa-chevron-up fa-2x"></i>
        </div>
        <!-- end scroll up-->

        <script src="js/bars.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
        <script src="js/owl.carousel.js"></script>
        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/custom.js"></script>
        <script src="js/bootstrap.js"></script>
    </body>
</html>