/**
 * 
 */
package net.codigoninja.radioslive.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	  @GetMapping(value = "/generos/listarPorData/{dataAtualizacao}")
	  public ResponseEntity<List<Genero>> listarPorData(@PathVariable("dataAtualizacao") String dataAtualizacao) {
		  Date data = null;
		try {
			data = new SimpleDateFormat("yyyy-MM-dd").parse(dataAtualizacao);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		  List<Genero> lista = generoRepository.findByDataAtualizacao(data);
	    return new ResponseEntity<List<Genero>>(lista, HttpStatus.OK);
	  }

}
