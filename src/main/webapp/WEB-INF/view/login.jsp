<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>LOGIN</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
	<div class="container my-5">
		<h3>LOGIN</h3>
		<div class="card">
			<div class="card-body">
				<div class="col-md-10">
					<form:form action="/api/user/login" method="post"
						modelAttribute="user">
						<form:hidden path="" />
						<div class="row">
							<div class="form-group col-md-8">
								<label for="userName" class="col-form-label">User Name</label>
								<form:input required="required" type="text" class="form-control" id="userName"
									path="userName" autocomplete="off"
									placeholder="Enter User Name" />
							</div>
							<div class="form-group col-md-8">
								<label for="password" class="col-form-label">Password </label>
								<form:input required="required" type="password" class="form-control" id="password"
									path="password" autocomplete="off"
									placeholder="Enter Password ." />
							</div>
							<div class="col-md-6">
								<input type="submit" class="btn btn-primary" value=" Login "
									id="loginButton">
							</div>
							<c:if test="${not empty errorMessage}">
								<script> alert("${errorMessage}")</script>
							</c:if>
							<p class="my-5">
								<a href="/api/user/new" class="btn btn-primary"> <i
									class="fas fa-user-plus ml-2">Registration</i>
								</a>
							</p>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>