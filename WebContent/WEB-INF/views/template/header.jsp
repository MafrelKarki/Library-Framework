<%-- Mafrel's code 3/19/2018--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<%@ taglib prefix="dc" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Library System</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel= "stylesheet" />
	
	
	<link href="webjars/font-awesome/4.7.0/css/font-awesome.min.css" rel= "stylesheet" />
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
	<link href="resources/css/app.css" rel="stylesheet" />
	<link rel="shortcut icon" type="image/x-icon" href="resources/images/a.png" />
	
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="./home">
			<img src="resources/images/a.png" alt="Donors Club Logo" height = 30px;>
			</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<form class="navbar-form navbar-left" method="get" action="./search">
				<div class="form-group">
					<input type="text" name="q" class="form-control" placeholder="Search Donated Post ...">
				</div>
				<button type="submit" class="btn btn-default" id="searchIcon"><i class="glyphicon glyphicon-search"></i></button>
			</form>
			<ul class="nav navbar-nav navbar-right">
			<c:choose>
			    <c:when test='${user!=null }'>
			       <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Hi, ${user.fname } <span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="#"> <i class="glyphicon glyphicon-gift"></i> Your Post (${user.itemList.size()})</a></li>
			            <li><a href="#"><i class="glyphicon glyphicon-heart"> </i> Your Interest (${user.interestList.size()})</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="./ChangePassword.do" ><i class="glyphicon glyphicon-edit"> Change&nbsp;Password </i></a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="./LogOutServlet.do" > <i class="glyphicon glyphicon-lock"> Logout</i></a></li>
			          </ul>
		          </li>
			    </c:when>    
			    <c:otherwise>
			    	<li><a href="${pageContext.request.contextPath}/login">Login</a></li>
			       	<li><a href="${pageContext.request.contextPath}/signup">Sign Up</a></li>
			    </c:otherwise>
			</c:choose>
			</ul>
		</div>
	</div>
	</nav>
	<br>
	<br>
	<br>
	<br>
	<br>