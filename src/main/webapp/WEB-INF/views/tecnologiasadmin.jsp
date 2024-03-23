<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <title>Administrar tecnologias</title>
 <meta charset="ISO-8859-1">
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/tecnologiasadmin.js"></script>
</head>
<body>
	<center>
	
	<form method="post" action="/webpersonal/adminzone/gestionartecnologias">
	
    <input type="hidden" name="action" id="action" value="">
    <input type="hidden" name="idTecnologiaSeleccionada" id="idTecnologiaSeleccionada" value="">

    <select id="tecnologiaSelect" name="idTecnologia" onchange="cargarDatos()">
    	<option value="" disabled selected>Selecciona una tecnologia</option>
		<c:forEach var="tecnologiaTemp" items="${tecnologias}">
			<option value="${tecnologiaTemp.id}">${tecnologiaTemp.tecnologia}</option>
		</c:forEach>
    </select>
    <br><br>
    Datos obtenidos/insertados (el id no se modifica):
    <table border="1">
	    <% 
	        String idTecnologia = request.getParameter("idTecnologia");
	        if (idTecnologia != null){
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input type="text" name="idTecnologia" id="idTecnologia" value="${tecnologia.id}" readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Nombre:</td>
	        <td>
	            <input type="text" name="nuevoNombre" id="nuevoNombre" value="${tecnologia.tecnologia}"/>
	        </td>
	    </tr>
	    <tr>
	        <td>Activo?:</td>
	        <td>
	            <input type="text" name="nuevoActivo" id="nuevoActivo" type="text" value="${tecnologia.activo}"/>
	        </td>
	    </tr>
	    <%
	        } else {
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input type="text" name="idTecnologia" id="idTecnologia" readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Nombre:</td>
	        <td>
	            <input type="text" name="nuevoNombre" id="nuevoNombre"/>
	        </td>
	    </tr>
	    <tr>
	        <td>�Activo?:</td>
	        <td>
	            <input type="text" name="nuevoActivo" id="nuevoActivo"/>
	        </td>
	    </tr>
	    <%
	        }
	    %>
	</table><br>
    <button id="btnAgregar" onclick="setAction('agregar')">Agregar</button><br><br>
	<button id="btnModificar" onclick="setAction('modificar')">Modificar</button><br><br>
	<button id="btnEliminar" onclick="setAction('eliminar')">Eliminar</button><br><br>
	<button id="btnDesactivar" onclick="setAction('desactivar')">Desactivar</button><br><br>
	</form>
	<button id="btnrecargar" onclick="reload()">Recargar</button>
	
	</center>
</body>
</html>