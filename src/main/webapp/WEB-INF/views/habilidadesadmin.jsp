<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <title>Administrar tecnologias</title>
 <meta charset="ISO-8859-1">
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/habilidadesadmin.js"></script>
</head>
<body>
	<center>
	
	<form method="post" action="/webpersonal/adminzone/gestionarhabilidades">
	
    <input type="hidden" name="action" id="action" value="">
    <input type="hidden" name="idHabilidadSeleccionada" id="idHabilidadSeleccionada" value="">

    <select id="habilidadSelect" name="idHabilidad" onchange="cargarDatos()">
    	<option value="" disabled selected>Selecciona una habilidad</option>
		<c:forEach var="habilidadesTemp" items="${habilidades}">
			<option value="${habilidadesTemp.id}">${habilidadesTemp.habilidad}</option>
		</c:forEach>
    </select>
    <br><br>
    Datos obtenidos/insertados (el id no se modifica):
    <table border="1">
	    <% 
	        String idHabilidad = request.getParameter("idHabilidad");
	        if (idHabilidad != null){
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input input type="text" name="idHabilidad" id="idHabilidad" value="${habilidad.id}" readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Nombre:</td>
	        <td>
	            <input type="text" name="nuevoNombre" id="nuevoNombre" value="${habilidad.habilidad}"/>
	        </td>
	    </tr>
	    <tr>
	        <td>¿Activo?:</td>
	        <td>
	            <input type="text" name="nuevoActivo" id="nuevoActivo" type="text" value="${habilidad.activo}"/>
	        </td>
	    </tr>
	    <%
	        } else {
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input input type="text" name="idHabilidad" id="idHabilidad" type="text" readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Nombre:</td>
	        <td>
	            <input type="text" name="nuevoNombre" id="nuevoNombre" type="text"/>
	        </td>
	    </tr>
	    <tr>
	        <td>¿Activo?:</td>
	        <td>
	            <input type="text" name="nuevoActivo" id="nuevoActivo" type="text"/>
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