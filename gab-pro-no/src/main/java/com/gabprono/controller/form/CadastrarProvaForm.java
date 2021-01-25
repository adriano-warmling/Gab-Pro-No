package com.gabprono.controller.form;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.gabprono.controller.QuestaoController;
import com.gabprono.model.Prova;
import com.gabprono.model.Questao;

public class CadastrarProvaForm {

	@Column(nullable = false)
	private String descricao;

	private List<CadastrarQuestaoForm> questoes;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<CadastrarQuestaoForm> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<CadastrarQuestaoForm> questoes) {
		this.questoes = questoes;
	}
	
	public static Prova of(CadastrarProvaForm form, List<Questao> questoes) {
		Prova prova = new Prova();
		prova.descricao = form.getDescricao();
		prova.questoes = questoes;
		return prova;
	}
	

}
