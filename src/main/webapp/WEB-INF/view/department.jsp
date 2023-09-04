<!DOCTYPE html><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>All Departments</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
	<div align = "center">
		<form action="/api/department/search" method="get">
			<label for="deptName">DeptName:</label>
			 <input type="text"id="firstName" name="deptName">
			<button type="submit">Search</button>
		</form>
	</div>
	<div class="container my-2">
		<div class="card">
			<div class="card-body">
				<div id="contenttext" align="center">
					<h3>Employee Management System</h3>
				</div>
				<div id="contenttext" align="center" class="container my-5">
					<div class="col-md-10">
						<div align="left">
							<h4>List Of Departments</h4>
						</div>
						<c:if test="${departments.size()==0}">
							<h2>No record found !!</h2>
						</c:if>
						<c:if test="${departments.size() gt 0 }">
							<div>
								<table class="table table-striped table-responsive-md">
									<thead>
										<tr>
											<!-- <th>ID</th> -->
											<th>ID</th>
											<th>DepartmentName</th>
											<th>Edit</th>
											<th>Delete</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="department" items="${departments}">
											<tr>
												<td>${department.id}</td>
												<td>${department.deptName}</td>

												<td><a href="/api/department/${department.id}"
													class="btn btn-primary"
													onclick="return confirm('Are you sure you want to Update Department?')">
														<i class="fas fa-user-edit ml-2"></i>
												</a></td>

												<td><a href="/api/department/delete/${department.id}"
													class="btn btn-primary"
													onclick="return confirm('Are you sure you want to Delete Department?')">
														<i class="fas fa-user-times ml-2"></i>
												</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</c:if>
					</div>
					<p class="my-5">
						<a href="/api/department/new" class="btn btn-primary"> <i
							class="fas fa-user-plus ml-2">Add Department </i>
						</a> <a href="/api/main/" class="btn btn-primary"> <i
							class="fas fa-user-plus ml-2">Back To MainMenu </i>
						</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>