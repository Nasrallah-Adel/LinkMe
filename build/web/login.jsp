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
                            <li class="active"><a href="index.jsp">Home</a></li>
                            \
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
            <!-- End Nav Section-->
        </header>
        <!-- Start form section-->
        <section class="form" id="logIn">

            <div class="container">
                <div class="form-container">
                    <h3 class="text-center">Log Into Your Account</h3>
                    <form method="post" action="login">
                        <div class="form-group">
                            <label for="email"><i class="fa fa-envelope" aria-hidden="true"></i>Email address</label>
                            <input type="email" name="email" class="form-control" id="email" placeholder="Enter Your Email">
                        </div>
                        <div class="form-group">
                            <label for="password"><i class="fa fa-key" aria-hidden="true"></i>Password</label>
                            <input type="password" name="password" class="form-control" id="password" placeholder="Enter Your Password">
                        </div>

                        <button type="submit" class="btn btn-info">Login</button>
                        <a href="signUp.jsp">You Do Not Have Account?</a>
                    </form>

                    <%   if (request.getSession().getAttribute("aut") == null) {
                            request.getSession().setAttribute("aut", "false");
                        } else if (!request.getSession().getAttribute("aut").equals("false")) {
                            response.sendRedirect("course.jsp");
                        }

                        if (request.getSession().getAttribute("message") == null) {
                            request.getSession().setAttribute("message", "");
                        } else {
                            String s = (String) request.getSession().getAttribute("message");
                            if (!s.equals("")) {
                                out.print("Message : " + s);
                                request.getSession().setAttribute("message", "");
                            }

                        }
                    %>
                </div>
            </div>
        </section>
        <!-- End form section-->


        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/custom.js"></script>
    </body>
</html>