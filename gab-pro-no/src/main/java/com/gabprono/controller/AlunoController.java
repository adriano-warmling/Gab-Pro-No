package com.gabprono.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gabprono.model.Aluno;
import com.gabprono.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> listar() {
		return alunoService.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Aluno adicionar(@RequestBody Aluno aluno) {
		return alunoService.adicionar(aluno);
	}
	
	@GetMapping("/{id}/media")
	public BigDecimal getMedia(@PathVariable Long id) {		
		return alunoService.getMedia(id);
	}
	
	@GetMapping("/aprovados")
	public List<Aluno> getAprovados() {		
		return alunoService.getAprovados();
	}
}  