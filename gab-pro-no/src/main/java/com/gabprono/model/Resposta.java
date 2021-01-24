package com.gabprono.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity 
public class Resposta {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long id;

	@OneToOne
	public Questao questao;

}
