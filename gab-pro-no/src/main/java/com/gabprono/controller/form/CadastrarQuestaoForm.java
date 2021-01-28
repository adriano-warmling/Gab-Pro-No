package com.gabprono.controller.form;

import javax.persistence.Column;

import com.gabprono.model.Questao;

public class CadastrarQuestaoForm {
	
	@Column(nullable=false)
	private String enunciado;
	
	@Column(nullable=false)
	private String opcao1;
	
	@Column(nullable=false)
	private String opcao2;
	
	@Column(nullable=false)
	private String opcao3;
	
	@Column(nullable=false)
	private int opcaoCorreta;
	
	@Column(nullable=false)
	private int peso;

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(String opcao1) {
		this.opcao1 = opcao1;
	}

	public String getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(String opcao2) {
		this.opcao2 = opcao2;
	}

	public String getOpcao3() {
		return opcao3;
	}

	public void setOpcao3(String opcao3) {
		this.opcao3 = opcao3;
	}

	public int getOpcaoCorreta() {
		return opcaoCorreta;
	}

	public void setOpcaoCorreta(int opcaoCorreta) {
		this.opcaoCorreta = opcaoCorreta;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public static Questao of(CadastrarQuestaoForm form) {
		Questao questao = new Questao();
		questao.enunciado = form.getEnunciado();
		questao.opcao1 = form.getOpcao1();
		questao.opcao2 = form.getOpcao2();
		questao.opcao3 = form.getOpcao3();
		questao.opcaoCorreta = form.getOpcaoCorreta();
		questao.peso = form.getPeso();
		return questao;				
	}

}
