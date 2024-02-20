package es.proyecto.webpersonal.entities.Estudios;

public class EstudiosDTO {
	
	private int id;

	private String fecha;

	private String titulo;
	
	private String localizacion;

	private String centro;

	private String descripcion;

	private int activo;

	public EstudiosDTO(String fecha, String titulo, String localizacion, String descripcion, String centro, int activo) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.localizacion = localizacion;
		this.descripcion = descripcion;
		this.activo = activo;
		this.centro = centro;
	}

	public EstudiosDTO() {
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

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
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

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}
	
}
