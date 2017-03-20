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
