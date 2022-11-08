package com.curso.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibroService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class LibroControler {
	@Autowired private LibroService service;
	
	@ApiOperation(value="Busca un libro a partir de el ISBN indicado en la url")
	@GetMapping(value="libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Libro> buscarLibro(@ApiParam(value="_ISBN del libro a buscar") @PathVariable("isbn") int isbn) {
		return service.buscarLibro(isbn);
	}
	
	
	@GetMapping(value="libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> libros(){
		return service.libros();
	}
	
	@PostMapping(value = "agregar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void agregar(@RequestBody Libro libro) {
		service.altaLibro(libro);
	}
	
	@PutMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actuLibro(@RequestBody Libro libro) {
		service.actualizarLibro(libro);
	}
	
	@DeleteMapping(value="eliminar/{isbn}")
	public void eliminarLibro(@PathVariable("isbn") int isbn){
		service.eliminar(isbn);
	}
	
	

}

