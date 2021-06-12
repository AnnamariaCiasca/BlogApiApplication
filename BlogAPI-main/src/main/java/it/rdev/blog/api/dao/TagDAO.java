package it.rdev.blog.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.rdev.blog.api.dao.entity.Articolo;
import it.rdev.blog.api.dao.entity.Tag;



public interface TagDAO extends JpaRepository<Articolo, Long> {
	
	@Query("SELECT a.id_articolo, a.testo FROM articolo a INNER JOIN tag t on a.id_tag = t.id_tag WHERE t.tag = 'Latino' ")
	Tag findArticoloByTag(String tag);
}
