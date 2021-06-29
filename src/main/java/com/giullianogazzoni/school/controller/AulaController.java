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

import com.giullianogazzoni.school.model.Aula;
import com.giullianogazzoni.school.service.AulaService;

@RestController
@RequestMapping("/escola/aulas")
public class AulaController {
	
@Autowired AulaService aulaService;
	
	@GetMapping("/aulas")
	public List<Aula> obterTodos() {
		return aulaService.obterTodos();	
	}
	
	@GetMapping("/escola/aulas/{id}")
	private Optional<Aula> obterAula(@PathVariable("id") Long id) 
	{
		return aulaService.obterAulaPorId(id);
	}
	
	@PostMapping("/escola/aulas")
	private Long salvarOuAtualizarAula(@RequestBody Aula aula) {
		aulaService.salvarOuAtualizar(aula);
		return aula.getId();
	}
	
	@DeleteMapping("/escola/aulas/{id}")
	private void deletarAula(@PathVariable("id") Long id) {
		aulaService.deletar(id);
	}

}
