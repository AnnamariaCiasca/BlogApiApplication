package it.rdev.blog.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.rdev.blog.api.dao.ArticoloDAO;
import it.rdev.blog.api.dao.entity.Articolo;



@Service
public class ArticoloService {

	@Autowired
	private ArticoloDAO articoloDAO;
	
	@Transactional
	public void create(Articolo articolo) {		
		articoloDAO.saveAndFlush(articolo);
	}
	
	@Transactional
	public void update(Articolo articolo) {		
		articoloDAO.saveAndFlush(articolo);
	}
	
	@Transactional
	public void delete(Articolo id_articolo) {
		articoloDAO.delete(id_articolo);
	}
	
	public List<Articolo> find() {
		return articoloDAO.findAll();
	}
	

	
	public List<Articolo> findArticoloByCategoryId(Long id_categoria) {
		return articoloDAO.findArticoloByCategoryId(id_categoria);
	}
	
}
