package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Peliculas;

/**
 * @author Jose
 *
 */
public interface IPeliculasDAO extends JpaRepository<Peliculas, Long>{

}
