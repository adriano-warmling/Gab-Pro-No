package com.gabprono.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabprono.model.Questao;
 
@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long> {

}
