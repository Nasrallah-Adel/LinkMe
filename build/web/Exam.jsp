<%@page import="model.Event"%>
<%@page import="org.hibernate.SessionFactory"%><%@page import="java.util.List"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="Control.coursesCRUD"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
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
        <link rel="stylesheet" href="css/Exam.css"/>
    </head>
    <body>
        <header>
            <%

                if (request.getSession().getAttribute("aut") == null) {
                    request.getSession().setAttribute("aut", "false");
                }

                if (request.getSession().getAttribute("aut").equals("false")) {
                    response.sendRedirect("login.jsp");
                }

            %>
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
                            <li><a href="index.html">HOME</a></li>
                            <li><a href="course.html">COURSES</a></li>
                            <li><a href="#">ABOUT</a></li>
                            <li><a href="events.html">EVENT</a></li>
                            <li><a href="#">CONTACT</a></li>
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

            <div class="e">
                <img class="img" src="images/Post.png" alt="events"/>
                <h3><a href="https://www.facebook.com/events/193233304503339/"> Developer Cafe | MUFIX Community </a></h3>
                <ul class="contents" >
                    <li><i class="fa fa-calendar"></i> March 21, 2017</li>
                    <li><i class="fa fa-clock-o"></i> 11:00â??14:30 </li>
                    <li><i class="fa fa-map-marker"></i> Lecture Room 4</li>
                </ul >
                <p style="font-size: 14px">Lorem ipsum dolor sit amet, consectetur adipiscing elit quisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. adipiscing vitae vel quam proin eget mauris eget. <a class="readMore" href="#"> <a href="https://www.facebook.com/events/193233304503339/">Go To Event</a> <i class="fa fa-angle-right"></i></a></p>
            </div>


            <div class="buttons">
                <a href="#" class="upper" style="color: #0f1215"> Submit </a>

            </div>
            <br>
        </section>

        <script type="text/javascript">
            // Using JQuery selectors to add onFocus and onBlur event handlers

            $(document).ready(function () {

                // Add the "focus" value to class attribute
                $('ul.checkbox li').focusin(function () {
                    $(this).addClass('focus');
                }
                );

                // Remove the "focus" value to class attribute
                $('ul.checkbox li').focusout(function () {
                    $(this).removeClass('focus');
                }
                );

            }
            );

        </script>
        <%                SessionFactory sf = new Configuration().configure().buildSessionFactory();

            Session s = sf.openSession();
            s.beginTransaction();
            List<Event> co = examCRUD.geteventData(s);
            s.getTransaction().commit();
            int i = 0;
            for (Event elem : co) {

        %>
        <!-- start scroll up-->
        <div id="scroll">
            <i class="fa fa-chevron-up fa-2x"></i>
        </div>
        <!-- end scroll up-->


        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/custom.js"></script>

        <script src="js/bars.js"></script>
        <script src="js/exam.js"></script>
        <script src="js/owl.carousel.js"></script>