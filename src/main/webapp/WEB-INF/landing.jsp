<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="description" content="" />
    <meta name="keywords" content="" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    
	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<!-- CSS folder -->
	<link rel="stylesheet" href="css/main.css">
	<title>FINfluence</title>	
</head>

<body>
<nav class="navbar navbar-expand-lg d-flex navbar align-content-center justify-content-end">
    		<ul class="d-flex navbar-nav justify-content-end">
      			<li class="nav-item"><a class="nav-link" href="#">About</a></li>
      			<li class="nav-item"><a class="nav-link" href="#">Login</a></li>
      		</ul>
			<form class="form-inline my-2 my-lg-0">
      			<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
     		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    	</form>
	</nav>
<div id="main-wrapper" class="d-flex justify-content-between ml-3 mt-3">
	
	<div class="d-flex align-items-start flex-column">
		<div class="d-flex flex-column align-content-end">
			<h1 class="display-4" id="logo">FINfluence</h1>
		</div>	
		<hr class="line-break">
		<div class="d-flex flex-column">
			<h2 class="display-3" id="hero-header">Digital Asset Analytics<br> for Impact Strategy.</h2>
		</div>
		<div class="d-flex flex-column align-content-end">
			<ul>
				<li>Custom Value Dashboards</li>
				<li>Digital Asset Research</li>
				<li>Question & Answer</li>
				<li>Articles</li>
			</ul>
		</div>
	<!--  Close flex-col -->
	</div>

	<div class="d-flex flex-column mb-3">
		
		<div class="d-flex align-content-around justify-content-between">
			<div class="card mx-3 token-card">
  				<div class="card-header">Cardano</div>
 				<div class="card-body">
    				<h5 class="card-title">ADA Token</h5>
    				<p>Token Value: $${ adaPrice }</p>
    				<p>Market Cap: $${ prettyAdaMarketCap }</p>
					<p>24hr volume: $${ prettyAda24hVol }</p>
  				</div>
			</div>
			<div class="card mx-4 token-card">
  				<div class="card-header">Ethereum</div>
 				<div class="card-body">
    				<h5 class="card-title">ETH Token</h5>
    				<p>Token Value: $${ ethPrice }</p>
    				<p>Market Cap: $${ prettyEthMarketCap }</p>
					<p>24hr volume: $${ prettyEth24hVol }</p>
  				</div>
			</div>
		<!--  Close token row -->
		</div>
	<!-- Close flex column -->
	</div>
<!-- Close main wrapper -->
</div>
</body>
</html>

<!-- <p>Total Markets to buy Cryptocurrency from: ${ totalMarkets }<p><p>Total Active Cryptocurrencies: ${ totalActiveCryptoCurrencies }<p> -->


