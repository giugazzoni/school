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

import com.giullianogazzoni.school.model.Professor;
import com.giullianogazzoni.school.service.ProfessorService;

@RestController
@RequestMapping("/escola/professores")
public class ProfessorController {
	
	@Autowired ProfessorService professorService;
	
	@GetMapping("/professores")
	public List<Professor> obterTodos() {
		return professorService.obterTodos();	
	}
	
	@GetMapping("/escola/professores/{id}")
	private Optional<Professor> obterProfessor(@PathVariable("id") Long id) 
	{
		return professorService.obterProfessorPorId(id);
	}
	
	@PostMapping("/escola/professores")
	private Long salvarOuAtualizarProfessor(@RequestBody Professor professor) {
		professorService.salvarOuAtualizar(professor);
		return professor.getId();
	}
	
	@DeleteMapping("/escola/professores/{id}")
	private void deletarProfessor(@PathVariable("id") Long id) {
		professorService.deletar(id);
	}
	

}
