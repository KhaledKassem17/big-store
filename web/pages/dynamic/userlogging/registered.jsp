<%@include file="/pages/header.jsp" %>
<!-- //navigation -->
<!-- breadcrumbs -->
<div class="breadcrumbs">
    <div class="container">
        <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
            <li><a href="/SoftwareProject/pages/dynamic/home/index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
            <li class="active">Register Page</li>
        </ol>
    </div>
</div>
<!-- //breadcrumbs -->
<!-- register -->
<!-- registration code here -->
<div class="register">
    <div class="container">
        <h2>Register Here</h2>
        <div class="login-form-grids">
            <h5>profile information</h5>
            <!-- registration form action redirects to saveUser Servlet -->
            <form action="http://localhost:8080/SoftwareProject/saveUser" method="post">
                <input type="text" name="username" placeholder="Username..." required="" /><br/>
                <input type="text" name="phone" placeholder="Phone Number..." required="" /><br/>
                <input type="password" name="password" placeholder="Password..." required="" /><br/>
                <input type="password" name="confirmedpassword" placeholder="Confirm Password" required="" /><br/>
                <input type="email" name="email" placeholder="E-Mail..."/><br/>

                User type : 
                <select name="type" id="usertype">
                    <option value="normal">Normal User</option>
                    <option value="company">Company User</option>
                </select>
                <br/><br/>

                <div id="changed"></div>

                <script>
                    var type = document.getElementById('usertype');
                    var change = document.getElementById('changed');

                    type.addEventListener('click', function (e) {
                        e.preventDefault(); // don't navigate to <a> tag href
                        if (type.value === "company") {
                            change.innerHTML = '<br/><input type="text" name="companywebsite" placeholder="Company Website..."/><br/><input type="text" name="address" placeholder="address..."/><br/>';
                        } else if (type.value === "normal") {
                            change.innerHTML = '<br/>Birthday : <input type = "date" name = "date"/><br/><br/><form>Gender : <input type="radio" name="gender" value="male" checked> Male  <input type="radio" name="gender" value="female"> Female</form>';
                        }
                    });
                </script>

                <input type="submit" value="Register">
            </form>
        </div>
        <div class="register-home">
            <a href="/SoftwareProject/pages/dynamic/home/index.jsp">Home</a>
        </div>
    </div>
</div>
<!-----------------------------------End Task of login------------------------------------------------>
<!-- //register -->

<%@include file="/pages/footer.jsp" %>
