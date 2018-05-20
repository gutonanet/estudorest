package net.codigoninja.radioslive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codigoninja.radioslive.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>{

}
