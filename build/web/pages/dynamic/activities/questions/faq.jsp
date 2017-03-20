<%@include file="/pages/header.jsp" %>

<!-- //navigation -->
<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="/SoftwareProject/pages/dynamic/home/index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">FAQ</li>
			</ol>
		</div>
	</div>
<!-- //breadcrumbs -->
<!-- help-page -->
	<div class="faq-w3agile">
		<div class="container">
            
                   <!-- ابدئوااااااااااااااااااامن هنا -------------------------------------------------------------------->
            
			<h2 class="w3_agile_header">Frequently asked questions(FAQ)</h2> 
			<ul class="faq">
				<li class="item1"><a href="#" title="click here">  How will I know when I have a sale?</a>
					<ul>
						<li class="subitem1"><p> We will e-mail you after Big Store Payments authorizes the buyer's payment method. You can see orders, obtain shipping information, and confirm shipments in Manage Orders in your Seller Account. Professional sellers can also download Order Reports to view sales.</p></li>										
					</ul>
				</li>
				<li class="item2"><a href="#" title="click here">How can buyers see all of my listings in one place?</a>
					<ul>
						<li class="subitem1"><p> Your Seller Profile page displays all of your seller listings and includes a listing search. Customers are directed to your profile when they click your seller name next to your listings.</p></li>										
					</ul>
				</li>
				<li class="item3"><a href="#" title="click here">Can I put my account on hold while I go on vacation?</a>
					<ul>
						<li class="subitem1"><p>Yes, you can do just that with the Listings Status feature.</p></li>										
					</ul>
				</li>
				<li class="item4"><a href="#" title="click here">What should I do if I can't find what I want to sell in the Big Store catalog?</a>
					<ul>
						<li class="subitem1"><p>If you want to sell an item but it does not currently exist in our retail catalog, you may be able to create a page for it using the Add a Product tool in your seller account. Once a page has been created for the product, you can list your copy of the item on it. Learn more. 

Please note there are restrictions on some products and categories, and we cannot guarantee that an item will be accepted into our catalog. Learn more about Category, Product, and Listing Restrictions.</p></li>										
					</ul>
				</li> 
				<li class="item5"><a href="#" title="click here">How do I decide if a Professional selling plan is right for me?</a>
					<ul>
						<li class="subitem1"><p>Our Professional selling plan is optional--you do not need a paid subscription to begin selling on our site. That said, the Professional selling plan has many benefits for frequent or volume sellers. Read more about the Professional selling plan, including details about how to sign up. For instructions on upgrading your current account, see Individual and Professional Selling Plans.</p></li>										
					</ul>
				</li>
							<li class="item6"><a href="#" title="click here">  How will I know when I have a sale?</a>
					<ul>
						<li class="subitem1"><p> We will e-mail you after Big Store Payments authorizes the buyer's payment method. You can see orders, obtain shipping information, and confirm shipments in Manage Orders in your Seller Account. Professional sellers can also download Order Reports to view sales.</p></li>										
					</ul>
				</li>
				<li class="item7"><a href="#" title="click here">How can buyers see all of my listings in one place?</a>
					<ul>
						<li class="subitem1"><p> Your Seller Profile page displays all of your seller listings and includes a listing search. Customers are directed to your profile when they click your seller name next to your listings.</p></li>										
					</ul>
				</li>
				<li class="item8"><a href="#" title="click here">Can I put my account on hold while I go on vacation?</a>
					<ul>
						<li class="subitem1"><p>Yes, you can do just that with the Listings Status feature.</p></li>										
					</ul>
				</li>
				<li class="item9"><a href="#" title="click here">What should I do if I can't find what I want to sell in the Big Store catalog?</a>
					<ul>
						<li class="subitem1"><p>If you want to sell an item but it does not currently exist in our retail catalog, you may be able to create a page for it using the Add a Product tool in your seller account. Once a page has been created for the product, you can list your copy of the item on it. Learn more. 

Please note there are restrictions on some products and categories, and we cannot guarantee that an item will be accepted into our catalog. Learn more about Category, Product, and Listing Restrictions.</p></li>										
					</ul>
				</li> 
				<li class="item10"><a href="#" title="click here">How do I decide if a Professional selling plan is right for me?</a>
					<ul>
						<li class="subitem1"><p>Our Professional selling plan is optional--you do not need a paid subscription to begin selling on our site. That said, the Professional selling plan has many benefits for frequent or volume sellers. Read more about the Professional selling plan, including details about how to sign up. For instructions on upgrading your current account, see Individual and Professional Selling Plans.</p></li>										
					</ul>
				</li>
			</ul> 
            <!-- الى هنا ---------------------------------------------------------------------------------.
			<!-- script for tabs -->
			<script type="text/javascript">
				$(function() {
				
					var menu_ul = $('.faq > li > ul'),
						   menu_a  = $('.faq > li > a');
					
					menu_ul.hide();
				
					menu_a.click(function(e) {
						e.preventDefault();
						if(!$(this).hasClass('active')) {
							menu_a.removeClass('active');
							menu_ul.filter(':visible').slideUp('normal');
							$(this).addClass('active').next().stop(true,true).slideDown('normal');
						} else {
							$(this).removeClass('active');
							$(this).next().stop(true,true).slideUp('normal');
						}
					});
				
				});
			</script>
			<!-- script for tabs -->   
		</div>
	</div>
<!-- //footer -->

<%@include file="/pages/footer.jsp" %>
