/**
 * 
 */
package net.codigoninja.radioslive.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.codigoninja.radioslive.model.Localidade;

/**
 * @author Augusto Lemes
 * @since 27/05/2018
 *
 */
@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long>{
	
	@Query("select l from Localidade l where l.dataAtualizacao >= ?1")
	List<Localidade> findByDataAtualizacao(Date dataAtualizacao);

}
