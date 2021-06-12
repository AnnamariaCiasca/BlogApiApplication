package it.rdev.blog.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.rdev.blog.api.dao.entity.Articolo;
import it.rdev.blog.api.dao.entity.Categoria;


public interface CategoriaDAO extends JpaRepository<Articolo, Long> {
			
	

		 @Query("SELECT a.id_articolo, a.testo FROM articolo a INNER JOIN categoria c ON c.id_categoria = a.id_categoria WHERE c.id_categoria = c.id_categoria=?1" )
		 		List<Articolo> findArticoloByCategoryId(Long id_categoria);

}
