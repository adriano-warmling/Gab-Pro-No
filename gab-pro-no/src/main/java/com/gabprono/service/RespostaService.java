package com.gabprono.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabprono.model.Resposta;
import com.gabprono.repository.RespostaRepository;

@Service
public class RespostaService {

	@Autowired
	private RespostaRepository respostaRepository;

	public List<Resposta> getRespostasDosAlunos(Long id) {
		return respostaRepository.findByAlunoId(id);		
	}

}
