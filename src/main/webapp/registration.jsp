<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>

<div class="container">
	<h2 class="mt-5 mb-5">Registration Page</h2>
	
	<form class="mb-4" action="registration" method="post">
		<div class="form-group mt-2">
			<label for="firstname" class="visually-hidden">Firstname</label>
			<input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter first name" />
		</div>
		
		<div class="form-group mt-2">
			<label for="lastname" class="visually-hidden">Lastname</label>
			<input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter last name" />
		</div>
		
		<div class="form-group mt-2">
			<label for="email" class="visually-hidden">Email</label>
			<input type="email" class="form-control" id="email" name="email" placeholder="Enter email" />
		</div>
		
		<div class="form-group mt-2">
			<label for="password" class="visually-hidden">Password</label>
			<input type="password" class="form-control" id="password" name="password" placeholder="Enter password"/>
		</div>
		
		<div class="form-group mt-2">
			<label for="cpassword" class="visually-hidden">Password</label>
			<input type="password" class="form-control" id="cpassword" name="cpassword" placeholder="Confirm password" />
		</div>
		
		<div class="form-group mt-2">
			<label for="city" class="visually-hidden"></label>
			<input type="text" class="form-control" id="city" name="city" placeholder="Enter City" />
		</div>
		
		<div class="form-group mt-2">
			<button class="btn btn-primary">Submit</button>
		</div>
	</form>
</div>

<footer>hadrihl &copy; 2024. Made with love in Penang.</footer>
</body>
</html>