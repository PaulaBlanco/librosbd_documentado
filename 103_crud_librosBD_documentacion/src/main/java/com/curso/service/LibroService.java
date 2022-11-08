package com.curso.service;

import java.util.List;
import java.util.Optional;

import com.curso.model.Libro;


public interface LibroService {
	
	public List<Libro> libros();
	public Optional<Libro> buscarLibro(int isbn);
	//public Libro buscarLibro(int isbn);
	public void altaLibro(Libro libro);
	public void actualizarLibro(Libro libro);
	public void eliminar(int isbn);

}
