package es.proyecto.webpersonal.dto;

public class ProyectosDTO {
	
	private int id;
	
	private String fecha;

	private String titulo;

	private String descripcion;
	
	private String foto;

	private String link;

	private int activo;

	public ProyectosDTO(String fecha, String titulo, String descripcion, String foto, String link, int activo) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.foto = foto;
		this.link = link;
		this.activo = activo;
	}

	public ProyectosDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	
}
