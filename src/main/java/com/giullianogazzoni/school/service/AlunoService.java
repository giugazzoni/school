package com.giullianogazzoni.school.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giullianogazzoni.school.model.Aluno;
import com.giullianogazzoni.school.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;

	public List<Aluno> obterTodos() {
		List<Aluno> alunos = new ArrayList<>();
		alunoRepository.findAll().forEach(aluno -> alunos.add(aluno));
		return alunos;
	}

	public Optional<Aluno> obterAlunoPorId(Long id) {
		return alunoRepository.findById(id);
	}

	public Aluno salvarOuAtualizar(Aluno aluno) {
		alunoRepository.save(aluno);
		return aluno;
	}

	public void deletar(Long id) {
		alunoRepository.deleteById(id);
	}

}
