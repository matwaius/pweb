package br.unisul.pweb.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import br.unisul.pweb.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
