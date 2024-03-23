package es.proyecto.webpersonal.dto;

public class TecnologiasDTO {
	
	private String action;
    private int id;
    private String tecnologia;
    private String activo; 

	public TecnologiasDTO(String tecnologia, String activo) {
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

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
