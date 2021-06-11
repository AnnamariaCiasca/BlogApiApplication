package it.rdev.blog.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import it.rdev.blog.api.dao.entity.Articolo;
import it.rdev.blog.api.dao.entity.User;
import it.rdev.blog.api.service.ArticoloService;




@Controller
@RequestMapping("/resources/articolo")
public class ArticoloController {
	
	@Autowired
	private ArticoloService articoloService;
	

	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)	
	public void create(@RequestBody Articolo articolo) {
		
		articoloService.create(articolo);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Articolo articolo) {
		
		articoloService.update(articolo);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus( HttpStatus.OK )
	public void delete(@PathVariable("id_articolo") Articolo id_articolo) {
		
		articoloService.delete(id_articolo);
	}
	
	@RequestMapping(method = RequestMethod.GET)	
	public @ResponseBody List<Articolo> find() {
		
		return articoloService.find();
	}
	

	}
	


