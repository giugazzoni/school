package com.giullianogazzoni.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giullianogazzoni.school.model.Aluno;
import com.giullianogazzoni.school.service.AlunoService;

@RestController
@RequestMapping("/escola/alunos")
public class AlunoController {
	
@Autowired AlunoService alunoService;
	
	@GetMapping("/alunos")
	public List<Aluno> obterTodos() {
		return alunoService.obterTodos();	
	}
	
	@GetMapping("/escola/alunos/{id}")
	private Optional<Aluno> obterAluno(@PathVariable("id") Long id) 
	{
		return alunoService.obterAlunoPorId(id);
	}
	
	@PostMapping("/escola/alunos")
	private Long salvarOuAtualizarAluno(@RequestBody Aluno aluno) {
		alunoService.salvarOuAtualizar(aluno);
		return aluno.getId();
	}
	
	@DeleteMapping("/escola/alunos/{id}")
	private void deletarAluno(@PathVariable("id") Long id) {
		alunoService.deletar(id);
	}

}
