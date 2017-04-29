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
        <link rel="stylesheet" href="css/style.css"/>
        <link type="text/css" rel="stylesheet" href="css/overlay.css" />

        <!--[if it IE 9]>
        <script src="js/html5shiv.min.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("aut") == null) {
                request.getSession().setAttribute("aut", "false");
            } else if (!request.getSession().getAttribute("aut").equals("false")) {
                response.sendRedirect("course.jsp");
            }
        %>
        <!-- start header -->
        <header class="header">
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
                            <a class="navbar-brand" href="#"><h3>LINK<span class="main-color">ME</span></h3></a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">
                                <!--
                                                                <li class="active" ><a href="#home">Home</a></li>
                                                                <li><a href="#about">About</a></li>
                                                                <li><a href="#project">Courses</a></li>
                                                                <li><a href="#news">Events</a></li>
                                                                <li class="last"><a href="#contact">Contact</a></li-->
                                <li><a href="index.html">Home</a></li>
                                <li><a href="#courses">Courses</a></li>
                                <li><a href="#about">ABOUT</a></li>
                                <li><a href="#event">EVENT</a></li>
                                <li><a href="#contact">CONTACT</a></li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>
                <!-- End Nav Section-->
                <!-- End navigation bar -->
                <div class="container">
                    <div class="row">
                        <div class="intro text-center" >
                            <h1 class="upper"> Now you can <span class="main-color"> Develop</span> yourself <span class="main-color"> ! </span> </h1>
                            <p> You can create your own profile and stay up for
                                the new tecnology courses and event on one place </p>

                            <div class="buttons">
                                <a href="signUp.jsp" class="upper"> Sign Up </a>
                                <a href="login.jsp" class="upper" > Log in </a>
                            </div>
                        </div>
                    </div>
                    <span class="arrow"><i class="fa fa-chevron-down" aria-hidden="true"></i></span>
                </div>
            </div>
        </header>
        <!-- end header -->
        <!-- start features -->
        <!-- Start New Courses Section-->
        <section class="newCourses text-center">
            <div class="container">
                <h2 class="upper">New Courses</h2>
                <hr>
                <div class="row">
                    <div class="col-md-4 col-sm-6">
                        <div class="course" id="courses">
                            <a href="#">
                                <img src="images/java.png" alt="course"/>
                                <span>Web Design</span>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="course">
                            <a href="#">
                                <img src="images/java.png" alt="course"/>
                                <span>Web Design</span>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="course">
                            <a href="#">
                                <img src="images/java.png" alt="course"/>
                                <span>Web Design</span>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="course">
                            <a href="#">
                                <img src="images/java.png" alt="course"/>
                                <span>Web Design</span>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="course">
                            <a href="#">
                                <img src="images/java.png" alt="course"/>
                                <span>Web Design</span>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="course">
                            <a href="#">
                                <img src="images/java.png" alt="course"/>
                                <span>Web Design</span>
                            </a>
                        </div>
                    </div>
                </div>
                <a href="course.jsp" class="btn btn-info allCourses">All Courses</a>
            </div>
        </section>
        <!-- End New Courses Section-->
        <!-- Start Testimonials Section-->
        <section class="testimonials">
            <div class="container" id="about">
                <h2>What People Say About us!</h2>
                <hr>
                <div class="row">
                    <div class=" col-md-6 testi">
                        <img src="images/person.jpg" alt="person">
                        <div class="info"  >
                            <p>“Nullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.”</p>
                            <h3>Chanel Iman</h3>
                            <span>Ceo Of Pinterest</span>
                        </div>
                    </div>
                    <div class="col-md-6 testi">
                        <img src="images/person.jpg" alt="person">
                        <div class="info">
                            <p>“Nullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.”</p>
                            <h3>Chanel Iman</h3>
                            <span>Ceo Of Pinterest</span>
                        </div>
                    </div>
                    <div class="col-md-6 testi">
                        <img src="images/person.jpg" alt="person">
                        <div class="info">
                            <p>“Nullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.”</p>
                            <h3>Chanel Iman</h3>
                            <span>Ceo Of Pinterest</span>
                        </div>
                    </div>
                    <div class="col-md-6 testi">
                        <img src="images/person.jpg" alt="person">
                        <div class="info">
                            <p>“Nullam dapibus blandit orci, viverra gravida dui lobortis eget. Maecenas fringilla urna eu nisl scelerisque.”</p>
                            <h3>Chanel Iman</h3>
                            <span>Ceo Of Pinterest</span>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End Testimonials Section-->
        <!-- Start New Events Section-->
        <section class="newEvents">
            <h2 class="upper text-center">What&rsquo;s New?</h2>
            <hr>
            <p class="text-center lead">Get the latest Events from our blog</p>
            <div class="container" id="event">
                <div class="row event">
                    <div class="col-md-6">
                        <img src="images/images.jpg" width="509" height="293" class="img-responsive picsGall"/>
                        <h3><a href="#">Lorem Ipsum Dolor sit Amet Pelenntesque Sodales!</a></h3>
                        <ul>
                            <li><i class="fa fa-calendar"></i>April 25, 2014</li>
                            <li><a href="#"><i class="fa fa-folder-open"></i>Staff</a></li>
                            <li><a href="#"><i class="fa fa-comments"></i>17 comments</a></li>
                        </ul>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit quisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. adipiscing vitae vel quam proin eget mauris eget. <a class="readMore" href="#">Read More <i class="fa fa-angle-right"></i></a></p>
                    </div>
                    <div class="col-md-6">
                        <img src="images/images.jpg" width="502" height="275" class="img-responsive picsGall"/>
                        <h3><a href="#">Nam in Nisl id Ipsum Feugiat Posuere ut sit Amet Sem</a></h3>
                        <ul>
                            <li><i class="fa fa-calendar"></i>April 25, 2014</li>
                            <li><a href="#"><i class="fa fa-folder-open"></i>Staff</a></li>
                            <li><a href="#"><i class="fa fa-comments"></i>17 comments</a></li>
                        </ul>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit quisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. adipiscing vitae vel quam proin eget mauris eget. <a class="readMore" href="#">Read More <i class="fa fa-angle-right"></i></a></p>
                    </div>
                </div>
                <a href="events.html"  class="btn btn-info allEvents">All Events</a>
            </div>
        </section>
        <!-- End New Events Section-->
        <!--start our team section-->
        <section class="our-team text-center">
            <div class="team">
                <div class="container">
                    <h2>Meet Our Team</h2>
                    <hr/>
                    <div class="row">
                        <div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInLeft" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Hoda Ahmed</h4>
                                <p>Web Designer</p>
                                <a class="facebook" href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a class="twitter" href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a class="linked" href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Marwa Amer</h4>
                                <p>Web Developer</p>
                                <a class="facebook" href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a class="twitter" href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a class="linked" href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Mohamed Fayez</h4>
                                <p>Web Develop</p>
                                <a class="facebook" href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a class="twitter" href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a class="linked" href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div><div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Mina George</h4>
                                <p>Web Developer</p>
                                <a class="facebook" href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a class="twitter" href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a class="linked" href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div><div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Mostafa Aboelnasr</h4>
                                <p>Web Developer</p>
                                <a class="facebook" href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a class="twitter" href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a class="linked" href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div><div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInUp" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Mahmoud Abdelwahab</h4>
                                <p>Web Developer</p>
                                <a class="facebook" href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a class="twitter" href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a class="linked" href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInDown" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Moustafa Ahmed</h4>
                                <p >Database Admin</p>
                                <a class="facebook" href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a class="twitter" href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a class="linked" href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6" >
                            <div class="person wow zoomInRight" data-wow-duration="1s" data-wow-offset="300">
                                <img class="img-responsive img-circle hvr-bubble-float-bottom img-thumbnail" src="images/person.jpg" alt="person"/>
                                <h4>Nasrallah Adel</h4>
                                <p >Web Developer</p>
                                <a href="#" class="facebook"><i class="fa fa-facebook-square fa-2x"></i></a>
                                <a href="#" class="twitter"><i class="fa fa-twitter-square fa-2x"></i></a>
                                <a href="#" class="linked"><i class="fa fa-linkedin-square fa-2x"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--end our team section-->
        <!-- start contact section-->
        <section class="contact-us text-center">
            <div class="contact"id="contact" >
                <div class="container">
                    <div class="row">
                        <i class="fa fa-headphones fa-5x"></i>
                        <h2>Contact Us</h2>
                        <form role="form">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input class="form-control input-lg" type="text" placeholder="User Name">
                                </div>
                                <div class="form-group">
                                    <input class="form-control input-lg" type="text" placeholder="Enter Your Email">
                                </div>
                                <div class="form-group">
                                    <input class="form-control input-lg" type="text" placeholder="Cell Phone">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <textarea class="form-control input-lg" placeholder="Enter Your Message"></textarea>
                                </div>
                                <button class="btn btn-info btn-lg btn-block bu-m">Contact Us</button>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
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