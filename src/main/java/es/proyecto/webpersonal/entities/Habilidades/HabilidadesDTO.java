package es.proyecto.webpersonal.entities.Habilidades;


public class HabilidadesDTO {

	private int id;
	
	private String habilidad;
	
	private int activo;

	public HabilidadesDTO(String habilidad, int activo) {
		this.habilidad = habilidad;
		this.activo = activo;
	}

	public HabilidadesDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
}
