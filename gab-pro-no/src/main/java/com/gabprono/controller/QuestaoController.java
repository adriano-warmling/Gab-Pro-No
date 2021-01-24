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

import com.gabprono.model.Questao;
import com.gabprono.repository.QuestaoRepository;

@RestController
@RequestMapping("/questaos")
public class QuestaoController {

	@Autowired
	private QuestaoRepository questaoRepository;
	
	@GetMapping
	public List<Questao> listar() {
		return questaoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Questao adicionar(@RequestBody Questao questao) {
		return questaoRepository.save(questao);
	}
}  