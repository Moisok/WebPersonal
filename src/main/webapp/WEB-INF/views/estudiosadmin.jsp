<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <title>Administrar Estudios</title>
 <meta charset="ISO-8859-1">
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/estudiosadmin.js"></script>
</head>
<body>
	<center>
	<form method="post" action="/webpersonal/adminzone/gestionarestudios">
	
    <input type="hidden" name="action" id="action" value="">
    <input type="hidden" name="idEstudioSeleccionado" id="idEstudioSeleccionado" value="">

    <select id="estudioSelect" name="idEstudio" onchange="cargarDatos()">
    	<option value="" disabled selected>Selecciona Titulo</option>
		<c:forEach var="estudiosTemp" items="${estudios}">
			<option value="${estudiosTemp.id}">${estudiosTemp.titulo}</option>
		</c:forEach>
    </select>
    <br><br>
    Datos obtenidos/insertados (el id no se modifica):
    <table border="1">
	    <% 
	        String idEstudio = request.getParameter("idEstudio");
	        if (idEstudio != null){
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input  type="text" name="idEstudio" id="idEstudio" value="${estudio.id}" readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Titulo:</td>
	        <td>
	            <input type="text" name="nuevoTitulo" id="nuevoTitulo" value="${estudio.titulo}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Fecha:</td>
	        <td>
	            <input type="text" name="nuevaFecha" id="nuevaFecha" value="${estudio.fecha}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Localizacion:</td>
	        <td>
	            <input type="text" name="nuevaLocalizacion" id="nuevaLocalizacion" value="${estudio.localizacion}"/>
	        </td>
	    </tr>
	    <tr>
	        <td>Descripcion:</td>
	        <td>
	            <input type="text" name="nuevaDescripcion" id="nuevaDescripcion" value="${estudio.descripcion}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Centro:</td>
	        <td>
	            <input type="text" name="nuevoCentro" id="nuevoCentro" value="${estudio.centro}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>¿Activo?:</td>
	        <td>
	            <input type="text" name="nuevoActivo" id="nuevoActivo" type="text" value="${estudio.activo}"/>
	        </td>
	    </tr>
	    <%
	        } else {
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input  type="text" name="idEstudio" id="idEstudio"  readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Titulo:</td>
	        <td>
	            <input type="text" name="nuevoTitulo" id="nuevoTitulo"/>
	        </td>
	    </tr>
	    <tr>
	        <td>Fecha:</td>
	        <td>
	            <input type="text" name="nuevaFecha" id="nuevaFecha"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Localizacion:</td>
	        <td>
	            <input type="text" name="nuevaLocalizacion" id="nuevaLocalizacion"/>
	        </td>
	    </tr>
	    <tr>
	        <td>Descripcion:</td>
	        <td>
	            <input type="text" name="nuevaDescripcion" id="nuevaDescripcion"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Centro:</td>
	        <td>
	            <input type="text" name="nuevoCentro" id="nuevoCentro"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>¿Activo?:</td>
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