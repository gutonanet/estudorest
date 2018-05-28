package net.codigoninja.radioslive.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.codigoninja.radioslive.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>{
	
	@Query("select g from Genero g where g.dataAtualizacao > ?1")
	List<Genero> findByDataAtualizacao(Date dataAtualizacao);

}
