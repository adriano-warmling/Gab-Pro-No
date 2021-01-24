package com.gabprono.model;

//import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity 
public class Questao {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(nullable=false)
    public String enunciado;
	
	@Column(nullable=false)
    public String opcao1;
	
	@Column(nullable=false)
    public String opcao2;
	
	@Column(nullable=false)
    public String opcao3;
	
	@Column(nullable=false)
    public String opcao4;
	
	@Column(nullable=false)
    public int peso;
	
	//FK da Prova

}

//@Data
//@Entity //mapeia automaticamente as colunas da tabela
//public class Aluno {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	public UUID id;
//	
//	@Column(nullable = false)
//	public String nome;
//	
//}


//	public Aluno(@JsonPropertyp("id") UUID id
//			(@JsonProperty("nome") String nome {
//				this.id = id;
//				this.nome = nome;
//			}
//
//			public UUID getID() {
//				return ID;
//			}
//
//			public nome getNome() {
//				return nome;
//			}
//}