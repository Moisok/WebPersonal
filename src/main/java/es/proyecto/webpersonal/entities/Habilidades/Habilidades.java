package es.proyecto.webpersonal.entities.Habilidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="habilidades")
public class Habilidades {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="habilidad")
	private String habilidad;
	
	@Column(name="activo")
	private int activo;

	public Habilidades(String habilidad, int activo) {
		this.habilidad = habilidad;
		this.activo = activo;
	}

	public Habilidades() {
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
