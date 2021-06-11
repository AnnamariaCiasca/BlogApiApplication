package it.rdev.blog.api.dao.entity;


import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "articolo")

public class Articolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articolo")
	private Long id_articolo;
	
	@Column(name = "titolo")
	private String titolo;
	
	@Column(name = "sottotitolo")
	private String sottotitolo;
	
	@Column(name = "testo")
	private String testo;
	
	@ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false, updatable = true)
    private Categoria categoria;
	
	
	@Column(name = "data_pubbl")
	@Temporal(TemporalType.DATE)
    private Date data_pubbl;
	
	@Column(name = "data_modif")
	@Temporal(TemporalType.DATE)
    private Date data_modif;
	
	@Column(name = "data_creaz")
	@Temporal(TemporalType.DATE)
    private Date data_creaz;
	
	
	@ManyToOne
    @JoinColumn(name = "id_autore", nullable = false, updatable = true)
    private User autore;
	
	@ManyToOne
    @JoinColumn(name = "id_tag", nullable = false, updatable = true)
    private Tag tag;
	
	
	public Long getIdArticolo() {
		return id_articolo;
	}
	
	public void setIdArticolo() {
		this.id_articolo = id_articolo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo=titolo;
	}
	
	public String getSottotitolo() {
		return sottotitolo;
	}
	
	public void setSottotitolo(String sottotitolo) {
		this.sottotitolo=sottotitolo;
	}
	
	public String getTesto() {
		return testo;
	}
	
	public void setTesto(String testo) {
		this.testo=testo;
	}
	
	
	
	public Date getDataPubbl() {
		return data_pubbl;
	}
	
	public void setDataPubbl(Date data_pubbl) {
		this.data_pubbl = data_pubbl;
	}
	
	public Date getDataModif() {
		return data_modif;
	}
	
	public void setDataModif (Date data_modif) {
		this.data_modif = data_modif;
	}
	
	public Date getDataCreaz() {
		return data_creaz;
	}
	
	public void setDataCreaz (Date data_creaz) {
		this.data_creaz = data_creaz;
	}
	
	public User getAutore() {
		return autore;
	}
	
	public void setAutore(User autore) {
		this.autore=autore;
	}
	
	public Tag getTag() {
		return tag;
	}
	
	public void setTag(Tag tag) {
		this.tag=tag;
	}
	

}
