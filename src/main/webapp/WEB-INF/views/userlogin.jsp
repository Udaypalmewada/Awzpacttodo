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
  padding: 100px 20px;
  font: 18px/1.4 system-ui;
}

</style>
</head>
<%@include file='header.html'%>
<body>

	<form:form  action="loginChek" modelAttribute="login">

		<div class="mainClass">
			<label class="lvl">Name</label> <br /> 
			<form:input path="name" class="bx" type="text" id="name"/><br /> 
			<label class="lvl">Pasword</label> <br />
			<form:input path="password" class="bx" type="password" id="pws"/> <br />
			<button id="btn1" style="align-items: center">Submit</button>
			
		</div>

	</form:form>
	<div class="break">

</div>
	<%@include file='footer.html'%>	
</body>
</html>