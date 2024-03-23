package es.proyecto.webpersonal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="home")
public class Home {
	
	@Id
	@Column(name="id")
	private int id;
	
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="activo")
	private int activo;

	public Home(String descripcion, int activo) {
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public Home() {}

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
