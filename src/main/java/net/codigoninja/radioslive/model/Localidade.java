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
 * @since 21/03/2018
 *
 */
@Entity
@Table(name = "localidades")
public class Localidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String cidade;
	
	private String uf;
	
	private String pais;

	@Temporal(value=TemporalType.DATE)
	private Date dataAtualizacao;

	public Localidade() {
		super();
	}
	
	public Localidade(Long id, String cidade, String uf, String pais, Date dataAtualizacao) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	

}
