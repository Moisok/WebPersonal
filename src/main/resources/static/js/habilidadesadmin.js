function cargarDatos() {
	    var selectedId = document.getElementById("habilidadSelect").value;
	
	    // Crear formulario y agregar campos
	    var form = document.createElement("form");
	    form.setAttribute("method", "post");
	    form.setAttribute("action", "/webpersonal/adminzone/gestionarhabilidades");
	
	    // Campo oculto para el ID de la tecnología
	    var inputIdHabilidad = document.createElement("input");
	    inputIdHabilidad.setAttribute("type", "hidden");
	    inputIdHabilidad.setAttribute("name", "idHabilidad");
	    inputIdHabilidad.setAttribute("value", selectedId);
	    form.appendChild(inputIdHabilidad);
	
	    // Verificar el botón clicado y agregar la acción correspondiente
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
	            inputAction.setAttribute("value", ""); // Puedes manejar este caso según tus necesidades
	            break;
	    }
	
	    form.appendChild(inputAction);
	
	    // Agregar formulario al cuerpo del documento
	    document.body.appendChild(form);
	
	    // Enviar el formulario
	    form.submit();
    
	}

	function setAction(action) {
        document.getElementById("action").value = action;
    }
	
	// Recargar la página después de un breve retraso (por ejemplo, 500 milisegundos)
	function reload(){
		// Limpiar los campos después de la modificación
	    document.getElementById("nuevoNombre").value = "";
	    document.getElementById("nuevoActivo").value = "";
	    document.getElementById("idHabilidad").value = "";
		setTimeout(function() {
	        location.reload();
	    }, 1000);
	}