package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.model.Libro;

//@Repository
public interface LibrosDao extends JpaRepository<Libro, Integer> {
	

}
