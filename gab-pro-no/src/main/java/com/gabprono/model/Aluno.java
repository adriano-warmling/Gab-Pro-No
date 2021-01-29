package com.gabprono.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity 
public class Aluno {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(nullable=false)
    public String nome;
	
}