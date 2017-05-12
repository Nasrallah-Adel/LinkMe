<%@page import="Control.UserCRUD"%>
<%@page import="model.user"%>
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
    <link rel="stylesheet" href="css/profile.css"/>
    <link rel="stylesheet" href="css/main.css">

    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css" media="all">
    <link href="css/owl.theme.css" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/cm-overlay.css" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Creative Resume Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- bootstrap-css -->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!--// bootstrap-css -->
    <!-- css -->
    <link rel="stylesheet" href="css/profile.css" type="text/css" media="all" />
    <!--// css -->
    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css" media="all">
    <link href="css/owl.theme.css" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/cm-overlay.css" />

    <!-- font -->
    <link href="//fonts.googleapis.com/css?family=Roboto+Slab:100,300,400,700" rel="stylesheet">
    <link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
    <!-- //font -->
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <!-- menu -->
    <link rel="stylesheet" href="css/main.css">
    <script type="text/javascript" src="js/main.js"></script>
    <!-- //menu -->
    <script>
        $(document).ready(function() {
            $("#owl-demo").owlCarousel({

                autoPlay: 3000, //Set AutoPlay to 3 seconds
                autoPlay:true,
                items : 3,
                itemsDesktop : [640,5],
                itemsDesktopSmall : [414,4]

            });

        });
    </script>

    <link rel="stylesheet" href="css/contact.css"/>




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
                            <li><a href="course.jsp">COURSES</a></li>
                            <li><a href="about.jsp">ABOUT</a></li>
                            <li><a href="events.jsp">EVENT</a></li>
                            <li><a href="contact_us.jsp">CONTACT</a></li>
                            <li><a href="Profile.jsp">Profile</a></li>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-user"></span>
                                <strong>Salman</strong>
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
                                                <p class="text-left"><strong>Salman Khan</strong></p>
                                                <p class="text-left small">crazytodevelop@@gmail.com</p>
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
                                <li><a href="#">logout<span class="glyphicon glyphicon-log-out" style="padding-left: 250px"></span></a></li>

                            </ul>
                        </li>
                    </ul>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->

    </nav>
    <!-- End Nav Section-->

</header>
<!-- start contact section-->
<section class="contact-us text-center">
    <div class="contact"id="contact" >
        <div class="container">
            <div class="row">
                <i class="fa fa-pencil-square-o fa-5x"></i>
                <h2>About Us</h2>
            </div>
            <div class="tem">
                <h4> web based application to enhance and improve your career by  some advice and feeds <br>like MOOCs , online exams , events ,and trace your progress
                    in your field .<br> You can learn about anything you need not just in your career
                </h4>
            </div>
        </div>
    </div>

    <!--start our team section-->
    <section class="our-team text-center" style="background: rgba(0, 0, 0, .3)">
        <div class="team">
            <div class="container">
                <h2 style="color:#ffffff">Meet Our Team</h2>
                <hr/>
                <div class="row">
                    <div class="col-lg-3 col-sm-6" >
                        <div class="person wow zoomInLeft" data-wow-duration="1s" data-wow-offset="300">
                            <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/hoda.jpg" alt="person"/>
                            <h4 style="color: #FFFFFF " >Hoda Ahmed</h4>
                            <p style="color: #FFFFFF">Web Designer</p>

                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6" >
                        <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                            <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/marwa.jpg" alt="person"/>
                            <h4 style="color: #FFFFFF">Marwa Amer</h4>
                            <p style="color: #FFFFFF">Web Developer</p>

                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6" >
                        <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                            <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/mohamed.jpg" alt="person"/>
                            <h4 style="color: #FFFFFF">Mohamed Fayez</h4>
                            <p style="color: #FFFFFF">Web Develop</p>

                        </div>
                    </div><div class="col-lg-3 col-sm-6" >
                    <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                        <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/mina.jpg" alt="person"/>
                        <h4 style="color: #FFFFFF">Mina George</h4>
                        <p style="color: #FFFFFF">Web Developer</p>

                    </div>
                </div><div class="col-lg-3 col-sm-6" >
                    <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                        <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/most.png" alt="person"/>
                        <h4 style="color: #FFFFFF">Mostafa Aboelnasr</h4>
                        <p style="color: #FFFFFF">Web Developer</p>

                    </div>
                </div><div class="col-lg-3 col-sm-6" >
                    <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                        <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/mahmoud.jpg" alt="person"/>
                        <h4 style="color: #FFFFFF">Mahmoud Abdelwahab</h4>
                        <p style="color: #FFFFFF">Web Developer</p>

                    </div>
                </div>
                    <div class="col-lg-3 col-sm-6" >
                        <div class="person wow zoomInDown" data-wow-duration="1s" data-wow-offset="300">
                            <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/mosfatael.jpg" alt="person"/>
                            <h4 style="color: #FFFFFF">Moustafa Ahmed</h4>
                            <p style="color: #FFFFFF">Database Admin</p>

                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6" >
                        <div class="person wow zoomInRight" data-wow-duration="1s" data-wow-offset="300">
                            <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/nasr.jpg" alt="person"/>
                            <h4 style="color: #FFFFFF">Nasrallah Adel</h4>
                            <p style="color: #FFFFFF">Web Developer</p>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--end our team section-->
</section>
<!-- end contact section-->
<!-- start scroll up-->
<div id="scroll">
    <i class="fa fa-chevron-up fa-2x"></i>
</div>
<!-- end scroll up-->
<!-- Start Footer Section-->
<footer>


</footer>
<!-- End Footer Section-->
<script src="js/jquery-3.2.0.min.js"></script>
<script src="js/jquery.nicescroll.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>