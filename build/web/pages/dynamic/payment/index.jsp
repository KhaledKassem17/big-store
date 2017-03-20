<%@include file="/pages/header.jsp" %>
<html>
<head>
<title>Payment way </title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<link href="/SoftwareProject/resources/css/paymentcss/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="/SoftwareProject/resources/css/paymentcss/creditly.css" type="text/css" media="all" />
<link rel="stylesheet" href="/SoftwareProject/resources/css/paymentcss/easy-responsive-tabs.css">
<script src="/SoftwareProject/resources/js/paymentjs/jquery.min.js"></script>
<!-- font-awesome-icons -->
<link href="/SoftwareProject/resources/css/paymentcss/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
<link href="//fonts.googleapis.com/css?family=Mirza:400,500,600,700&amp;subset=arabic,latin-ext" rel="stylesheet">
</head>
<body>
	<div class="main">	
		<h1>Payment Form</h1>
		<div class="w3_agile_main_grids">
			<div class="w3layouts_main_grid_left">
				<div class="agileinfo_main_grid_left_grid">
					<h3>Payments in our system</h3>
					<ul>
						<li>WE start deal with VISA and paypal <span>2017 February 10, at 10:30 PM</span></li>
						<li>You can buy with it know</li>
					</ul>
					
					
			
				</div>
                <!-- in this div make the total price in the session and by it -->
				<div class="agile_amount">
					<h3>Total Price</h3>
					<h4>523.63 GBP</h4>
					<p>Price includes all taxes</p>
				</div>
			</div>
			<div class="agileits_main_grid_right">
				<div class="wthree_payment_grid">
					<h2>Payment Method</h2>
					<div id="horizontalTab">
						<ul class="resp-tabs-list">
							<li><img src="/SoftwareProject/resources/images/paymentimages/1.jpg" alt=" " /></li>
							<li><img src="/SoftwareProject/resources/images/paymentimages/2.jpg" alt=" " /></li>
						</ul>
						<div class="resp-tabs-container">
							<div class="agileits_w3layouts_tab1">
								<form action="#" method="post" class="creditly-card-form agileinfo_form">
									<section class="creditly-wrapper wthree, w3_agileits_wrapper">
										<div class="credit-card-wrapper">
											<div class="first-row form-group">
												<div class="controls">
													<label class="control-label">Name on Card</label>
													<input class="billing-address-name form-control" type="text" name="name" placeholder="Khaled Kassem">
												</div>
												<div class="w3_agileits_card_number_grids">
													<div class="w3_agileits_card_number_grid_left">
														<div class="controls">
															<label class="control-label">Card Number</label>
															<input class="number credit-card-number form-control" type="text" name="number" inputmode="numeric" autocomplete="cc-number" autocompletetype="cc-number" x-autocompletetype="cc-number" placeholder="&#149;&#149;&#149;&#149; &#149;&#149;&#149;&#149; &#149;&#149;&#149;&#149; &#149;&#149;&#149;&#149;" />
														</div>
													</div>
													<div class="w3_agileits_card_number_grid_right">
														<div class="controls">
															<label class="control-label">CVV</label>
															<input class="security-code form-control"Â·
																		  inputmode="numeric"
																		  type="text" name="security-code"
																		  placeholder="&#149;&#149;&#149;">
														</div>
													</div>
													<div class="clear"> </div>
												</div>
												<div class="controls">
													<label class="control-label">Expiration Date</label>
													<input class="expiration-month-and-year form-control" type="text" name="expiration-month-and-year" placeholder="MM / YY">
												</div>
											</div>
											<button class="submit"><span>Make a payment <i class="fa fa-long-arrow-right" aria-hidden="true"></i></span></button>
										</div>
									</section>
								</form>
							</div>
							<div class="agileits_w3layouts_tab2">
								<h3>Already have a paypal Account <a href="#">Login here</a></h3>
								<form action="#" method="post">
									<input type="email" name="Email" placeholder="Email" required="">
									<input type="password" name="Password" placeholder="Password" required="">
									<input type="submit" value="Login">
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"> </div>
		</div>
		<div class="agileits_copyright">
			<p>© 2017 Big Store . All rights reserved | Design by <a href="medic.esy.es">CS Team</a></p>
		</div>
	</div>
	<!-- credit-card -->
		<script type="text/javascript" src="/SoftwareProject/resources/js/paymentjs/creditly.js"></script>
		<script type="text/javascript">
			$(function() {
			  var creditly = Creditly.initialize(
				  '.creditly-wrapper .expiration-month-and-year',
				  '.creditly-wrapper .credit-card-number',
				  '.creditly-wrapper .security-code',
				  '.creditly-wrapper .card-type');

			  $(".creditly-card-form .submit").click(function(e) {
				e.preventDefault();
				var output = creditly.validate();
				if (output) {
				  // Your validated credit card output
				  console.log(output);
				}
			  });
			});
		</script>
	<!-- //credit-card -->
	<!-- tabs -->
	<script src="/SoftwareProject/resources/js/paymentjs/easy-responsive-tabs.js"></script>
	<script>
		$(document).ready(function () {
			$('#horizontalTab').easyResponsiveTabs({
				type: 'default', //Types: default, vertical, accordion           
				width: 'auto', //auto or any width like 600px
				fit: true,   // 100% fit in a container
				closed: 'accordion', // Start closed if in accordion view
				activate: function(event) { // Callback function if tab is switched
				var $tab = $(this);
				var $info = $('#tabInfo');
				var $name = $('span', $info);
				$name.text($tab.text());
				$info.show();
				}
			});
		});
	</script>
	<!-- //tabs -->

</body>
</html>

<%@include file="/pages/footer.jsp" %>