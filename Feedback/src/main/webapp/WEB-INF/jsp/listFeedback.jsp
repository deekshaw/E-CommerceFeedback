<!-- Display User Feedbacks -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>

<head>
<title>Feedbacks for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<h1>E-commerce Application</h1>
	<div class="container">
		<table class="table table-striped">
			<caption>Feedback</caption>
			<thead>
				<tr>
					<th>Email</th>
					<th>Product Purchased</th>
					<th>Feedback</th>
					<th>Would you recommend it?</th>					
					
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${feedbacks}" var="feedback">
					<tr>
						<td>${feedback.uemail}</td> 					
						<td>${feedback.productPurchased}</td>
						<td>${feedback.feedback}</td>
						<td>${feedback.recommend}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-feedback?id=${feedback.id}" >Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-feedback?id=${feedback.id}" >Delete</a></td>
					</tr>
				</c:forEach> 
			</tbody>
		</table>
		<div>
			<a class="button" href="/feedback">Provide Feedback</a>
		</div>
	</div>
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>