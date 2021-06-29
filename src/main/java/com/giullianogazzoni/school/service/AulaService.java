package com.giullianogazzoni.school.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giullianogazzoni.school.model.Aula;
import com.giullianogazzoni.school.repository.AulaRepository;

@Service
public class AulaService {
	
	@Autowired
	AulaRepository aulaRepository;
	
	public List<Aula> obterTodos() {
		List<Aula> aulas = new ArrayList<>();
		aulaRepository.findAll().forEach(aula -> aulas.add(aula));
		return aulas;
	}

	public Optional<Aula> obterAulaPorId(Long id) {
		return aulaRepository.findById(id);
	}

	public Aula salvarOuAtualizar(Aula aula) {
		aulaRepository.save(aula);
		return aula;
	}

	public void deletar(Long id) {
		aulaRepository.deleteById(id);
	}

}
