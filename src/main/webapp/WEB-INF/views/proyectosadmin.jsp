<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <title>Administrar Proyectos</title>
 <meta charset="ISO-8859-1">
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/proyectosadmin.js"></script>
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
	<form method="post" action="/webpersonal/adminzone/gestionarproyectos">
	
    <input type="hidden" name="action" id="action" value="">
    <input type="hidden" name="idProyectoSeleccionado" id="idProyectoSeleccionado" value="">

    <select id="proyectoSelect" name="idProyecto" onchange="cargarDatos()">
    	<option value="" disabled selected>Selecciona Titulo</option>
		<c:forEach var="proyectosTemp" items="${proyectos}">
			<option value="${proyectosTemp.id}">${proyectosTemp.titulo}</option>
		</c:forEach>
    </select>
    <br><br>
    Datos obtenidos/insertados (el id no se modifica):
    <table border="1">
	    <% 
	        String idProyecto = request.getParameter("idProyecto");
	        if (idProyecto != null){
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input  type="text" name="idProyecto" id="idProyecto" value="${proyecto.id}" readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Titulo:</td>
	        <td>
	            <input type="text" name="nuevoTitulo" id="nuevoTitulo" value="${proyecto.titulo}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Fecha:</td>
	        <td>
	            <input type="text" name="nuevaFecha" id="nuevaFecha" value="${proyecto.fecha}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Foto:</td>
	        <td>
	            <input type="text" name="nuevaFoto" id="nuevaFoto" value="${proyecto.foto}"/>
	        </td>
	    </tr>
	    <tr>
	        <td>Descripcion:</td>
	        <td>
	            <textarea name="nuevaDescripcion" id="nuevaDescripcion">${proyecto.descripcion}</textarea>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Link de git:</td>
	        <td>
	            <input type="text" name="nuevoLink" id="nuevoLink" value="${proyecto.link}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>¿Activo?:</td>
	        <td>
	            <input type="text" name="nuevoActivo" id="nuevoActivo" type="text" value="${proyecto.activo}"/>
	        </td>
	    </tr>
	    <%
	        } else {
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input  type="text" name="idProyecto" id="idProyecto"  readonly/>
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
	        <td>Foto:</td>
	        <td>
	            <input type="text" name="nuevaFoto" id="nuevaFoto"/>
	        </td>
	    </tr>
	    <tr>
	        <td>Descripcion:</td>
	        <td>
	             <textarea name="nuevaDescripcion" id="nuevaDescripcion"/></textarea>
    		</td>
	        
	    </tr>
	    <tr>
	        <td>Link de git:</td>
	        <td>
	            <input type="text" name="nuevoLink" id="nuevoLink"/>
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