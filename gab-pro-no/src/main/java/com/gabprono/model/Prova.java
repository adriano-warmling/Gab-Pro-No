package com.gabprono.model;

import java.util.List;

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
public class Prova {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(nullable=false)
    public String descricao;
	
//	@Column(nullable=false)
//	public List<Questao> listar() {};

}