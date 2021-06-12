package it.rdev.blog.api.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.rdev.blog.api.dao.entity.Articolo;


public interface ArticoloDAO extends JpaRepository<Articolo, Long> {
	

	
@Query("SELECT a.id_articolo, a.testo FROM articolo a INNER JOIN stato s on a.id_articolo = s.id_articolo WHERE s.stato_art = 'Bozza' ")
    
Articolo findByTitolo(String titolo);




}

