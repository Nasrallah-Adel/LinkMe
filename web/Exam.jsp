<%@page import="Control.examcrud"%>
<%@page import="java.util.List"%>
<%@page import="model.exam"%>
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
        <link rel="stylesheet" href="css/registration.css"/>
        <link rel="stylesheet" href="css/Exam.css"/>
    </head>
    <%

        if (request.getSession().getAttribute("aut") == null) {
            request.getSession().setAttribute("aut", "false");
            response.sendRedirect("login.jsp");
        } else if (request.getSession().getAttribute("aut").equals("false")) {
            response.sendRedirect("login.jsp");
        }
        user u = new user();
        u = (user) request.getSession().getAttribute("user");
        request.getSession().setAttribute("user", u);
        u = UserCRUD.getOneUserData(u.getEmail());
        System.out.println(u.getCareer());
        request.getSession().setAttribute("user", u);
    %>
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

                            <li><a href="events.jsp">EVENT</a></li>
                            <li><a href="contact_us.jsp">CONTACT ME</a></li>
                            <li><a href="about.jsp">ABOUT</a></li>
                            <ul class="nav navbar-nav navbar-right">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                        <span class="glyphicon glyphicon-user"></span>
                                        <strong><% out.print(u.getUsername());%></strong>
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
                                                        <p class="text-left"><strong><% out.print(u.getUsername());%></strong></p>
                                                        <p class="text-left small"><% out.print(u.getEmail());%></p>
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
            <form action="exam" method="POST">
                <h2 style="padding-left:500px" ><b>Level <% out.print((Integer.valueOf(u.getLevel()) + 1));%> Quiz</b>  </h2> <br>
                <%

                    List<exam> co = examcrud.getexamData(u.getLevel(), u.getCareer());

                    int i = 0;
                    int j = 0;
                    for (exam elem : co) {


                %>
                <fieldset class="group-<% out.print((j)); %>">
                    <legend><% out.print((++i) + " - " + elem.getQuestion()); %></legend>
                    <ul class="checkbox">
                        <li><input name = "group-<% out.print((j)); %>"type="radio" id="cb1" value="a-<% out.print((elem.getExam_id())); %>" /><label for="cb1"><% out.print(elem.getA()); %></label></li>
                        <li><input name = "group-<% out.print((j)); %>" type="radio" id="cb2" value="b-<% out.print((elem.getExam_id())); %>" /><label for="cb2"><% out.print(elem.getB()); %></label></li>
                        <li><input name = "group-<% out.print((j)); %>" type="radio" id="cb3" value="c-<% out.print((elem.getExam_id())); %>" /><label for="cb3"><% out.print(elem.getC()); %></label></li>
                        <li><input name = "group-<% out.print((j++)); %>" type="radio" id="cb4" value="d-<% out.print((elem.getExam_id())); %>" /><label for="cb4"><% out.print(elem.getD()); %></label></li>
                    </ul>
                </fieldset>
                <%
                    }
                %>

                <div class="buttons">
                    <input type="submit" value="Submit"  class="upper" style="color: #0f1215" />


                </div>
            </form>
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