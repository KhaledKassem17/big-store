
<%@include file="/pages/header.jsp"%>
<!-- //navigation -->
<!-- main-slider -->

<ul id="demo1">
    <li>
        <img src="/SoftwareProject/resources/images/11.jpg" alt="" />
        <!--Slider Description example-->
        <div class="slide-desc">
            <h3>Buy Rice Products Are Now On Line With Us</h3>
        </div>
    </li>
    <li>
        <img src="/SoftwareProject/resources/images/22.jpg" alt="" />
        <div class="slide-desc">
            <h3>Whole Spices Products Are Now On Line With Us</h3>
        </div>
    </li>

    <li>
        <img src="/SoftwareProject/resources/images/44.jpg" alt="" />
        <div class="slide-desc">
            <h3>Whole Spices Products Are Now On Line With Us</h3>
        </div>
    </li>
</ul>
<!-- //main-slider -->
<!-- //top-header and slider -->
<!-- top-brands -->
<div class="top-brands">
    <div class="container">
        <h2>Top selling offers</h2>
        <div class="grid_3 grid_5">
            <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                <ul id="myTab" class="nav nav-tabs" role="tablist">
                    <li style="width: 100%" ><a href="#expeditions1">Recommended Products</a></li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    <div role="tabpanel" class="tab-pane fade in active" id="expeditions1" aria-labelledby="expeditions-tab">
                        <!-- load all recommended products in this section of home page -->
                        <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
                            <%@include file="/pages/dynamic/jspfragments/productjsp/recommendedproducts.jsp" %>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br/><br/>
        <div class="grid_3 grid_5">
            <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                <ul id="myTab" class="nav nav-tabs" role="tablist">
                    <li style="width: 100%" ><a href="#expeditions2">Latest Offers</a></li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    <div role="tabpanel" class="tab-pane fade in active" id="expeditions2" aria-labelledby="expeditions-tab">
                        <!-- load all latest products in this section of home page -->
                        <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
                            <%@include file="/pages/dynamic/jspfragments/productjsp/latestproducts.jsp" %>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br/><br/>
        <div class="grid_3 grid_5">
            <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                <ul id="myTab" class="nav nav-tabs" role="tablist">
                    <li style="width: 100%" ><a href="#expeditions3">Interests</a></li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    <div role="tabpanel" class="tab-pane fade in active" id="expeditions3" aria-labelledby="expeditions-tab">
                        <!-- load all interests products in this section of home page -->
                        <div class="agile_top_brands_grids" style="overflow:scroll;white-space: nowrap;height:450px;">
                            <%@include file="/pages/dynamic/jspfragments/productjsp/interestsproducts.jsp" %>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- //top-brands -->
<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <a href="/pages/dynamic/products/beverages.jsp"> <img class="first-slide" src="/SoftwareProject/resources/images/b1.jpg" alt="First slide"></a>

        </div>
        <div class="item">
            <a href="/pages/dynamic/products/personalcare.jsp"> <img class="second-slide " src="/SoftwareProject/resources/images/b3.jpg" alt="Second slide"></a>

        </div>
        <div class="item">
            <a href="/pages/dynamic/products/household.jsp"><img class="third-slide " src="/SoftwareProject/resources/images/b1.jpg" alt="Third slide"></a>

        </div>
    </div>

</div><!-- /.carousel -->
<!--banner-bottom-->
<div class="ban-bottom-w3l">
    <div class="container">
        <div class="col-md-6 ban-bottom3">
            <div class="ban-top">
                <img src="/SoftwareProject/resources/images/p2.jpg" class="img-responsive" alt=""/>

            </div>
            <div class="ban-img">
                <div class=" ban-bottom1">
                    <div class="ban-top">
                        <img src="/SoftwareProject/resources/images/p3.jpg" class="img-responsive" alt=""/>

                    </div>
                </div>
                <div class="ban-bottom2">
                    <div class="ban-top">
                        <img src="/SoftwareProject/resources/images/p4.jpg" class="img-responsive" alt=""/>

                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <div class="col-md-6 ban-bottom">
            <div class="ban-top">
                <img src="/SoftwareProject/resources/images/111.jpg" class="img-responsive" alt=""/>

            </div>
        </div>

        <div class="clearfix"></div>
    </div>
</div>
<!--banner-bottom-->
<!--brands-->
<!--//brands-->
<!-- new -->
<div class="newproducts-w3agile">
    <div class="container">
        <h3>Followed Companies</h3>
        <div class="agile_top_brands_grids">
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!-- //new -->
<%@include file="/pages/footer.jsp" %>
