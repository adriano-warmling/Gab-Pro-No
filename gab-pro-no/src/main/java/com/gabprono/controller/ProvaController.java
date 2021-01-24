package com.gabprono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gabprono.model.Prova;
import com.gabprono.repository.ProvaRepository;

@RestController
@RequestMapping("/provas")
public class ProvaController {

	@Autowired
	private ProvaRepository provaRepository;
	
	@GetMapping
	public List<Prova> listar() {
		return provaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Prova adicionar(@RequestBody Prova prova) {
		return provaRepository.save(prova);
	}
}  