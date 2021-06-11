package it.rdev.blog.api.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name = "tag")

public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tag")
	private Long id_tag;
	
	@Column(name = "tag")
	private String tag;
	
	
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