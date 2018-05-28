/**
 * 
 */
package net.codigoninja.radioslive.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Augusto Lemes
 * @since 20/05/2018
 * 
 *
 */
@Entity
@Table(name = "generos")
public class Genero implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	
	private String nome;

	@Temporal(value=TemporalType.DATE)
	private Date dataAtualizacao;
	
	public Genero() {
		super();
	}
	
	public Genero(Long id, String nome, Date dataAtualizacao) {
		this.id = id;
		this.nome = nome;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	

}
