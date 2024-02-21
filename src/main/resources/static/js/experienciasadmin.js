function cargarDatos() {
	    var selectedId = document.getElementById("experienciaSelect").value;
	
	    var form = document.createElement("form");
	    form.setAttribute("method", "post");
	    form.setAttribute("action", "/webpersonal/adminzone/gestionarexperiencia");
	
	    var inputIdExperiencia = document.createElement("input");
	    inputIdExperiencia.setAttribute("type", "hidden");
	    inputIdExperiencia.setAttribute("name", "idExperiencia");
	    inputIdExperiencia.setAttribute("value", selectedId);
	    form.appendChild(inputIdExperiencia);
	
	   
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
	    document.getElementById("nuevoNombre").value = "";
	    document.getElementById("nuevoActivo").value = "";
	    document.getElementById("idExperiencia").value = "";
		document.getElementById("nuevoPuesto").value = "";
		document.getElementById("nuevaFecha").value = "";
		document.getElementById("nuevaLocalizacion").value = "";
		document.getElementById("nuevaDescripcion").value = "";	
		setTimeout(function() {
	        location.reload();
	    }, 1000);
	}