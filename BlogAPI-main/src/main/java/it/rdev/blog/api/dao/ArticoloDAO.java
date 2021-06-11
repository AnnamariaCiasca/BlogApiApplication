package it.rdev.blog.api.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.rdev.blog.api.dao.entity.Articolo;
import it.rdev.blog.api.dao.entity.Tag;
import it.rdev.blog.api.dao.entity.Stato;
import it.rdev.blog.api.dao.entity.User;

public interface ArticoloDAO extends JpaRepository<Articolo, Long> {
	
@Query
List<Articolo> findByAuthor(User autore);

@Query("SELECT a.id_articolo, a.testo FROM articolo a INNER JOIN categoria c ON c.id_categoria = a.id_categoria WHERE c.id_categoria = c.id_categoria=?1" )
		List<Articolo> findArticoloByCategoryId(Long id_categoria);
	
@Query("SELECT a.id_articolo, a.testo FROM articolo a INNER JOIN stato s on a.id_articolo = s.id_articolo WHERE s.stato_art = 'Bozza' ")
Stato findArticoloByStato(String stato_art);


@Query("SELECT a.id_articolo, a.testo FROM articolo a INNER JOIN tag t on a.id_tag = t.id_tag WHERE t.tag = 'Latino' ")
Tag findArticoloByTag(String tag);

}

