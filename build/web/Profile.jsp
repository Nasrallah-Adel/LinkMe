<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>LinkMe </title>
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
        <!-- font-awesome icons -->
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <!-- //font-awesome icons -->
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
        <%

            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
            }

            if (request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("login.jsp");
            }

        %>
        <script>
            $(document).ready(function () {
                $("#owl-demo").owlCarousel({

                    autoPlay: 3000, //Set AutoPlay to 3 seconds
                    autoPlay: true,
                    items: 3,
                    itemsDesktop: [640, 5],
                    itemsDesktopSmall: [414, 4]

                });

            });
        </script>
    </head>
    <body>




        <header>

            <div class="overlay">
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
                            <a class="navbar-brand" href="#"><h3>LINK<span style="color: #01a39b" >ME</span></h3></a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">

                                <li><a href="course.jsp">COURSES</a></li>

                                <li><a href="events.jsp">EVENT</a></li>
                                <li><a href="contact_us.jsp">CONTACT ME</a></li>
                                <li><a href="about.jsp">ABOUT</a></li>
                                <li><a href="logout">LogOut</a></li>
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
                                            <li class="divider navbar-login-session-bg"></li>
                                            <li><a href="#">Account Settings <span class="glyphicon glyphicon-cog pull-right"></span></a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">User stats <span class="glyphicon glyphicon-stats pull-right"></span></a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Messages <span class="badge pull-right"> 42 </span></a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Favourites Snippets <span class="glyphicon glyphicon-heart pull-right"></span></a></li>
                                            <li class="divider"></li>
                                            <li><a href="#">Sign Out <span class="glyphicon glyphicon-log-out pull-right"></span></a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </ul>



                        </div>

                        <!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>
                <!-- End Nav Section-->
                <!-- End navigation bar -->

                <!-- banner -->
                <div class="banner" id="home">
                    <!-- menu -->


                    <div id="m_nav_container" class="m_nav">

                        <ul class="nav navbar-nav navbar-right">


                            <li><a href="course.jsp">courses</a></li>
                            <li><a href="events.jsp">Event</a></li>
                            <li><a href="#">about</a></li>
                            <li><a href="#">Contact</a></li>
                            <li><a href="logout">LogOut</a></li>
                        </ul>
                    </div>


                    <!-- menu -->
                    <div class="container">
                        <div class="w3l-banner-grids">
                            <div class="col-md-8 w3ls-banner-right">
                                <div class="clearfix"> </div>
                                <div class="w3-button">
                                    <div class="w3-button-info m_nav_item">
                                        <div class="container">
                                            <div class="wthree-about-grids">
                                                <div class="col-md-6 wthree-about-right" style="padding-top: 3px">
                                                    <h3 style="color: white">Skills</h3>
                                                    <div class="skills-bar">
                                                        <section class='bar'>
                                                            <section class='wrap'>
                                                                <div class='wrap_right'>
                                                                    <div class='bar_group'>
                                                                        <div class='bar_group__bar thin' label='Css' show_values='true' tooltip='true' value='235'><button class="takeexam" type="button">Exam</button></div>
                                                                        <div class='bar_group__bar thin' label='Photoshop' show_values='true' tooltip='true' value='675'><button class="takeexam1" type="button"> Exam</button></div>
                                                                        <div class='bar_group__bar thin' label='illustratior' show_values='true' tooltip='true' value='456'><button class="takeexam2" type="button"> Exam</button></div>
                                                                        <div class='bar_group__bar thin' label='Php' show_values='true' tooltip='true' value='245'><button class="takeexam3" type="button"> Exam</button></div>
                                                                    </div>
                                                                </div>
                                                                <div class='clear'></div>
                                                            </section>

                                                        </section>
                                                    </div>

                                                </div>
                                            </div >
                                            <div class="clearfix"> </div>
                                        </div>


                                        <div class="clearfix"> </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4 w3ls-banner-left" style="padding-top: 50px">
                            <h1 style="color: white">Personal Details</h1>
                            <div class="w3ls-banner-left-info">
                                <h4>Job Title</h4>
                                <p>Web Designer </p>
                            </div>
                            <div class="w3ls-banner-left-info">
                                <h4>Name</h4>
                                <p>Hoda Ahmed</p>
                            </div>
                            <div class="w3ls-banner-left-info">
                                <h4>Email Address</h4>
                                <p>Hodaammar1995@gmail.com</p>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>

                </div>
            </div>
            <!-- //banner -->



            <script src="js/bars.js"></script>
            <script src="js/owl.carousel.js"></script>
        </div>
    </header>
</body>	
</html>