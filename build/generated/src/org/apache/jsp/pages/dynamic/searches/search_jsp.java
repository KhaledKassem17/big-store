package org.apache.jsp.pages.dynamic.searches;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.software.team.BigStore.DBServlets.UserServlets.CheckLoggedUser;
import com.software.team.BigStore.model.NormalUser;
import com.software.team.BigStore.model.Company;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/pages/header.jsp");
    _jspx_dependants.add("/pages/dynamic/jspfragments/userjsp/checkLoggedUser.jsp");
    _jspx_dependants.add("/pages/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

//    String keyword = request.getParameter("keyword");

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Big store</title>     \r\n");
      out.write("        <!-- for-mobile-apps -->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <!-- //for-mobile-apps -->\r\n");
      out.write("        <link href=\"/SoftwareProject/resources/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href=\"/SoftwareProject/resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <!-- font-awesome icons -->\r\n");
      out.write("        <link href=\"/SoftwareProject/resources/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- //font-awesome icons -->\r\n");
      out.write("        <!-- js -->\r\n");
      out.write("        <script src=\"/SoftwareProject/resources/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <!-- //js -->\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Raleway:400,100,100italic,200,200italic,300,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!-- start-smoth-scrolling -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/SoftwareProject/resources/js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/SoftwareProject/resources/js/easing.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            jQuery(document).ready(function ($) {\r\n");
      out.write("                $(\".scroll\").click(function (event) {\r\n");
      out.write("                    event.preventDefault();\r\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- start-smoth-scrolling -->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <div class=\"agileits_header\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"w3l_offers\">\r\n");
      out.write("                    <p>SALE UP TO 70% OFF. USE CODE \"SALE70%\" . <a href=\"/SoftwareProject/pages/dynamic/products/products.jsp\">SHOP NOW</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"agile-login\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <!-- check if a user is logged in -->\r\n");
      out.write("                        <li><a href=\"/SoftwareProject/pages/dynamic/activities/questions/faq.jsp\">FAQ</a></li>\r\n");
      out.write("                        <li><a href=\"/SoftwareProject/pages/static/about.jsp\">About</a></li>\r\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    CheckLoggedUser clu = new CheckLoggedUser(out, request, response);


      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product_list_header\">\r\n");
      out.write("                    <form action=\"#\" method=\"post\" class=\"last\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"cmd\" value=\"_cart\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"display\" value=\"1\">\r\n");
      out.write("                        <button class=\"w3view-cart\" type=\"submit\" name=\"submit\" value=\"\"><i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"logo_products\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"w3ls_logo_products_left1\">\r\n");
      out.write("                    <ul class=\"phone_email\">\r\n");
      out.write("                        <img style=\"margin-top:0px\"width=\"50px\"height=\"50px\" src=\"/SoftwareProject/resources/images/logo.png\">\r\n");
      out.write("                        <li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i><li style=\"font-family:cursive\"><bold>Order online or call us :01116575392<bold></li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"w3ls_logo_products_left\">\r\n");
      out.write("                                    <h1><a href=\"/SoftwareProject/pages/dynamic/home/index.jsp\">Big Store</a></h1>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"w3l_search\">\r\n");
      out.write("                                    <br/>\r\n");
      out.write("                                    <form action=\"#\" method=\"post\">\r\n");
      out.write("                                        <input type=\"search\" name=\"Search\" placeholder=\"Search for a Product...\" required=\"\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-default search\" aria-label=\"Left Align\">\r\n");
      out.write("                                            <i class=\"fa fa-search\" aria-hidden=\"true\"> </i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <br/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- //header -->\r\n");
      out.write("                                <!-- navigation -->\r\n");
      out.write("                                <div class=\"navigation-agileits\">\r\n");
      out.write("                                    <div class=\"container\">\r\n");
      out.write("                                        <nav class=\"navbar navbar-default\">\r\n");
      out.write("                                            <div class=\"navbar-header nav_2\">\r\n");
      out.write("                                                <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\r\n");
      out.write("                                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\r\n");
      out.write("                                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                                    <li class=\"active\"><a href=\"/SoftwareProject/pages/dynamic/home/index.jsp\" class=\"act\">Home</a></li>\r\n");
      out.write("                                                    <li class=\"dropdown\">\r\n");
      out.write("                                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Groceries<b class=\"caret\"></b></a>\r\n");
      out.write("                                                        <ul class=\"dropdown-menu multi-column columns-3\">\r\n");
      out.write("                                                            <div class=\"row\">\r\n");
      out.write("                                                                <div class=\"multi-gd-img\">\r\n");
      out.write("                                                                    <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                                                        <h6>All Groceries</h6>\r\n");
      out.write("                                                                        <li><a href=\"/SoftwareProject/pages/dynamic/products/foods/groceries.jsp\">spaghetti</a></li>\r\n");
      out.write("                                                                        <li><a href=\"/SoftwareProject/pages/dynamic/products/foods/groceries.jsp\">flour</a></li>\r\n");
      out.write("                                                                        <li><a href=\"/SoftwareProject/pages/dynamic/products/foods/groceries.jsp\">bread</a></li>\r\n");
      out.write("                                                                        <li><a href=\"/SoftwareProject/pages/dynamic/products/foods/groceries.jsp\">toast or slice</a></li>\r\n");
      out.write("                                                                        <li><a href=\"/SoftwareProject/pages/dynamic/products/foods/groceries.jsp\">Rice & Rice Products</a></li>\r\n");
      out.write("                                                                    </ul>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </nav>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    /* Style the tab */\n");
      out.write("    div.tab {\n");
      out.write("        overflow: hidden;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        background-color: #f1f1f1;\n");
      out.write("        margin-left: 40px;\n");
      out.write("        margin-right: 50px;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Style the buttons inside the tab */\n");
      out.write("    div.tab button {\n");
      out.write("        background-color: inherit;\n");
      out.write("        float: left;\n");
      out.write("        border: none;\n");
      out.write("        outline: none;\n");
      out.write("        cursor: pointer;\n");
      out.write("        padding: 14px 16px;\n");
      out.write("        transition: 0.3s;\n");
      out.write("        font-size: 17px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Change background color of buttons on hover */\n");
      out.write("    div.tab button:hover {\n");
      out.write("        background-color: #ddd;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Create an active/current tablink class */\n");
      out.write("    div.tab button.active {\n");
      out.write("        background-color: #ccc;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Style the tab content */\n");
      out.write("    .tabcontent {\n");
      out.write("        display: none;\n");
      out.write("        padding: 6px 12px;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-top: none;\n");
      out.write("        margin-left: 40px;\n");
      out.write("        margin-right: 50px;\n");
      out.write("        height: 500px;\n");
      out.write("        background-color: #cecccc;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.search {\n");
      out.write("        overflow: hidden;\n");
      out.write("        width: 800px;\n");
      out.write("        height: 50px;\n");
      out.write("        padding-top: 20px;\n");
      out.write("\n");
      out.write("        margin-left:570px;\n");
      out.write("        margin-bottom: 30px;\n");
      out.write("        margin-top: 25px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<br/>\n");
      out.write("<div class=\"tab\">\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'companies')\">Companies</button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'normaluser')\">Normal users</button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'product')\">Product</button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'categories')\">Categories</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"companies\" class=\"tabcontent\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"normaluser\" class=\"tabcontent\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"product\" class=\"tabcontent\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"categories\" class=\"tabcontent\">\n");
      out.write("</div>\n");
      out.write("<br/><br/>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function openCity(evt, cityName) {\n");
      out.write("        var i, tabcontent, tablinks;\n");
      out.write("        tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("        for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("            tabcontent[i].style.display = \"none\";\n");
      out.write("        }\n");
      out.write("        tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("        for (i = 0; i < tablinks.length; i++) {\n");
      out.write("            tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("        }\n");
      out.write("        document.getElementById(cityName).style.display = \"block\";\n");
      out.write("        evt.currentTarget.className += \" active\";\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<!-- //footer -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"w3_footer_grids\">\r\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("                <h3>Contact</h3>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"address\">\r\n");
      out.write("                    <li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>123 - north strret <span>Tanta</span></li>\r\n");
      out.write("                    <li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">big_store@gmail.com</a></li>\r\n");
      out.write("                    <li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>01116575392</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("                <h3>Information</h3>\r\n");
      out.write("                <ul class=\"info\">\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/static/about.jsp\">About Us</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/static/contact.jsp\">Contact Us</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/activities/questions/faq.jsp\">FAQ's</a></li>\r\n");
      out.write("\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/products/products.jsp\">Special Products</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("                <h3>Category</h3>\r\n");
      out.write("                <ul class=\"info\">\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/products/foods/groceries.jsp\">Groceries</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/products/household.jsp\">Household</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/products/personalcare.jsp\">Personal Care</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/products/foods/packagedfoods.jsp\">Packaged Foods</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("                <h3>Profile</h3>\r\n");
      out.write("                <ul class=\"info\">\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/products/products.jsp\">Store</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/products/cart/checkout.jsp\">My Cart</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/userlogging/login.jsp\">Login</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i><a href=\"/SoftwareProject/pages/dynamic/userlogging/registered.jsp\">Create Account</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"claearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer-copy\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p>Â© 2017 Big Store. All rights reserved | Design by <a href=\"medic.esy.es/\">CS Team</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer-botm\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"w3layouts-foot\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"w3_agile_vimeo\"><i class=\"fa fa-vimeo\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"payment-w3ls\">\r\n");
      out.write("            <img src=\"/SoftwareProject/resources/images/card.png\" alt=\" \" class=\"img-responsive\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clearfix\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //footer -->\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"/SoftwareProject/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- top-header and slider -->\r\n");
      out.write("<!-- here stars scrolling icon -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("        $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- //here ends scrolling icon -->\r\n");
      out.write("<script src=\"/SoftwareProject/resources/js/minicart.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("// Mini Cart\r\n");
      out.write("    paypal.minicart.render({\r\n");
      out.write("        action: '#'\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    if (~window.location.search.indexOf('reset=true')) {\r\n");
      out.write("        paypal.minicart.reset();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<!-- main slider-banner -->\r\n");
      out.write("<script src=\"/SoftwareProject/resources/js/skdslider.min.js\"></script>\r\n");
      out.write("<link href=\"/SoftwareProject/resources/css/skdslider.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    jQuery(document).ready(function () {\r\n");
      out.write("        jQuery('#demo1').skdslider({'delay': 5000, 'animationSpeed': 2000, 'showNextPrev': true, 'showPlayButton': true, 'autoSlide': true, 'animationType': 'fading'});\r\n");
      out.write("\r\n");
      out.write("        jQuery('#responsive').change(function () {\r\n");
      out.write("            $('#responsive_wrapper').width(jQuery(this).val());\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- //main slider-banner -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
