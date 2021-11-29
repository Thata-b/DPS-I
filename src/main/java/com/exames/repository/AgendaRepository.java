package com.exames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exames.model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
