<%@include file="/pages/header.jsp" %>

<!-- //navigation -->
<!-- breadcrumbs -->
<div class="breadcrumbs">
    <div class="container">
        <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
            <li><a href="/SoftwareProject/pages/dynamic/home/index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
            <li class="active">Login Page</li>
        </ol>
    </div>
</div>
<!-- //breadcrumbs -->
<!-- login -->
<div class="login">
    <div class="container">
        <h2>Login Form</h2>
        <!-------------------------------Task 1 Login form ----------------------------------->
        <div class="login-form-grids animated wow slideInUp" data-wow-delay=".5s">
            <!-- login form action redirects to CheckLogin Servlet -->
            <form action="http://localhost:8080/SoftwareProject/CheckLogin" method="post">
                <input type="email" name="email" placeholder="E-Mail" required="" />
                <input type="password" name="password" placeholder="Password" required="" />
                <div class="forgot">
                    <a href="#">Forgot Password?</a>
                </div>
                <input type="submit" value="Login">
            </form>
        </div>
        <!---------------------------------------------------------------------------------------------->

        <h4>For New People</h4>
        <p><a href="/SoftwareProject/pages/dynamic/userlogging/registered.jsp">Register Here</a> (Or) go back to <a href="/SoftwareProject/pages/dynamic/home/index.jsp">Home<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></p>
    </div>
</div>
<!-- //login -->

<%@include file="/pages/footer.jsp" %>
