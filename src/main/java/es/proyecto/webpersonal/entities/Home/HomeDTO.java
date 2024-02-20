package es.proyecto.webpersonal.entities.Home;

public class HomeDTO {

	private int id;

	private String titulo;

	private String descripcion;

	private int activo;

	public HomeDTO(String titulo, String descripcion, int activo) {
		this.titulo = titulo;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
