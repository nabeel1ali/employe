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
        <h3>LOGIN </h3>
        <div class="card">
            <div class="card-body">
                <div class="col-md-10">
                    <form:form action="/api/main/login"
                        method="post" modelAttribute="login">
                        <form:hidden path="id" />
<!--                         <div class="row"> -->    
                        <div class="form-group col-md-8">
                                <label for="deptName" class="col-form-label">EMAIL</label>
                                <form:input required="required" type="text" class="form-control" id="email"
                                    path="email" autocomplete="off" placeholder="Enter Email." />
                            </div>
                              <div class="form-group col-md-8">
                                <label for="password" class="col-form-label">PASSWORD</label>
                                <form:input type="password" class="form-control" id="password"
                                    path="password" autocomplete="off" placeholder="Enter Password." />
                             </div>
                            <div class="col-md-6" align="center">
                                <input type="submit" class="btn btn-primary" onclick="return confirm('Are you sure you want to Login with Given Credentials ?')" value=" Login ">
                            </div>                            
                            <p class="my-5">
                        		<a href="/api/employe/new" class="btn btn-primary">
                            		<i class="fas fa-user-plus ml-2">Registration</i>
                       			</a>
                   		 	</p>

			<!--    </div> -->      
              </form:form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>