<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
 
<html>
<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Awzpact Technology</title>
<link rel="icon" type="image/jpeg" href="img//logo.jpeg">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<style type="text/css">
body {
  // ULTIMATELY this needs to go on <html>, not <body>. 
  scroll-padding-top: var(--top-spacing);
  
  margin: var(--top-spacing) auto;
  
  max-width: 400px;
  padding: 120px 20px;
  font: 18px/1.4 system-ui;
}
div.container_dashbord{
padding-top:120 px;
}
.list-group{
width: 200px;
padding-left: 20px;
}
.list-group-item{
text-decoration:none;
width: 200px;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<%@include file='header.html'%>
<body>
<div class="container_dashbord">
  <h2>Dashboard</h2>
  <ul class="list-group">
    <li class="list-group-item"><a href="registor">Employee Registration </a></li>
    <li class="list-group-item"><a href="employeelist">Employee List </a></li>
    <li class="list-group-item"><a href="logout">Logout<a></a></li>
  </ul>
</div>
	<%@include file='footer.html'%>	
</body>
</html>