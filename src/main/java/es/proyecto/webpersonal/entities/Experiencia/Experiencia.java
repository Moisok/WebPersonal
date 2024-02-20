package es.proyecto.webpersonal.entities.Experiencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="experiencia")
public class Experiencia {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="puesto")
	private String puesto;
	
	@Column(name="localizacion")
	private String localizacion;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="activo")
	private int activo;

	public Experiencia(String fecha, String puesto, String localizacion, String descripcion, int activo) {
		this.fecha = fecha;
		this.puesto = puesto;
		this.localizacion = localizacion;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public Experiencia() {
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
