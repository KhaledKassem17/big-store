<!DOCTYPE html>
<html>
    <head>
        <title>Big store</title>     
        <!-- for-mobile-apps -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- //for-mobile-apps -->
        <link href="/SoftwareProject/resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="/SoftwareProject/resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!-- font-awesome icons -->
        <link href="/SoftwareProject/resources/css/font-awesome.css" rel="stylesheet">
        <!-- //font-awesome icons -->
        <!-- js -->
        <script src="/SoftwareProject/resources/js/jquery-1.11.1.min.js"></script>
        <!-- //js -->
        <link href='//fonts.googleapis.com/css?family=Raleway:400,100,100italic,200,200italic,300,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="/SoftwareProject/resources/js/move-top.js"></script>
        <script type="text/javascript" src="/SoftwareProject/resources/js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!-- start-smoth-scrolling -->
    </head>

    <body>
        <!-- header -->
        <div class="agileits_header">
            <div class="container">
                <div class="w3l_offers">
                    <p>SALE UP TO 70% OFF. USE CODE "SALE70%" . <a href="/SoftwareProject/pages/dynamic/products/products.jsp">SHOP NOW</a></p>
                </div>
                <div class="agile-login">
                    <ul>
                        <!-- check if a user is logged in -->
                        <li><a href="/SoftwareProject/pages/dynamic/activities/questions/faq.jsp">FAQ</a></li>
                        <li><a href="/SoftwareProject/pages/static/about.jsp">About</a></li>
                        <%@include file="/pages/dynamic/jspfragments/userjsp/checkLoggedUser.jsp" %>

                    </ul>

                </div>
                <div class="product_list_header">
                    <form action="#" method="post" class="last">
                        <input type="hidden" name="cmd" value="_cart">
                        <input type="hidden" name="display" value="1">
                        <button class="w3view-cart" type="submit" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button>
                    </form>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>

        <div class="logo_products">
            <div class="container">
                <div class="w3ls_logo_products_left1">
                    <ul class="phone_email">
                        <img style="margin-top:0px"width="50px"height="50px" src="/SoftwareProject/resources/images/logo.png">
                        <li><i class="fa fa-phone" aria-hidden="true"></i><li style="font-family:cursive"><bold>Order online or call us :01116575392<bold></li>

                                </ul>
                                </div>

                                <div class="w3ls_logo_products_left">
                                    <h1><a href="/SoftwareProject/pages/dynamic/home/index.jsp">Big Store</a></h1>
                                </div>
                                <div class="w3l_search">
                                    <br/>
                                    <form action="#" method="post">
                                        <input type="search" name="Search" placeholder="Search for a Product..." required="">
                                        <button type="submit" class="btn btn-default search" aria-label="Left Align">
                                            <i class="fa fa-search" aria-hidden="true"> </i>
                                        </button>
                                        <div class="clearfix"></div>
                                    </form>
                                    <br/>
                                </div>

                                <div class="clearfix"> </div>
                                </div>
                                </div>
                                <!-- //header -->
                                <!-- navigation -->
                                <div class="navigation-agileits">
                                    <div class="container">
                                        <nav class="navbar navbar-default">
                                            <div class="navbar-header nav_2">
                                                <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
                                                    <span class="sr-only">Toggle navigation</span>
                                                    <span class="icon-bar"></span>
                                                    <span class="icon-bar"></span>
                                                    <span class="icon-bar"></span>
                                                </button>
                                            </div>
                                            <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                                                <ul class="nav navbar-nav">
                                                    <li class="active"><a href="/SoftwareProject/pages/dynamic/home/index.jsp" class="act">Home</a></li>
                                                    <li class="dropdown">
                                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Groceries<b class="caret"></b></a>
                                                        <ul class="dropdown-menu multi-column columns-3">
                                                            <div class="row">
                                                                <div class="multi-gd-img">
                                                                    <ul class="multi-column-dropdown">
                                                                        <h6>All Groceries</h6>
                                                                        <li><a href="/SoftwareProject/pages/dynamic/products/foods/groceries.jsp">spaghetti</a></li>
                                                                        <li><a href="/SoftwareProject/pages/dynamic/products/foods/groceries.jsp">flour</a></li>
                                                                        <li><a href="/SoftwareProject/pages/dynamic/products/foods/groceries.jsp">bread</a></li>
                                                                        <li><a href="/SoftwareProject/pages/dynamic/products/foods/groceries.jsp">toast or slice</a></li>
                                                                        <li><a href="/SoftwareProject/pages/dynamic/products/foods/groceries.jsp">Rice & Rice Products</a></li>
                                                                    </ul>
                                                                </div>

                                                            </div>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </div>
                                        </nav>
                                    </div>
                                </div>
