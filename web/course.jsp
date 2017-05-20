<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.UserCRUD"%>
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
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,800"/>
        <!-- IE compatibilty meta-->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Mobile meta-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="UTF-8">
        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/custom.js"></script>
        <script src="js/bootstrap.js"></script>
        <title>LinkMe</title>
        <link rel="stylesheet" href="css/Exam.css"/>
    </head>
    <body>
        <script>
            $(document).ready(function () {
                $("#owl-demo").owlCarousel({

                    autoPlay: 3000, //Set AutoPlay to 3 seconds
                    autoPlay: true,
                    items: 1,
                    itemsDesktop: [1000, 5],

                });

            });
        </script>
        <%
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
        <section class="Course">
            <div class="form-group">


                <label class="search" for="search"><i class="fa fa-search" aria-hidden="true"></i>
                    </i>Search</label>


                <input type="search" name="search" class="form-control" id="search" placeholder="Search Courses">
                <ul id="myUL" >
                    <div id="se">





                    </div>
                </ul>
            </div>

            <!-- first course -->
            <%
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
            %>
            <div class="e">
                <img class="img" src="<%out.print(elem.getSourceImage());%>" alt="Courses"/>
                <h3><a href="<%   out.print(elem.getLink()); %>"> <% out.print(elem.getName()); %></a></h3>
                <p><b> By :</b> <% out.print(elem.getInst());%></p>


                <div class="stars">


                    <p><b> Course Rate :</b></p>
                    <fieldset class="rating">
                        <input type="radio" id="star5<%out.print(i);%>" name="rating" value="5" /><label class = "full" for="star5<%out.print(i);%>" title="Awesome - 5 stars"></label>
                        <input type="radio" id="star4half<%out.print(i);%>" name="rating" value="4 and a half" /><label class="half" for="star4half<%out.print(i);%>" title="Pretty good - 4.5 stars"></label>
                        <input type="radio" id="star4<%out.print(i);%>" name="rating" value="4" /><label class = "full" for="star4<%out.print(i);%>" title="Pretty good - 4 stars"></label>
                        <input type="radio" id="star3half<%out.print(i);%>" name="rating" value="3 and a half" /><label class="half" for="star3half<%out.print(i);%>" title="Meh - 3.5 stars"></label>
                        <input type="radio" id="star3<%out.print(i);%>" name="rating" value="3" /><label class = "full" for="star3<%out.print(i);%>" title="Meh - 3 stars"></label>
                        <input type="radio" id="star2half<%out.print(i);%>" name="rating" value="2 and a half" /><label class="half" for="star2half<%out.print(i);%>" title="Kinda bad - 2.5 stars"></label>
                        <input type="radio" id="star2<%out.print(i);%>" name="rating" value="2" /><label class = "full" for="star2<%out.print(i);%>" title="Kinda bad - 2 stars"></label>
                        <input type="radio" id="star1half<%out.print(i);%>" name="rating" value="1 and a half" /><label class="half" for="star1half<%out.print(i);%>" title="Meh - 1.5 stars"></label>
                        <input type="radio" id="star1<%out.print(i);%>" name="rating" value="1" /><label class = "full" for="star1<%out.print(i);%>" title="Sucks big time - 1 star"></label>
                        <input type="radio" id="starhalf<%out.print(i++);%>" name="rating" value="half" /><label class="half" for="starhalf<%out.print(i++);%>" title="Sucks big time - 0.5 stars"></label>
                    </fieldset>
                </div>

                <p style="font-size: 14px"><a class="readMore" href="<%   out.print(elem.getLink()); %>"> <a href="<%   out.print(elem.getLink()); %>">Take Course</a> <i class="fa fa-angle-right"></i></a></p>
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
        <script src="js/bars.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
        <script src="js/owl.carousel.js"></script>
    </body>
    <script type="text/javascript">
            $(document).ready(function () {
                var search_input = $('#search');
                search_input.on('change', function () {
                    alert(search_input.val());
                    var search_key = search_input.val();
                    $.ajax({
                        url: 'search_for_course',
                        data: {"key": search_key},
                        method: 'POST',
                        success: function (result) {
                            if (search_key != "") {


                                console.log(result);
                                $('#se').html(result);
                            } else {
                                $('#se').html("<li><a href="#" ></a></li>");
                            }
                        },
                        error: function () {
                            alert('internal server error');
                        },
                    });
                });
            });
    </script>
</html>