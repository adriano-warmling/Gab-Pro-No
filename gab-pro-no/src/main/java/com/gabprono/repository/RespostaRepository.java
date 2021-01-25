package com.gabprono.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabprono.model.Resposta;
 
@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Long> {

	List<Resposta> findByAlunoId(Long id);

}
