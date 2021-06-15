package it.rdev.blog.api.dao.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "stato")

public class Stato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_stato")
	private Long id_stato;
	
	
	 @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "id_articolo", referencedColumnName = "id_articolo")
	    private Long id_articolo;
	
	
	@Column(name = "stato_art")
	private String stato_art;
	
	
	
	public Long getIdStato() {
		return id_articolo;
	}
	
	public void setIdStato() {
		this.id_stato=id_stato;
	}
	
	
	public Long getIdArticolo() {
		return id_articolo;
	}
	
	public void setIdArticolo() {
		this.id_articolo=id_articolo;
	}
	
	
	public String getStatoArt() {
		return stato_art;
	}
	
	public void setStatoArt(String stato_art) {
		this.stato_art=stato_art;
	}
	
}
