package com.gabprono.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gabprono.model.Resposta;
import com.gabprono.repository.RespostaRepository;

@Service
public class RespostaService {

	@Autowired
	private RespostaRepository respostaRepository;

	public List<Resposta> getRespostasDosAlunos(Long id) {
		return respostaRepository.findByAlunoId(id);		
	}
	
	@GetMapping
	public List<Resposta> listar() {
		return respostaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Resposta adicionar(@RequestBody Resposta resposta) {

		return respostaRepository.save(resposta);
	}

}
