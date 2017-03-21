<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="faqManager">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Faqs</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
<script src="faq.js"></script>
<title>Faq</title>
</head>
<body>

	<ul>
		<h4>Faqs</h4>

	</ul>


	<div ng-controller="FaqController as faqCtrl">
		<div ng-repeat="faqObj in faqCtrl.faqObjs">
			<strong>Question: {{faqObj.body}}</strong> <cite class="clearfix">-{{faqObj.author}}</cite>
		</div>

		<form name="faqForm" ng-controller="FaqAddition as faqAdd"
			ng-submit="faqAdd.addFaqDetail(faqCtrl)">


			<blockquote>
				<strong>Question:{{faqAdd.faqObj.body}} </strong> <cite
					class="clearfix">-{{faqAdd.faqObj.author}}</cite>
			</blockquote>

			<h4>Submit a Faq</h4>
			<fieldset class="form-group">
				<textarea ng-model="faqAdd.faqObj.body" class="form-control"
					placeholder="Write a faq here...." title="Faq"></textarea>
			</fieldset>
			<fieldset class="form-group">
				<input ng-model="faqAdd.faqObj.author" type="email"
					class="form-control" placeholder="jimmyDean@example.org"
					title="Email" />
			</fieldset>
			<fieldset class="form-group">
				<input type="submit" class="btn btn-primary pull-right"
					value="Submit Faq" />
			</fieldset>

		</form>
	</div>
</body>
</html>