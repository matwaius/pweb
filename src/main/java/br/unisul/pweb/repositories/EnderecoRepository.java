package br.unisul.pweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
