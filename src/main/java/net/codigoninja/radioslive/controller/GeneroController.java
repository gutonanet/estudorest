/**
 * 
 */
package net.codigoninja.radioslive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.codigoninja.radioslive.model.Genero;
import net.codigoninja.radioslive.repository.GeneroRepository;

/**
 * @author Augusto Lemes
 * @since 20/05/2018
 *
 */
@RestController
public class GeneroController {
	
	@Autowired
	private GeneroRepository generoRepository;
	
	  @RequestMapping(value = "/generos", method = RequestMethod.GET)
	  public ResponseEntity<List<Genero>> listar() {
		  List<Genero> lista = generoRepository.findAll();
	    return new ResponseEntity<List<Genero>>(lista, HttpStatus.OK);
	  }

}
