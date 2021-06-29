package com.giullianogazzoni.school.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giullianogazzoni.school.model.Responsavel;
import com.giullianogazzoni.school.repository.ResponsavelRepository;

@Service
public class ResponsavelService {
	
	@Autowired
	ResponsavelRepository responsavelRepository;
	
	public List<Responsavel> obterTodos() {
		List<Responsavel> responsavels = new ArrayList<>();
		responsavelRepository.findAll().forEach(responsavel -> responsavels.add(responsavel));
		return responsavels;
	}

	public Optional<Responsavel> obterResponsavelPorId(Long id) {
		return responsavelRepository.findById(id);
	}

	public Responsavel salvarOuAtualizar(Responsavel responsavel) {
		responsavelRepository.save(responsavel);
		return responsavel;
	}

	public void deletar(Long id) {
		responsavelRepository.deleteById(id);
	}

}
