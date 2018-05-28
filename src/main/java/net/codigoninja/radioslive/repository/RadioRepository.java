/**
 * 
 */
package net.codigoninja.radioslive.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.codigoninja.radioslive.model.Radio;

/**
 * @author Augusto Lemes
 * @since 27/05/2018
 *
 */
@Repository
public interface RadioRepository extends JpaRepository<Radio, Long>{
	
	@Query("select r from Radio r where r.dataAtualizacao >= ?1")
	List<Radio> findByDataAtualizacao(Date dataAtualizacao);

}
