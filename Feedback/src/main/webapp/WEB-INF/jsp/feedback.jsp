<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<title>Feedback Form</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>
	<div class="container">


		<form:form method="post" commandName="feedback">
			<form:hidden path="id" />
			<fieldset class="form-group">
				<form:label path="uemail">Email</form:label>
				<form:input path="uemail" type="text" class="form-control"
					required="required" />
				<form:errors path="uemail" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="productPurchased">Product Purchased</form:label>
				<form:input path="productPurchased" type="text" class="form-control"
					required="required" />
				<form:errors path="productPurchased" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="feedback">Feedback</form:label>
				<form:input path="feedback" type="text" class="form-control"
					required="required" />
				<form:errors path="feedback" cssClass="text-warning" />
			</fieldset>				
			
			<fieldset class="form-group">
				<form:label path="recommend">Recommend</form:label>
				<form:input path="recommend" type="text" class="form-control"
					required="required" />
				<form:errors path="recommend" cssClass="text-warning" />
			</fieldset>
			

			<button type="submit" class="btn btn-danger">Add</button>
		</form:form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	

</body>
</html>