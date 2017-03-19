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

        <link href="/SoftwareProject/resources/css_user/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="/SoftwareProject/resources/css_user/style.css" rel='stylesheet' type='text/css' />

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
                        <li><a href="/SoftwareProject/pages/static/contact.jsp">Help</a></li>
                        <li><a href="/SoftwareProject/pages/dynamic/activities/questions/faq.jsp">FAQ</a></li>
                        <li><a href="/SoftwareProject/payment/index.html">Pay Now</a></li>
                        <li><a href="/SoftwareProject/pages/dynamic/products/cart/checkout.jsp">My Chart</a></li>
                        <li><a href="/SoftwareProject/pages/static/about.jsp">About</a></li>
                        <li class="dropdown menu__item menu__dropDown">
                                <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                    <i class="fa fa-cog fa-spin"></i>
                                </button>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">

                                <li><a style="color:black"href="/SoftwareProject/pages/dynamic/activities/questions/faq.jsp">Ask Question</a></li>

                                <li><a href="#" style="color:black">Login</a></li>
                                <li><a href="/SoftwareProject/pages/dynamic/userlogging/registered.jsp" style="color:black">Register</a></li>

                                <li><a style="color:black " href="/SoftwareProject/portfillio/profile.jsp">Profile</a></li>

                                <li role="separator" class="divider"></li>
                                <li><a style="color:black"href="#">Setting</a></li>
                                <li><a style="color:black"href="Logout">Logout</a></li>
                            </ul>
                        </li>

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
                        <li><i class="fa fa-phone" aria-hidden="true"></i><li style="font-family:cursive"> <bold>Order online or call us :01116575392<bold></li>

                                </ul>
                                </div>
                                <div class="w3ls_logo_products_left">
                                    <h1><a href="index.jsp">Big Store</a></h1>
                                </div>
                                <div class="w3l_search">
                                    <form action="#" method="post">
                                        <input type="search" name="Search" placeholder="Search for a Product..." required="">
                                        <button type="submit" class="btn btn-default search" aria-label="Left Align">
                                            <i class="fa fa-search" aria-hidden="true"> </i>
                                        </button>
                                        <div class="clearfix"></div>
                                    </form>
                                </div>

                                <div class="clearfix"> </div>
                                </div>
                                </div>
                                <!-- //header -->
                                <!-- navigation -->
                                <div class="navigation-agileits">
                                    <div class="container">
                                        <nav class="navbar navbar-default">
                                            <!-- Brand and toggle get grouped for better mobile display -->
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
                                                    <li class="active"><a href="index.jsp" class="act">Home</a></li>
                                                    <!-- Mega Menu -->
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

                                <!-- container -->
                                <!-- header -->
                                <div id="home" class="header">
                                    <div class="container">
                                        <!-- top-hedader -->
                                        <div class="top-header">
                                            <!-- /logo -->
                                            <!--top-nav---->
                                            <div class="top-nav">
                                                <div class="navigation">
                                                    <div class="logo">

                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <!-- /top-hedader -->
                                            </div>
                                            <div class="banner-info">
                                                <div class="col-md-7 header-right">
                                                    <h1>Hi !</h1>
                                                    <h6>Khaled Kassem </h6>
                                                    <ul class="address">


                                                        <li>
                                                            <ul class="address-text">
                                                                <li><b>NAME</b></li>
                                                                <li>Tanta </li>
                                                            </ul>
                                                        </li>
                                                        <li>
                                                            <ul class="address-text">
                                                                <li><b>address</b></li>
                                                                <li>Tanta </li>
                                                            </ul>
                                                        </li>
                                                        <li>
                                                            <ul class="address-text">
                                                                <li><b>PHONE </b></li>
                                                                <li>01116575392</li>
                                                            </ul>
                                                        </li>

                                                        <li>
                                                            <ul class="address-text">
                                                                <li><b>E-MAIL </b></li>
                                                                <li><a href="mailto:example@mail.com">khaled.kassem73@yahoo.com</a></li>
                                                            </ul>
                                                        </li>
                                                        <li>

                                                        </li>
                                                        <?php } ?>
                                                    </ul>
                                                </div>
                                                <div class="col-md-5 header-left">
                                                    <img style="border-radius:60%;border:9px solid aqua"src="/SoftwareProject/resources/images/img2.jpg">
                                                </div>
                                                <div class="clearfix"> </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- //footer -->
                                <div class="footer">
                                    <div class="container">
                                        <div class="w3_footer_grids">
                                            <div class="col-md-3 w3_footer_grid">
                                                <h3>Contact</h3>

                                                <ul class="address">
                                                    <li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>123 - north strret <span>Tanta</span></li>
                                                    <li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">big_store@gmail.com</a></li>
                                                    <li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>01116575392</li>
                                                </ul>
                                            </div>
                                            <div class="col-md-3 w3_footer_grid">
                                                <h3>Information</h3>
                                                <ul class="info">
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/static/about.jsp">About Us</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/static/contact.jsp">Contact Us</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/activities/questions/faq.jsp">FAQ's</a></li>

                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/products/products.jsp">Special Products</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-md-3 w3_footer_grid">
                                                <h3>Category</h3>
                                                <ul class="info">
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/products/foods/groceries.jsp">Groceries</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/products/household.jsp">Household</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/products/personalcare.jsp">Personal Care</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/products/foods/packagedfoods.jsp">Packaged Foods</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-md-3 w3_footer_grid">
                                                <h3>Profile</h3>
                                                <ul class="info">
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/products/products.jsp">Store</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/products/cart/checkout.jsp">My Cart</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/userlogging/login.jsp">Login</a></li>
                                                    <li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="/SoftwareProject/pages/dynamic/userlogging/registered.jsp">Create Account</a></li>
                                                </ul>
                                            </div>
                                            <div class="claearfix"> </div>
                                        </div>
                                    </div>

                                    <div class="footer-copy">

                                        <div class="container">
                                            <p>© 2017 Big Store. All rights reserved | Design by <a href="medic.esy.es/">CS Team</a></p>
                                        </div>
                                    </div>

                                </div>
                                <div class="footer-botm">
                                    <div class="container">
                                        <div class="w3layouts-foot">
                                            <ul>
                                                <li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                                <li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                                                <li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
                                                <li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="payment-w3ls">
                                            <img src="/SoftwareProject/resources/images/card.png" alt=" " class="img-responsive">
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>
                                </div>
                                <!-- //footer -->
                                <!-- Bootstrap Core JavaScript -->
                                <script src="/SoftwareProject/resources/js/bootstrap.min.js"></script>

                                <!-- top-header and slider -->
                                <!-- here stars scrolling icon -->
                                <script type="text/javascript">
                                    $(document).ready(function () {

                                        $().UItoTop({easingType: 'easeOutQuart'});

                                    });
                                </script>
                                <!-- //here ends scrolling icon -->
                                <script src="/SoftwareProject/resources/js/minicart.min.js"></script>
                                <script>
                                // Mini Cart
                                    paypal.minicart.render({
                                        action: '#'
                                    });

                                    if (~window.location.search.indexOf('reset=true')) {
                                        paypal.minicart.reset();
                                    }
                                </script>
                                <!-- main slider-banner -->
                                <script src="/SoftwareProject/resources/js/skdslider.min.js"></script>
                                <link href="/SoftwareProject/resources/css/skdslider.css" rel="stylesheet">
                                <script type="text/javascript">
                                    jQuery(document).ready(function () {
                                        jQuery('#demo1').skdslider({'delay': 5000, 'animationSpeed': 2000, 'showNextPrev': true, 'showPlayButton': true, 'autoSlide': true, 'animationType': 'fading'});

                                        jQuery('#responsive').change(function () {
                                            $('#responsive_wrapper').width(jQuery(this).val());
                                        });

                                    });
                                </script>
                                <!-- //main slider-banner -->
                                </body>
                                </html>
