package com.gabprono.model;

//import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
    public int opcaoCorreta;
	
	@Column(nullable=false)	
    public int peso;
}
