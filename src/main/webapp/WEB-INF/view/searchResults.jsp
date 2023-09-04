<%-- <!DOCTYPE html><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>User Search Results</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>
</head>
<body>
		<div class="container my-2">
		<div class="card">
			<div class="card-body">
				<div id="contenttext" align="center">
					<h3>Employee Management System</h3>
				</div>
				<div id="contenttext" class="container my-5" align="center">
					<div id="contenttext" align="center" class="container my-5">
						<div class="col-md-10">
							<c:if test="${users.size()==0}">
								<h2>No record found !!</h2>
							</c:if>
							<c:if test="${users.size() gt 0 }">
								<div>
									<table class="table table-striped table-responsive-md">
										<thead>
											<tr>
												<!-- <th>ID</th> -->
												<th>FirstName</th>
												<th>LastName</th>
												<th>UserName</th>
												<th>Email</th>
												<th>Password</th>
												<th>Edit</th>
												<th>Delete</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="user" items="${users}">
												<tr>
													<td>${employee.id}</td>
													<td>${user.firstName}</td>
													<td>${user.lastName}</td>
													<td>${user.userName}</td>
													<td>${user.email}</td>
													<td>${user.password}</td>
													<td><a href="/api/user/${user.id}"
														class="btn btn-primary"
														onclick="return confirm('Are you sure you want to update user?')">
															<i class="fas fa-user-edit ml-1"> </i>
													</a></td>

													<td><a href="/api/user/delete/${user.id}"
														class="btn btn-primary"
														onclick="return confirm('Are you sure you want to Delete User?')">
															<i class="fas fa-user-times ml-1"> </i>
													</a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</c:if>
						</div>
						<!-- <p class="my-5">
							<a href="/api/user/new" class="btn btn-primary"> <i
								class="fas fa-user-plus ml-2">Add User </i><br>
							</a> <a href="/api/user/signIn" class="btn btn-primary"> <i
								class="fas fa-user-plus ml-2">Login Form </i>
							</a>
						</p> -->
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
 --%>