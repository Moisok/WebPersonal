function cargarDatos() {
	    var selectedId = document.getElementById("estudioSelect").value;
	
	    var form = document.createElement("form");
	    form.setAttribute("method", "post");
	    form.setAttribute("action", "/webpersonal/adminzone/gestionarestudios");
		
		var inputIdEstudio = document.createElement("input");
	    inputIdEstudio.setAttribute("type", "hidden");
	    inputIdEstudio.setAttribute("name", "idEstudio");
	    inputIdEstudio.setAttribute("value", selectedId);
	    form.appendChild(inputIdEstudio);
	
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
	    document.getElementById("idTecnologia").value = "";
		setTimeout(function() {
	        location.reload();
	    }, 1000);
	}