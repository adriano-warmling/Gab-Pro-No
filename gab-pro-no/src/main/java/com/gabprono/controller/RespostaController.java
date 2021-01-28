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

import com.gabprono.model.Resposta;
import com.gabprono.service.RespostaService;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

	@Autowired
	private RespostaService respostaService;
	
	@GetMapping
	public List<Resposta> listar() {
		return respostaService.listar();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Resposta adicionar(@RequestBody Resposta resposta) {

		return respostaService.adicionar(resposta);
	}
}  