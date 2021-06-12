package it.rdev.blog.api.controller.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.sun.javadoc.Tag;

import it.rdev.blog.api.dao.entity.Categoria;
import it.rdev.blog.api.dao.entity.User;

public class ArticoloDTO {

	private String titolo;
	private String sottotitolo;
	private String testo;
	private Categoria id_categoria;
	private User autore;
	private Set<Tag> tags = new HashSet<>();
	private String stato;
	private LocalDate data_pubbl;
	private LocalDate data_modif;
	private LocalDate data_creaz;
	
	
	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getSottotitolo() {
		return sottotitolo;
	}

	public void setSottotitolo(String sottotitolo) {
		this.sottotitolo = sottotitolo;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public Categoria getCategoria() {
		return id_categoria;
	}
	
	public void setCategoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
	}

	public User getAutore() {
		return autore;
	}


	public void setAutore(User autore) {
		this.autore = autore;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public LocalDate getData_pubbl() {
		return data_pubbl;
	}

	public void setData_pubbl(LocalDate data_pubb) {
		this.data_pubbl = data_pubb;
	}

	public LocalDate getData_modif() {
		return data_modif;
	}

	public void setData_modifica(LocalDate data_modifica) {
		this.data_modif = data_modif;
	}

	public LocalDate getData_creaz() {
		return data_creaz;
	}
	
	public void setData_creaz(LocalDate data_creaz) {
		this.data_creaz = data_creaz;
	}
}
	
	
	
	

