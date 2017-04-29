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
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="#">about</a></li>


                            <li><a href="#">Contact</a></li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
            <!-- End Nav Section-->
        </header>
        <!-- Start form section-->
        <section class="form">
            <div class="container">
                <div class="form-container">
                    <div class="alert alert-success hidden reg_success">
                        <h4>Done successfully!</h4>
                    </div>
                    <h3 class="text-center">Create Your New Account</h3>
                    <form method="doget" action="SignUp" >


                        <div class="row">
                            <div class="form-group col-md-6">
                                <label for="firstName"><i class="fa fa-user" aria-hidden="true"></i>First Name</label>
                                <input type="text" name="firstName" class="form-control" id="firstName" placeholder="Enter Your First Name" required>
                            </div>
                            <div class="form-group col-md-6">
                                <label for="lastName"><i class="fa fa-user" aria-hidden="true"></i>Last Name</label>
                                <input type="text" name="lastName" class="form-control" id="lastName" placeholder="Enter Your Last Name" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="userName"><i class="fa fa-user" aria-hidden="true"></i>User Name</label>
                            <input type="text" name="userNmae" class="form-control" id="userName" placeholder="Enter Your User Name" required>
                        </div>
                        <div class="form-group">
                            <label for="email"><i class="fa fa-envelope" aria-hidden="true"></i>Email address</label>
                            <input type="email" name="email" class="form-control" id="email" placeholder="Enter Your Email" required>
                        </div>
                        <div class="form-group">
                            <label for="password"><i class="fa fa-key" aria-hidden="true"></i>Password</label>
                            <input type="password" name="password" class="form-control" id="password" placeholder="Enter Your Password" required>
                        </div>
                        <div class="form-group">
                            <label for="passwordConfirm"><i class="fa fa-key" aria-hidden="true"></i>Confirm Password</label>
                            <input type="password" name="passwordConfirm" class="form-control" id="passwordConfirm" placeholder="Enter Your Confirm Password" required>
                        </div>
                        <div class="form-group">
                            <label ><i class= "fa fa-search-plus" aria-hidden="true"></i>Choose Your Career</label><br>
                            <input type="radio" name="Tracks" value="java programming">java programming<br>
                            <input type="radio" name="Tracks" value="Web Design">Web Design<br>

                        </div>

                        <button type="submit" class="btn btn-info submit-signup">Sign Up</button>
                        <a href="login.html">Already Have Account?</a>
                    </form>
                    <div class="alert alert-danger hidden">
                        <h4></h4>
                    </div>
                    <%
                        if (request.getSession().getAttribute("message") == null) {
                            request.getSession().setAttribute("message", "");
                        } else {
                            String s = (String) request.getSession().getAttribute("message");
                            if (!s.equals("")) {
                                out.print("Message : " + s);
                            }

                        }
                    %>
                </div>
            </div>
        </section>
        <!-- End form section-->
        <script src="js/jquery-3.2.0.min.js"></script>
        <!--   <script src="js/handleSignup.js"></script>-->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/custom.js"></script>
    </body>
</html>