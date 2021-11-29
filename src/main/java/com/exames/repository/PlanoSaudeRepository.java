package com.exames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exames.model.PlanoSaude;

@Repository
public interface PlanoSaudeRepository extends JpaRepository<PlanoSaude, Long> {

}
