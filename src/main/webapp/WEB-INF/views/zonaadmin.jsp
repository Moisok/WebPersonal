<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administracion web personal</title>
</head>
<body>
	<a href="/pagina">Ir a Estudios</a><br>
	<a href="/pagina">Ir a Experiencia</a><br>
	<a href=<c:url value="/adminzone/gestionarhabilidades"/>>Ir a Habilidades</a><br>
	<a href="/pagina">Ir a Home</a><br>
	<a href="/pagina">Ir a Proyectos</a><br>
	<a href="<c:url value='/adminzone/gestionartecnologias'/>">Ir a Tecnologias</a><br><br>
</body>
</html>