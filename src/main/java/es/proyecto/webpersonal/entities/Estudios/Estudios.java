package es.proyecto.webpersonal.entities.Estudios;

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
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="localizacion")
	private String localizacion;
	
	@Column(name="centro")
	private String centro;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="activo")
	private int activo;

	public Estudios(String fecha, String titulo, String localizacion, String descripcion, String centro, int activo) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.localizacion = localizacion;
		this.descripcion = descripcion;
		this.activo = activo;
		this.centro = centro;
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
