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

import com.gabprono.controller.form.CadastrarProvaForm;
import com.gabprono.model.Prova;
import com.gabprono.service.ProvaService;

@RestController
@RequestMapping("/provas")
public class ProvaController {

	
	@Autowired
	private ProvaService provaService;
	

	@GetMapping
	public List<Prova> listar() {
		return provaService.listar();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Prova adicionar(@RequestBody CadastrarProvaForm form) {		
	
		return provaService.adicionar(form);
	}
}  