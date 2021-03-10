package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="peliculas")//en caso que la tabla sea diferente
public class Peliculas  {
 
	//Atributos de entidad pelicula
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "calificacionedad")//no hace falta si se llama igual
	private int calificacionedad;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Salas> sala;
	
	//Constructores
	
	public Peliculas() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param sala
	 * @param calificacionedad
	 */

	public Peliculas(Long id, String nombre, int calificacionedad, List<Salas> sala) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;
		this.sala = sala;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacionedad() {
		return calificacionedad;
	}

	public void setCalificacionedad(int calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	/**
	 * @return the sala
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Salas> getSala() {
		return sala;
	}

	

	public void setSala(List<Salas> sala) {
		this.sala = sala;
	}



	//Metodo impresion de datos por consola

	
	
	
	
}
