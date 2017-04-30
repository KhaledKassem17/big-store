<%-- 
    Document   : settings
    Created on : Mar 25, 2017, 3:42:28 AM
    Author     : Saad
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="/SoftwareProject/resources/css/bootstrap-combined.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script type="text/javascript">
    window.alert = function () {};
    var defaultCSS = document.getElementById('bootstrap-css');
    function changeCSS(css) {
        if (css)
            $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="' + css + '" type="text/css" />');
        else
            $('head > link').filter(':first').replaceWith(defaultCSS);
    }
    $(document).ready(function () {
        var iframe_height = parseInt($('html').height());
        window.parent.postMessage(iframe_height, 'http://bootsnipp.com');
    });
</script>
<%@include file="/pages/header.jsp" %>
<%!
    public int user_id;
    public int flag = 0;

%>

<%
    NormalUser normal = null;
    Company company = null;
    if (session.getAttribute("company") != null) {
        company = (Company) session.getAttribute("company");
        user_id = company.getUser_id();
        System.out.println("company_id ==> "+user_id);
        flag = 1;
    }else{
        normal = (NormalUser) session.getAttribute("normal");
        user_id = normal.getUser_id();
        System.out.println("normal_id ==> "+user_id);
        flag = 0;
    }
%>

<div class="breadcrumbs">
    <div class="container">
        <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
            <li><a href="/SoftwareProject/pages/dynamic/home/index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
            <li class="active">Settings</li>
        </ol>
    </div>
