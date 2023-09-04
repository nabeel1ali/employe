<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Update User</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
    href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
    <div class="container my-5">
        <h3>Update User</h3>
        <div class="card">
            <div class="card-body">
                <div class="col-md-10">
                    <form:form action="/api/user/update/"
                        method="post" modelAttribute="user">
                        <form:hidden path="id" />
                        <div class="row">
                         <div class="form-group col-md-8">
                                <label for="firstName" class="col-form-label">Id</label>
                                <form:input type="text" class="form-control" id="id"
                                    path="id" autocomplete="off" placeholder="Enter User Id." />
                                <form:errors path="id" cssStyle="color: red" />
                            </div>
                           <div class="form-group col-md-8">
                                <label for="firstName" class="col-form-label">First Name</label>
                                <form:input type="text" class="form-control" id="firstName"
                                    path="firstName" autocomplete="off" placeholder="Enter First Name." />
                                <form:errors path="firstName" cssStyle="color: red" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="lastName" class="col-form-label">Last Name</label>
                                <form:input type="text" class="form-control" id="lastName"
                                    path="lastName" autocomplete="off" placeholder="Enter Last Name." />
                               	<form:errors path="lastName" cssStyle="color: red" />
                            </div>
                              <div class="form-group col-md-8">
                                <label for="email" class="col-form-label">User Name</label>
                                <form:input type="text" class="form-control" id="userName"
                                    path="userName" autocomplete="off" placeholder="Enter User Name" />
                                <form:errors path="userName" cssStyle="color: red" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="email" class="col-form-label">EMAIL</label>
                                <form:input type="text" class="form-control" id="email"
                                    path="email" autocomplete="off" placeholder="Enter Email" />
                                <form:errors path="email" cssStyle="color: red" />
                            </div>
                            
                            <div class="form-group col-md-8">
                                <label for="password" class="col-form-label">Password</label>
                                <form:input type="password" class="form-control" id="password"
                                    path="password" autocomplete="off" placeholder=" Enter password " />
                                <form:errors path="password" cssStyle="color: red" />
                            </div>
                            
                            <div class="col-md-6">
                                <input type="submit" class="btn btn-primary" onclick="return confirm('Are you sure you want to Update User?')" value=" Update ">
                            </div>    
                             <c:if test="${not empty errorMessage}">
								<script> alert("${errorMessage}")</script>
							</c:if>                        
                            <p class="my-5">
                        		<a href="/api/user/" class="btn btn-primary">
                            		<i class="fas fa-user-plus ml-2">Back to User List</i>
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