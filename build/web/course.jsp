<%@page import="model.user"%>
<%@page import="model.courses"%>
<%@page import="java.util.List"%>
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
        <link rel="stylesheet" href="css/cousre.css"/>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    </head>
    <body>
        <%

            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
            }

            if (request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("login.jsp");
            }
            user user = ((user) request.getSession().getAttribute("user"));
            System.out.println(user.getVal());
            if (user.getVal().equals("no")) {
                response.sendRedirect("verify.jsp");
            }

        %>
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
                            <li><a href="index.jsp">HOME</a></li>
                            <li><a href="course.jsp">COURSES</a></li>
                            <li><a href="#">ABOUT</a></li>
                            <li><a href="events.jsp">EVENT</a></li>
                            <li><a href="#">CONTACT</a></li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->

            </nav>
            <!-- End Nav Section-->

        </header>

        <!-- New section -->
        <section class="Course">
            <div class="form-group">


                <label class="search" for="search"><i class="fa fa-search" aria-hidden="true"></i>
                    </i>Search</label>

                <input type="search" name="search" class="form-control" id="search" placeholder="Search Courses">
            </div>

            <!-- first course -->
            <%                SessionFactory sf = new Configuration().configure().buildSessionFactory();
                Session s = sf.openSession();
                s.beginTransaction();
                List<courses> co = coursesCRUD.getcoursesData(s);
                s.getTransaction().commit();
                out.print(co.size());
                int i = 0;
                for (courses elem : co) {
                    if (!user.getCareer().toLowerCase().equals(elem.getType().toLowerCase())) {
                        continue;
                    }
            %>
            <div class="e">
                <img class="img" src="<%out.print(elem.getSourceImage());%>" alt="Courses"/>
                <h3><a href="<%   out.print(elem.getLink()); %> " target="_blank"> <% out.print(elem.getName()); %></a></h3>
                <p><b> By :</b> <% out.print(elem.getInst());%></p>


                <div class="stars">


                    <p><b> Course Rate :</b></p>
                    <form action="rat" method="POST">

                        <fieldset class="rating">
                            <input type="radio" id="star5<%out.print(i);%>" name="rating<%out.print(i);%>" value="5" /><label class = "full" for="star5<%out.print(i);%>" title="Awesome - 5 stars"></label>
                            <input type="radio" id="star4half<%out.print(i);%>" name="rating<%out.print(i);%>" value="4 and a half" /><label class="half" for="star4half<%out.print(i);%>" title="Pretty good - 4.5 stars"></label>
                            <input type="radio" id="star4<%out.print(i);%>" name="rating<%out.print(i);%>" value="4" /><label class = "full" for="star4<%out.print(i);%>" title="Pretty good - 4 stars"></label>
                            <input type="radio" id="star3half<%out.print(i);%>" name="rating<%out.print(i);%>" value="3 and a half" /><label class="half" for="star3half<%out.print(i);%>" title="Meh - 3.5 stars"></label>
                            <input type="radio" id="star3<%out.print(i);%>" name="rating<%out.print(i);%>" value="3" /><label class = "full" for="star3<%out.print(i);%>" title="Meh - 3 stars"></label>
                            <input type="radio" id="star2half<%out.print(i);%>" name="rating<%out.print(i);%>" value="2 and a half" /><label class="half" for="star2half<%out.print(i);%>" title="Kinda bad - 2.5 stars"></label>
                            <input type="radio" id="star2<%out.print(i);%>" name="rating<%out.print(i);%>" value="2" /><label class = "full" for="star2<%out.print(i);%>" title="Kinda bad - 2 stars"></label>
                            <input type="radio" id="star1half<%out.print(i);%>" name="rating<%out.print(i);%>" value="1 and a half" /><label class="half" for="star1half<%out.print(i);%>" title="Meh - 1.5 stars"></label>
                            <input type="radio"type="submit" id="star1<%out.print(i);%>" name="rating<%out.print(i);%>" value="1" /><label class = "full" for="star1<%out.print(i);%>" title="Sucks big time - 1 star"></label>
                            <input type="radio" type="submit"id="starhalf<%out.print(i++);%>" name="rating<%out.print(i++);%>" value="half" /><label class="half" for="starhalf<%out.print(i++);%>" title="Sucks big time - 0.5 stars"></label>
                        </fieldset>
                    </form>
                </div>

                <p style="font-size: 14px"><a class="readMore" href="<%   out.print(elem.getLink()); %>" target="_blank" > <a href="<%   out.print(elem.getLink()); %>" target="_blank">Take Course</a> <i class="fa fa-angle-right"></i></a></p>
            </div>
            <% }%>
            <!--End-->
            <!--secand Course -->


            <!--End-->
        </section>

        <!-- start scroll up-->
        <div id="scroll">
            <i class="fa fa-chevron-up fa-2x"></i>
        </div>
        <!-- end scroll up-->
        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/custom.js"></script>
    </body>
</html>
