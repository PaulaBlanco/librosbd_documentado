package com.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibrosDao;
import com.curso.model.Libro;

@Service
public class LibroServiceImp implements LibroService {
	@Autowired private LibrosDao dao;

	@Override
	public List<Libro> libros() {
		return dao.findAll();
	}
/*
	@Override
	public Libro buscarLibro(int isbn) {
		return dao.findById(isbn).orElse(new Libro());
	}
*/
	@Override
	public Optional<Libro> buscarLibro(int isbn) {
		return dao.findById(isbn);
	}

	@Override
	public void altaLibro(Libro libro) {
		dao.save(libro);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		dao.save(libro);
		
	}

	@Override
	public void eliminar(int isbn) {
		dao.deleteById(isbn);
		
	}
	

}
