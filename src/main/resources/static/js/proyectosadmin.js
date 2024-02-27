function cargarDatos() {
	    var selectedId = document.getElementById("proyectoSelect").value;
	
	    var form = document.createElement("form");
	    form.setAttribute("method", "post");
	    form.setAttribute("action", "/webpersonal/adminzone/gestionarproyectos");
		
		var inputIdProyecto = document.createElement("input");
	    inputIdProyecto.setAttribute("type", "hidden");
	    inputIdProyecto.setAttribute("name", "idProyecto");
	    inputIdProyecto.setAttribute("value", selectedId);
	    form.appendChild(inputIdProyecto);
	
		var clickedButton = document.activeElement.id;
	    var inputAction = document.createElement("input");
	    inputAction.setAttribute("type", "hidden");
	    inputAction.setAttribute("name", "action");
	
	    switch (clickedButton) {
	        case "btnAgregar":
	            inputAction.setAttribute("value", "agregar");
	            break;
	        case "btnModificar":
	            inputAction.setAttribute("value", "modificar");
	            break;
	        case "btnEliminar":
	            inputAction.setAttribute("value", "eliminar");
	            break;
	        case "btnDesactivar":
	            inputAction.setAttribute("value", "desactivar");
	            break;
	        default:
	            inputAction.setAttribute("value", ""); 
				break;
	    }
	
	    form.appendChild(inputAction);
	
	    document.body.appendChild(form);
	
	    form.submit();
    
	}

	function setAction(action) {
        document.getElementById("action").value = action;
    }
	
	function reload(){
		document.getElementById("idProyecto").value = "";
	    document.getElementById("nuevoTitulo").value = "";
	    document.getElementById("nuevaFecha").value = "";
	    document.getElementById("nuevaFoto").value = "";
	    document.getElementById("nuevaDescripcion").value = "";
	    document.getElementById("nuevoLink").value = "";
	    document.getElementById("nuevoActivo").value = "";
		setTimeout(function() {
	        location.reload();
	    }, 1000);
	}
	
