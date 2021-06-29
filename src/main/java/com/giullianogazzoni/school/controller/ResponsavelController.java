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

import com.giullianogazzoni.school.model.Responsavel;
import com.giullianogazzoni.school.service.ResponsavelService;

@RestController
@RequestMapping("/escola/responsaveis")
public class ResponsavelController {
	
@Autowired ResponsavelService responsavelService;
	
	@GetMapping("/responsaveis")
	public List<Responsavel> obterTodos() {
		return responsavelService.obterTodos();	
	}
	
	@GetMapping("/escola/responsaveis/{id}")
	private Optional<Responsavel> obterResponsavel(@PathVariable("id") Long id) 
	{
		return responsavelService.obterResponsavelPorId(id);
	}
	
	@PostMapping("/escola/responsaveis")
	private Long salvarOuAtualizarResponsavel(@RequestBody Responsavel responsavel) {
		responsavelService.salvarOuAtualizar(responsavel);
		return responsavel.getId();
	}
	
	@DeleteMapping("/escola/responsaveis/{id}")
	private void deletarResponsavel(@PathVariable("id") Long id) {
		responsavelService.deletar(id);
	}

}
