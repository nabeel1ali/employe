<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Update Department</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
    href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
    <div class="container my-5">
        <h3>Update Department</h3>
        <div class="card">
            <div class="card-body">
                <div class="col-md-10">
                    <form:form action="/api/department/update/"
                        method="post" modelAttribute="department">
                        <form:hidden path="id" />
                        <div class="row">
                           <div class="form-group col-md-8">
                                <label for="id" class="col-form-label">Department Id</label>
                                <form:input type="text" class="form-control" id="id"
                                    path="id" autocomplete="off" placeholder="Enter Department Id." />
                                <form:errors path="id" cssStyle="color: red" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="deptName" class="col-form-label">Department Name</label>
                                <form:input type="text" class="form-control" id="deptName"
                                    path="deptName" autocomplete="off" placeholder="Enter Department Name." />
                                <form:errors path="deptName" cssStyle="color: red" />
                            </div>
                            <div class="col-md-6">
                                <input type="submit" class="btn btn-primary" onclick="return confirm('Are you sure you want to Submit Department Data ?')" value=" Submit ">
                            </div>                            
                            <p class="my-5">
                        		<a href="/api/department/" class="btn btn-primary">
                            		<i class="fas fa-user-plus ml-2">Back to Department List</i>
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