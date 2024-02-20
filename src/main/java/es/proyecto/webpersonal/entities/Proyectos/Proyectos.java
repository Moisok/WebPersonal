package es.proyecto.webpersonal.entities.Proyectos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proyectos")
public class Proyectos {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="link")
	private String link;
	
	@Column(name="activo")
	private int activo;

	public Proyectos(String fecha, String titulo, String descripcion, String foto, String link, int activo) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.foto = foto;
		this.link = link;
		this.activo = activo;
	}

	public Proyectos() {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	
}
