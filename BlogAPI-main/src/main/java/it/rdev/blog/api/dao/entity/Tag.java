package it.rdev.blog.api.dao.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "tag")

public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tag")
	private Long id_tag;
	
	@Column(name = "tag")
	private String tag;
	@ManyToMany (mappedBy = "tags", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	
	@JsonIgnore
	private Set<Articolo> articoli = new HashSet<>();
	
	
	public Long getIdTag() {
		return id_tag;
	}
	
	public void setIdTag() {
		this.id_tag=id_tag;
	}
	

	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag=tag;
	}
	
}