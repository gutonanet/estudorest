/**
 * 
 */
package net.codigoninja.radioslive.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


import javax.persistence.*;

/**
 * @author Augusto Lemes
 * @since 22/05/2018
 *
 */
@Entity
@Table(name = "radios")
public class Radio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	private String nome;
	
	private String url;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dataAtualizacao;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_localidade")
	private Localidade localidade;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "radios_generos", joinColumns = @JoinColumn(name = "id_radios"),
    		inverseJoinColumns = @JoinColumn(name = "id_generos"))
   	private Set<Genero> generos;
	
	@Lob
	private byte[] logo;

	
	
	public Radio(Long id, String nome, String url, Date dataAtualizacao, Localidade localidade, Set<Genero> generos, byte[] logo) {
		super();
		this.id = id;
		this.nome = nome;
		this.url = url;
		this.dataAtualizacao = dataAtualizacao;
		this.localidade = localidade;
		this.generos = generos;
		this.logo = logo;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public Set<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(Set<Genero> generos) {
		this.generos = generos;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
	
	
	

}