</div>
<!-- //breadcrumbs -->
<!-- register -->
<!-- registration code here -->
<br/>
<div class="container">
    <div class="row">
        <div class="col-md-3">
            <div class="list-group" id="sidebar">
                <a href="#1" class="list-group-item" id="data">Personal Data</a>
                <a href="#2" class="list-group-item" id="interests">Interests</a>
                <a href="#3" class="list-group-item" id="products">Products</a>
            </div>
        </div>
        <div class="col-md-9" id="1" style="display:none;">
            <br/>
            <h3>Personal Data</h3>
            <br/>
            <p>All of the information for organizing data into projects, and groups.</p>
            <br/>
            <form action="http://localhost:8080/SoftwareProject/UpdateUser" method="post">
                <div class="control-group">

                    <div style="width:30%; float: left;" >
                        <label class="control-label" for="username" style="font-size: 25px;font-weight: 500;">Username</label><br/><br/><br/><br/>
                        <label class="control-label" for="phone" style="font-size: 25px;font-weight: 500;">Phone Number</label><br/><br/><br/>
                        <label class="control-label" for="email" style="font-size: 25px;font-weight: 500;">E-mail</label><br/><br/><br/><br/>
                        <label class="control-label" for="password" style="font-size: 25px;font-weight: 500;">Password</label><br/><br/><br/><br/>
                    </div>

                    <% if (flag == 0) {
                    %>
                    <div style="width:70%; float: right;" >
                        <input type="hidden" name="user_id" value="<%=user_id%>"/>

                        <div class="controls">
                            <input style="font-size: 15px;height: 30px" type="text" id="username" name="username" placeholder="" class="input-xlarge" value="<%=normal.getUser_name()%>">
                            <p class="help-block">Username can contain any letters or numbers, without spaces</p>
                        </div>
                        Phone 
                        <div class="controls">
                            <input style="font-size: 15px;height: 30px" type="text" id="phone" name="phone" placeholder="" class="input-xlarge" value="<%=normal.getUser_phone()%>">
                            <p class="help-block">Please provide your phone</p>
                        </div>
                        E-mail 
                        <div class="controls">
                            <input style="font-size: 15px;height: 30px" type="email" id="email" name="email" placeholder="" class="input-xlarge" value="<%=normal.getUser_email()%>">
                            <p class="help-block">Please provide your E-mail</p>
                        </div>
                        Password
                        <div class="controls">
                            <input style="font-size: 15px;height: 30px" type="password" id="password" name="password" placeholder="" class="input-xlarge" value="<%=normal.getUser_password()%>">
                            <p class="help-block">Password should be at least 4 characters</p>
                        </div>

                    </div>

                </div>

                <hr class="col-md-12">

                <br/><br/>
                <div> <br/> </div>
                <select name="type" id="usertype">
                    <option value="normal">Normal User</option>
                    <option value="company">Company User</option>
                </select>
                <br/><br/>

                <%
                } else if (flag == 1) {
                %>
                <div style="width:70%; float: right;" >
                    <div class="controls">
                        <input style="font-size: 15px;height: 30px" type="text" id="username" name="username" placeholder="" class="input-xlarge" value="<%=company.getUser_name()%>">
                        <p class="help-block">Username can contain any letters or numbers, without spaces</p>
                    </div>
                    Phone 
                    <div class="controls">
                        <input style="font-size: 15px;height: 30px" type="text" id="phone" name="phone" placeholder="" class="input-xlarge" value="<%=company.getUser_phone()%>">
                        <p class="help-block">Please provide your phone</p>
                    </div>
                    E-mail 
                    <div class="controls">
                        <input style="font-size: 15px;height: 30px" type="email" id="email" name="email" placeholder="" class="input-xlarge" value="<%=company.getUser_email()%>">
                        <p class="help-block">Please provide your E-mail</p>
                    </div>
                    Password
                    <div class="controls">
                        <input style="font-size: 15px;height: 30px" type="password" id="password" name="password" placeholder="" class="input-xlarge" value="<%=company.getUser_password()%>">
                        <p class="help-block">Password should be at least 4 characters</p>
                    </div>

                </div>

                <hr class="col-md-12">

                <br/><br/>
                <div> <br/> </div>
                <select name="type" id="usertype">
                    <option value="company">Company User</option>
                    <option value="normal">Normal User</option>
                </select>
                <br/>
                <%} else {
                    }%>

                <div id="changed"></div>

                <script>
                    var type = document.getElementById('usertype');
                    var change = document.getElementById('changed');

                    type.addEventListener('click', function (e) {
                        e.preventDefault(); // don't navigate to <a> tag href
                        if (type.value === "company") {
                            change.innerHTML = '<br/><input type="text" name="companywebsite" placeholder="Company Website..."/><br/><br/><input type="text" name="address" placeholder="address..."/><br/>';
                        } else if (type.value === "normal") {
                            change.innerHTML = '<br/>Birthday : <input style="font-weight: 500;height:30px" type = "date" name = "date"/><br/><br/><form>Gender : <input type="radio" name="gender" value="male" checked> Male  <input type="radio" name="gender" value="female"> Female</form>';
                        }
                    });
                </script>
                <br/>
                <input type="submit" value="Update Data"><br/>
            </form>
            <br/>
        </div>
        <div class="col-md-9" id="2" style="display:none;">
            <br/>
            <h3>Interests</h3>
            <br/>
            <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
                <%@include file="/pages/dynamic/jspfragments/productjsp/interestsproducts.jsp" %>
            </div>
            <br/>
        </div>
        <div class="col-md-9" id="3" style="display:none;">
            <br/>
            <h3>Products</h3>
            <br/>
            <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
                <%System.out.println(user_id);%>
                <jsp:include page="/pages/dynamic/jspfragments/productjsp/userproducts.jsp">
                    <jsp:param name="user_id" value="<%=user_id%>" />
                </jsp:include>
            </div>
            <br/>
        </div>
    </div>
</div>

<script>
    $('#data').on('click', function () {
        $('#1').show();
        $('#2').hide();
        $('#3').hide();
    });
</script>
<script>
    $('#interests').on('click', function () {
        $('#1').hide();
        $('#2').show();
        $('#3').hide();
    });
</script>
<script>
    $('#products').on('click', function () {
        $('#1').hide();
        $('#2').hide();
        $('#3').show();
    });
</script>

<%@include file="/pages/footer.jsp" %>