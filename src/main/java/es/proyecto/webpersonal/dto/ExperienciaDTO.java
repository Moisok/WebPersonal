package es.proyecto.webpersonal.dto;

public class ExperienciaDTO {
	
	private int id;

	private String fecha;

	private String puesto;

	private String localizacion;

	private String descripcion;

	private int activo;

	public ExperienciaDTO(String fecha, String puesto, String localizacion, String descripcion, int activo) {
		this.fecha = fecha;
		this.puesto = puesto;
		this.localizacion = localizacion;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public ExperienciaDTO() {
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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
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
	
	
	
	
}
