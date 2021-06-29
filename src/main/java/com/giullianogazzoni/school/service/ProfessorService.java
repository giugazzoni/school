package com.giullianogazzoni.school.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giullianogazzoni.school.model.Professor;
import com.giullianogazzoni.school.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	ProfessorRepository professorRepository;
	
	public List<Professor> obterTodos() {
		List<Professor> professores = new ArrayList<>();
		professorRepository.findAll().forEach(professor -> professores.add(professor));
		return professores;
	}
	
	public Optional<Professor> obterProfessorPorId(Long id) {
		return professorRepository.findById(id);
	}
	
	public Professor salvarOuAtualizar(Professor professor) {
		professorRepository.save(professor);
		return professor;
	}
	
	public void deletar(Long id) {
		professorRepository.deleteById(id);
	}
	
}
