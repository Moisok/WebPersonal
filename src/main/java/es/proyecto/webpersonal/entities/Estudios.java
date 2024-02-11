package es.proyecto.webpersonal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudios")
public class Estudios {

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

	public Estudios(String fecha, String puesto, String localizacion, String descripcion, int activo) {
		this.fecha = fecha;
		this.puesto = puesto;
		this.localizacion = localizacion;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public Estudios() {
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
