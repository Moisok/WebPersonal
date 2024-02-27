<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <title>Administrar Descripcion Home</title>
 <meta charset="ISO-8859-1">
 <style>
    table {
      width: 100%; /* O el ancho deseado */
      border-collapse: collapse;
    }

    th, td {
      border: 1px solid black;
      padding: 10px; /* O el padding deseado */
      text-align: left;
    }
    #nuevaDescripcion {
	  height: 100px; /* O la altura deseada */
	  width: 800px; /* O el ancho deseado */
	}
  </style>
</head>
<body>
	<center>
	<form method="post" action="/webpersonal/adminzone/gestionarhome">
    <br><br>
    <table border="1">
	        <td>Descripcion:</td>
	        <td>
	            <textarea name="nuevaDescripcion" id="nuevaDescripcion">${descripcion.descripcion}</textarea>
	        </td>
	</table><br>
	<button type="submit">Modificar</button><br><br>
	</form>
	<button id="btnrecargar" onclick="reload()">Recargar</button>
	
	</center>
</body>
</html>