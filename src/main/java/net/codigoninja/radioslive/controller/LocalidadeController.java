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
import org.springframework.web.bind.annotation.RestController;

import net.codigoninja.radioslive.model.Genero;
import net.codigoninja.radioslive.model.Localidade;
import net.codigoninja.radioslive.repository.GeneroRepository;
import net.codigoninja.radioslive.repository.LocalidadeRepository;

/**
 * 
 * @author Augusto Lemes
 * @since 27/05/2018
 *
 */

@RestController
public class LocalidadeController {
	
	@Autowired
	private LocalidadeRepository localidadeRepository;
	
	  @GetMapping(value = "/localidades/listarPorData/{dataAtualizacao}")
	  public ResponseEntity<List<Localidade>> listarPorData(@PathVariable("dataAtualizacao") String dataAtualizacao) {
		  Date data = null;
		try {
			data = new SimpleDateFormat("yyyy-MM-dd").parse(dataAtualizacao);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		  List<Localidade> lista = localidadeRepository.findByDataAtualizacao(data);
	    return new ResponseEntity<List<Localidade>>(lista, HttpStatus.OK);
	  }

}
