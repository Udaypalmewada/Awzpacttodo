<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	margin: var(- -top-spacing) auto;
	max-width: 400px;
	padding: 100px 20px;
	font: 18px/1.4 system-ui;
}
input{
border-radius: 5px;
}
textarea{
width: 100px;
height: 30px;
}
div.mainClass{

padding: 80px 10px;
border-color: navy;
}
</style>
</head>
<%@include file='header.html'%>
<body>
<form:form action="registorUser" modelAttribute="register"
		method="post">
		<div class="mainClass">
			<label class="lvl">Name</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="name" class="bx" type="text" name="name" id="rname" />
			<br /> 
			<label class="lvl">Mo.Number</label>&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="number" class="bx" type="text" name="number"
				id="rnumber" />
			<br /> 
				 <label class="lvl">Email</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="email" class="bx" type="text" name="email"
				id="email" />
			<br />
			
			<label class="lvl">Gender</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			  <form:radiobutton path="gender" value="Male" />Male
              <form:radiobutton path="gender" value="Female"/>Female 
			<br />
			       <label class="lvl">Status</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			        <form:radiobutton path="status" value="true" />Enable
                    <form:radiobutton path="status" value="false"/>Disable
			<br />
               <form:label path = "city">City</form:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <form:select path = "city.id">
                     <c:forEach items="${cityList}" var="city">
                     <form:option value="${city.id}" label="${city.name}"/>
                     </c:forEach>
                  </form:select>     	
               <br/>
                <form:label path = "department">Department</form:label>&nbsp;&nbsp;
                <form:select path="department">
               
                    <c:forEach items="${departmentList}" var="dept">
                  <option label="${dept.key}" value="${dept.value}">${dept.key}</option>
                   </c:forEach>
               </form:select>
              <br/>
              
              <label class="lvl">Address</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:textarea path="address.address" class="bx" type="textArea" name="address" id="address" />
			<br />
            <button id="btn" type="submit">Submit</button>

		</div>
	</form:form>
	<div class="break"></div>
	<%@include file='footer.html'%>
</body>
</html>