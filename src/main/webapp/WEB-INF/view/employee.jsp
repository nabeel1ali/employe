<!DOCTYPE html><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>All Employees</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet"href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
    <div class="container my-2">
     <div align="center">
						<form action="/api/employe/search" method="get">
							<label for=firstName>FirstName:</label>
							 <input type="text"
								id="firstName" name="firstName" >
							<label for=firstName>LastName:</label>
							 <input type="text"
								id="deptName" name="lastName" >
							<label for=deptName>DeptName:</label>
							 <input type="text"
								id="deptName" name="deptName" >
							<button type="submit">Search</button>
						</form>
					</div>
        <div class="card">
            <div class="card-body">
            	 <div id="contenttext" align="center">
       					 <h3> Employee Management System </h3>
 				 </div>
               		  <div id="contenttext" align="center" class="container my-5">
                   		  <div class="col-md-10">
                      		  <c:if test="${employees.size()==0}">
                           		 <h2>No record found !!</h2>
                      		  </c:if>
                       			 <c:if test="${employees.size() gt 0 }">
                          <div>
                              <table class="table table-striped table-responsive-md">
                                   <thead>
                                       <tr>
                                           <!-- <th>ID</th> -->
                                            <th>FirstName</th>
                                            <th>LastName</th>
                                            <th>Email</th>
                                            <th>Department</th>
                                            <th>Edit</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="employee" items="${employees}">
                                            <tr>
                                                <%-- <td>${employee.id}</td> --%>
                                                <td>${employee.firstName}</td>
                                                <td>${employee.lastName}</td>
                                                <td>${employee.email}</td>
                                                <td>${employee.department.deptName}</td>
                                                
                    							<td><a href="/api/employe/${employee.id}" class="btn btn-primary"
                    									 onclick="return confirm('Are you sure you want to Update Employee?')">
                    									<i class="fas fa-user-edit ml-1" >
                    									</i>
                    								</a>
                    							</td>
                                             
                   								<td><a href="/api/employe/delete/${employee.id}" class="btn btn-primary"
                   										 onclick="return confirm('Are you sure you want to Delete Employee?')">
                   										<i class="fas fa-user-times ml-1">
                   										</i>
                   									</a>
                   								</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </c:if>
                    </div>
                    	<p class="my-5">
                       		 <a href="/api/employe/new" class="btn btn-primary">
                            	<i class="fas fa-user-plus ml-2">Add Employee </i>
                         	 </a>
                         	  <a href="/api/main/" class="btn btn-primary">
                            	<i class="fas fa-user-plus ml-2">Back To MainMenu </i>
                         	 </a>
                    	</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>