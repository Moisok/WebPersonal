package es.proyecto.webpersonal.dto;

public class HomeDTO {

	private int id;

	private String descripcion;

	private int activo;

	public HomeDTO(String descripcion, int activo) {
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public HomeDTO() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
}
