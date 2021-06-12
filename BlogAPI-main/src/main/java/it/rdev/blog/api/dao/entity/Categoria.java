package it.rdev.blog.api.dao.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "categoria")

public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Long id_categoria;
	
	@Column(name = "categorie")
	private String categorie;
	
	@OneToMany(mappedBy = "categorie")
	@JsonIgnore
	
	private Set<Articolo> articoli= new HashSet<>();
	
	
	public Long getIdCategoria() {
		return id_categoria;
	}
	
	public void setIdCategoria() {
		this.id_categoria=id_categoria;
	}
	
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie=categorie;
	}
}