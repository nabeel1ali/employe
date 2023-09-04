<!DOCTYPE html><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Employee Management System </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet"href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
    <div class="container my-2">
        <div class="card">
            <div class="card-body">
            	 <div id="contenttext" align="center">
       					 <h3> WELCOME TO EMPLOYEE MANAGEMENT MAINMENU </h3>
 				 </div>
               		  <div id="contenttext" align="center" class="container my-5">
                   		  <div class="col-md-10">
                    </div>
                    <div>
                    	<p class="my-5">
                       		 <a href="/api/employe/" class="btn btn-primary">
                            	<i> Employees </i>
                         	 </a>
                    	</p>
                    </div>
                     <div>
                    	<p class="my-5">
                       		 <a href="/api/department/" class="btn btn-primary">
                            	<i> Departments </i>
                         	 </a>
                    	</p>
                    </div>
                     <div>
                    	<p class="my-5">
                       		 <a href="/api/user/signIn" class="btn btn-primary">
                            	<i> Login Form </i>
                         	 </a>
                    	</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>