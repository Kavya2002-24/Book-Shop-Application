<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Book Registration</h2>

<form action="update" method="post">
<table class="table table-hover" align="center">
 <tr>
<td>Book Name:</td>
<td><input type="text" name="bookName" value="<%=request.getParameter("BookName") %>"></td>
 </tr>
 
 <tr>
 <td>Book Edition:</td>
 <td><input type="text" name="bookEdition" value="<%=request.getParameter("BookEdition")%>"></td> 
 </tr>
 
 <tr>
 <td>Book Price:</td>
 <td><input type="text" name="bookPrice" value="<%=request.getParameter("BookPrice")%>"></td>
 </tr>
 
 <tr>
 <td><button>Update</button></td>
 <td><button>Cancel</button></td>
 </tr>
</table>
<br>
<a  href='home.html'>Home</a><br><br>
<a href='bookList'>Book List</a>
</body>
</html> 