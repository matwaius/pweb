package br.unisul.pweb.repositories;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.unisul.pweb.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByEstado();
	List<Estado> findDistinctByEstadoContainingOrderByEstado(String nome);
}