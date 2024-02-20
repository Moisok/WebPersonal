package es.proyecto.webpersonal.entities.Tecnologias;

public class TecnologiasDTO {

	private int id;
	
	private String tecnologia;

	private int activo;

	public TecnologiasDTO(String tecnologia, int activo) {
		this.tecnologia = tecnologia;
		this.activo = activo;
	}

	public TecnologiasDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
}
