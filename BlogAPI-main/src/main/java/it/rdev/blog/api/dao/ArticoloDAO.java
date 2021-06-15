package it.rdev.blog.api.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import it.rdev.blog.api.dao.entity.Articolo;


public interface ArticoloDAO extends JpaRepository<Articolo, Long> {
	

	
@Query("SELECT a.id_articolo, a.testo FROM articolo a INNER JOIN stato s on a.id_articolo = s.id_articolo WHERE s.stato_art = 'Bozza' ")
Articolo findByTitolo(String titolo);


@Query("Select a.testo from articolo a WHERE a.id_articolo= :valore")

Articolo findByIdArticolo(@Param("valore")Long id_articolo);


@Query("Select a.id_articolo, a.testo from articolo a WHERE a.titolo like :trova OR a.sottotitolo like :trova OR a.testo like :trova")
List<Articolo> findByContenuto(@Param("trova")String trova);
}

