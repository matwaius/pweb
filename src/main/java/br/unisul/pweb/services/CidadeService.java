package br.unisul.pweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.domain.Cidade;
import br.unisul.pweb.repositories.CidadeRepository;

@Service
public class CidadeService {
	@Autowired
	private CidadeRepository rep;
	

	public List<Cidade> findByEstado(Integer estadoId) {
		return rep.findCidades(estadoId);
	}
}