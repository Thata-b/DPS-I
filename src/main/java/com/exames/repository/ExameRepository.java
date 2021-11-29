package com.exames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exames.model.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

}
