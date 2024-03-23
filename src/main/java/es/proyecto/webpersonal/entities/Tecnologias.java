package es.proyecto.webpersonal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tecnologias")
public class Tecnologias {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="tecnologia")
	private String tecnologia;
	
	@Column(name="activo")
	private int activo;

	public Tecnologias(String tecnologia, int activo) {
		this.tecnologia = tecnologia;
		this.activo = activo;
	}

	public Tecnologias() {
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
