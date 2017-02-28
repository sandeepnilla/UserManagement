<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="userManagement">
<head>
<!-- For mobile view -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>User</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
<script src= "app.js"></script> 
<script src= "userdirective.js"></script> 
<!-- <script src= "jquery-3.1.1.js"></script> -->
<!--  <script src= "angular.js"></script>-->
<!-- <link rel="stylesheet" type="text/css" href="bootstrap.min.css"/> -->
</head>
<body>
  <header class="container">
  <div class="jumbotron">
      <h1 class="text-center">My First Angular Program</h1>
      <h2 class="text-center"> an User Management </h2>
  </div>
  </header>
    
    <div  ng-controller= "TabController as tab">
    	<section>
    		<ul class="nav nav-pills">
    			<li ng-class="{ active:tab.isSet(1) }">
    				<a href ng-click="tab.setTab(1)">Add User</a>
    			</li>
    			<li ng-class="{ active:tab.isSet(2) }">
    				<a href ng-click="tab.setTab(2)">Search User</a>
    			</li>
    		</ul>
    		<create-user></create-user>
    		<search-user></search-user>
    	</section>
    </div>
</body>
</html>