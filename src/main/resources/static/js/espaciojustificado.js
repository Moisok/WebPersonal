document.addEventListener('DOMContentLoaded', function() {
      // Obtener el campo de entrada específico por ID
      var inputNuevaDescripcion = document.getElementById('nuevaDescripcion');

      // Agregar un controlador de eventos para el campo de entrada específico
      inputNuevaDescripcion.addEventListener('keydown', function(event) {
        // Verificar si la tecla presionada es "Enter"
        if (event.key === 'Enter') {
		console.log("he presionado enter");
          event.preventDefault(); // Evitar el envío del formulario
          
          // Insertar un salto de línea en el texto del campo
          var cursorPos = inputNuevaDescripcion.selectionStart;
          var textBefore = inputNuevaDescripcion.value.substring(0, cursorPos);
          var textAfter = inputNuevaDescripcion.value.substring(cursorPos);

          inputNuevaDescripcion.value = textBefore + '\n' + textAfter;

          // Mover el cursor a la nueva línea
          inputNuevaDescripcion.setSelectionRange(cursorPos + 1, cursorPos + 1);
        }
      });
    });