<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  margin: var(--top-spacing) auto;
  max-width: 400px;
  padding: 100px 20px;
  font: 18px/1.4 system-ui;
}

</style>
</head>
<%@include file='header.html'%>
<body>
 <div align="center">
        <table border="1" cellpadding="5">
            <h2>List of Employee</h2>
            <tr>
              <th>Name</th>
               <th>Phone</th>
                <th>Email</th>
                <th>Gender</th>
                 <th>Status</th>
            </tr>
            <c:forEach var="emolyee" items="${listEmp}">
                <tr>
                    <td><c:out value="${emolyee.name}" /></td>
                    <td><c:out value="${emolyee.number}" /></td>
                    <td><c:out value="${emolyee.email}" /></td>
                    <td><c:out value="${emolyee.gender}" /></td>
                       <td><c:out value="${emolyee.status}" /></td>
                    <td>
                        <a href="/edit?id=<c:out value='${emolyee.status}' />">Edit</a>
                                         
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div> 
    <%@include file='footer.html'%>  
</body>
</html>