

<%@page import="com.software.team.BigStore.model.Prouduct_like"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.SubCategory"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>

<!--Profile page-->
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Profile user</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="bootstrap-4.0.0-alpha.6-dist/css/bootstrap.min.css" rel="stylesheet">
        <style type="text/css">
            .page-header {background:#ccc;margin:0;}
            .profile-head { width:100%;background-color: rgb(250, 200, 100);float: left; position: relative;}
            .profile-head img { margin:0 auto; border-radius:5px; max-width: 100%; width: 100%;}
            .profile-head h5 {width: 100%;padding:5px 5px 0px 5px;text-align:justify;font-weight: bold;color: #555;font-size: 25px;text-transform:capitalize;
                              margin-bottom: 0;}
            .profile-head p {width: 100%;text-align: justify;padding:0px 5px 5px 5px;color: #555;font-size:17px;text-transform:capitalize;margin:0;}
            .profile-head a {width: 100%;text-align: center;padding: 10px 5px;color: #555;font-size: 15px;text-transform: capitalize;}
            .profile-head ul { list-style:none;padding: 0;}
            .profile-head ul li { display:block; color:#555;padding:5px;font-weight: 400;font-size: 15px;}
            .profile-head ul li:hover span { color:rgb(0, 4, 51);}
            .profile-head ul li span { color:#555;padding-right: 10px;}
            .profile-head ul li a { color:#555;}
            .profile-head h6 {width: 100%;text-align: center;font-weight: 100;color: #555;font-size: 15px;text-transform: uppercase;margin-bottom: 0;}
            .profiles{ top: 0px;}
            /*media query*/
            @media all and (max-width:768px){
                a.menu { display:block !important;margin: 9px 2px;float: right;color: rgba(255, 102, 0, 0.98); border:0px solid; background:none; font-size:30px;width:27px;position: relative;
                         cursor:pointer;}
                a.menu:hover, a.menu:focus { color:rgb(0, 4, 51);}
                .drop_menu1 { display: block;visibility: visible;width:250px;height:1000px;padding:5px 30px;position: absolute;right:0 !important;
                              background-color:#ffffff !important; transition:all ease 0.5s;border-top: 0px solid;cursor: pointer;}
            }
            @media all and (max-width:430px){
                .profile-head ul li {font-size: 12px !important;}
                .bio-table>tbody>tr>td {font-size: 13px;}
            }
            /*/..kksksks[sk[ss]]*/
            .productbox {
                background-color:#ffffff;
                padding:10px;
                margin:5px 0;
                border: 1px solid #cfcfcf;
                -moz-box-shadow: 2px 2px 4px 0px #cfcfcf;
                -webkit-box-shadow: 2px 2px 4px 0px #cfcfcf;
                -o-box-shadow: 2px 2px 4px 0px #cfcfcf;
                box-shadow: 2px 2px 4px 0px #cfcfcf;
                filter:progid:DXImageTransform.Microsoft.Shadow(color=#cfcfcf, Direction=134, Strength=4);
            }
            .producttitle {
                font-weight:bold;
                font-size:1.2em;
                padding:5px 0 5px 0;
            }
            .producttext {
            }
            .productprice {
                border-top:1px solid #dadada;
                padding-top:5px;
            }
            .pricetext {
                font-weight:bold;
                font-size:1.4em;
            }
            #user-bar{

                background-color: #FFF;
                padding:  15px 0;
            }


        </style>

        <script src="jq.js"></script>
        <script src="bootstrap-4.0.0-alpha.6-dist/js/bootstrap.min.js"></script>
        <script src="load_image.js"></script>

    </head>
    <body style="background-color: #FFF;">

        <!-- include  Header -->

        <%@include file="../../header.jsp" %>

        <% if (request.getParameter("user") != null) {

                String user_Iden = request.getParameter("user");
//                if (user_Iden.matches("//d")) {
                int id_of_visted = Integer.parseInt(user_Iden);
                request.setAttribute("visited_user", id_of_visted);
//                }
            }

        %>

        <!--  include  profile information     -->

        <%@include file="../jspfragments/profilejsp/user_details.jsp" %>

        <br/>
        <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
            <ul id="myTab" class="nav nav-tabs" role="tablist">
                <li><a style="float: left;width:50%;" href="profile.jsp">My Products</a>
                    <a style="float: right;width:50%;" href="?do=followers">
                        <%if (userId == 0) {%>
                            <%if (user.getUserType() == 0) {
                                out.print("Following");
                            } else if (user.getUserType() == 1) {
                                    out.print("Followers");
                                }%>
                        <%} else{%>
                        <%if (new UserController().getUser(userId).getUserType() == 0) {
                                out.print("Following");
                            } else if (new UserController().getUser(userId).getUserType() == 1) {
                                out.print("Followers");
                            }%>
                        <%}%>
                    </a>
                </li>
            </ul>
            <div id="myTabContent" class="tab-content">
                <div role="tabpanel" class="tab-pane fade in active" id="expeditions1" aria-labelledby="expeditions-tab">
                    <%if (request.getParameter("do") == null) {%>

                    <%if (userId == 0) {%>
                    <jsp:include page="/pages/dynamic/jspfragments/profilejsp/userproducts.jsp">
                        <jsp:param name="realuser" value="<%=user.getUser_id()%>" />
                    </jsp:include>
                    <% } else {%>
                    <jsp:include page="/pages/dynamic/jspfragments/profilejsp/userproducts.jsp">
                        <jsp:param name="visiteduser" value="<%=userId%>" />
                    </jsp:include>
                    <% }%>

                    <%} else if (request.getParameter("do").equals("add")) {%>

                    <%@include file="../jspfragments/profilejsp/product.jsp" %>

                    <%} else if (request.getParameter("do").equals("followers")) {
                    %>
                    <%@include file="../jspfragments/profilejsp/Followers.jsp"  %>
                    <%
                    } else if (request.getParameter("do").equals("following")) {
                    %>
                    <%@include file="../jspfragments/profilejsp/Followers.jsp"  %>
                    <%
                        }%>
                </div>
            </div>
        </div>
        <%@include file="../../footer.jsp" %>

        <script type="text/javascript">

        </script>
    </body>
</html>
