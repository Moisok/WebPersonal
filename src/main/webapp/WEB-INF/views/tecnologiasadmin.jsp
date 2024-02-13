<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<h1>Esto es una prueba</h1>
		<tr>
			<th>Nombre</th>
			<th>¿Activo?</th>
		</tr>
		<c:forEach var="tecnologiaTemp" items="${tecnologia}">
			<tr>
				<td>${tecnologiaTemp.tecnologia}</td>
				<td>${tecnologiaTemp.activo}</td>
			</tr>		
		
		</c:forEach>
	</table>
</body>
</html>