package com.gabprono.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gabprono.model.Questao;
import com.gabprono.repository.QuestaoRepository;

@Service
public class QuestaoService {
	
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
