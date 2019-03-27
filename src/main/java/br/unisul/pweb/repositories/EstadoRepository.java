package br.unisul.pweb.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import br.unisul.pweb.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
