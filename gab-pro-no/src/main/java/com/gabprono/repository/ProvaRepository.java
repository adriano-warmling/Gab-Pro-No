package com.gabprono.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabprono.model.Prova;
 
@Repository
public interface ProvaRepository extends JpaRepository<Prova, Long> {

}
