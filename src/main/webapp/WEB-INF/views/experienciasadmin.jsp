<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <title>Administrar Experiencias</title>
 <meta charset="ISO-8859-1">
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/experienciasadmin.js"></script>
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
	<form method="post" action="/webpersonal/adminzone/gestionarexperiencia">
	
    <input type="hidden" name="action" id="action" value="">
    <input type="hidden" name="idExperienciaSeleccionada" id="idExperienciaSeleccionada" value="">

    <select id="experienciaSelect" name="idExperiencia" onchange="cargarDatos()">
    	<option value="" disabled selected>Selecciona una experiencia</option>
		<c:forEach var="experienciasTemp" items="${expericias}">
			<option value="${experienciasTemp.id}">${experienciasTemp.puesto}</option>
		</c:forEach>
    </select>
    <br><br>
    Datos obtenidos/insertados (el id no se modifica):
    <table border="1">
	    <% 
	        String idExperiencia = request.getParameter("idExperiencia");
	        if (idExperiencia != null){
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input  type="text" name="idExperiencia" id="idExperiencia" value="${experiencia.id}" readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Puesto:</td>
	        <td>
	            <input type="text" name="nuevoPuesto" id="nuevoPuesto" value="${experiencia.puesto}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Fecha:</td>
	        <td>
	            <input type="text" name="nuevaFecha" id="nuevaFecha" value="${experiencia.fecha}"/>
	        </td>
	        
	    </tr>
	    <tr>
	        <td>Localizacion:</td>
	        <td>
	            <input type="text" name="nuevaLocalizacion" id="nuevaLocalizacion" value="${experiencia.localizacion}"/>
	        </td>
	    </tr>
	    <tr>
	        <td>Descripcion:</td>
	        <td>
	            <textarea name="nuevaDescripcion" id="nuevaDescripcion">${estudio.descripcion}</textarea>
    		</td>
	        
	    </tr>
	    <tr>
	        <td>�Activo?:</td>
	        <td>
	            <input type="text" name="nuevoActivo" id="nuevoActivo" type="text" value="${experiencia.activo}"/>
	        </td>
	    </tr>
	    <%
	        } else {
	    %>
	    <tr>
	        <td>Id:</td>
	        <td>
	            <input  type="text" name="idExperiencia" id="idExperiencia"  readonly/>
	        </td>
	    </tr>
	    <tr>
	        <td>Puesto:</td>
	        <td>
	            <input type="text" name="nuevoPuesto" id="nuevoPuesto"/>
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
	            <textarea type="text" name="nuevaDescripcion" id="nuevaDescripcion"/>
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