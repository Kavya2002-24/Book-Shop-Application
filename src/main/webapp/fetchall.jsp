<%@page import="java.util.List"%>
<%@page import="BookWeb_Dto.Book_Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% List<Book_Dto> l=(List<Book_Dto>) request.getAttribute("obj");%>
</head>
<body class="bg-danger">
<h2 align="center">Book List</h2>
<form action="Update.jsp" method="post">
<table border="" align="center">
<tr style="color:blue">
<th>BookId</th>
<th>BookName</th>
<th>BookEdition</th>
<th>BookPrice</th>
<th>Delete</th>
<th>Edit</th>
</tr>

<% for(Book_Dto s:l)
	{
	%>
	<tr>
	<td><%=s.getBookId()%></td>
	<td><%=s.getBookName()%></td>
	<td><%=s.getBookEdition()%></td>
	<td><%=s.getBookPrice()%></td>
    <td><button><a  href="did?id=<%=s.getBookId()%>">delete</a></button></td>
    <td><button><a href="Update.jsp?BookId=<%=s.getBookId() %>&&BookName=<%=s.getBookName()%>&&BookEdition=<%=s.getBookEdition()%>&&BookPrice=<%=s.getBookPrice()%>">Edit</a></button>
    
   </tr>
    <% } %>
    </table>
    </form>
    
    <a href='home.html'>Home</a>
</body>
</html>