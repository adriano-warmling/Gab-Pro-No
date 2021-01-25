package com.gabprono.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabprono.model.Aluno;
import com.gabprono.model.Prova;
import com.gabprono.model.Resposta;
import com.gabprono.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private RespostaService respostaService;

	@Autowired
	private AlunoRepository alunoRepository;

	public BigDecimal getMedia(Long id) {

		Map<Prova, List<Resposta>> mapa = new HashMap<>();

		List<Resposta> respostas = respostaService.getRespostasDosAlunos(id);

		for (Resposta resposta : respostas) {

			if (mapa.containsKey(resposta.getProva())) {
				List<Resposta> respostaMapa = mapa.get(resposta.getProva());
				respostaMapa.add(resposta);

				mapa.put(resposta.getProva(), respostaMapa);

				continue;
			}

			List<Resposta> respostaList = new ArrayList<>();
			respostaList.add(resposta);
			mapa.put(resposta.getProva(), respostaList);
		}

		Map<Prova, BigDecimal> notas = new HashMap<>();
		BigDecimal somaTotalNotas = BigDecimal.ZERO;
		for (Entry<Prova, List<Resposta>> prova : mapa.entrySet()) {
			BigDecimal notaDaProva = BigDecimal.ZERO;
			for (Resposta resposta : prova.getValue()) {

				int respostaAluno = resposta.getResposta();
				int respostaCorreta = resposta.getQuestao().opcaoCorreta;
				int peso = resposta.getQuestao().peso;

				BigDecimal valorQuestao = BigDecimal.ZERO;
				if (respostaAluno == respostaCorreta) {
					valorQuestao = BigDecimal.ONE.multiply(BigDecimal.valueOf(peso));
				}
				notaDaProva = notaDaProva.add(valorQuestao);

			}
			notas.put(prova.getKey(), notaDaProva);
			somaTotalNotas = somaTotalNotas.add(notaDaProva);
		}

		return somaTotalNotas.divide(BigDecimal.valueOf(notas.size()));
	}

	public List<Aluno> getAprovados() {

		List<Aluno> alunos = alunoRepository.findAll();

		List<Aluno> alunosAprovados = new ArrayList<>();

		for (Aluno aluno : alunos) {

			BigDecimal media = getMedia(aluno.id);

			if (media.compareTo(BigDecimal.valueOf(7)) >= 0) {
				alunosAprovados.add(aluno);
			}

		}

		return alunosAprovados;

	}

}
