package com.exames;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exames.model.Agenda;
import com.exames.model.Exame;
import com.exames.model.Paciente;
import com.exames.model.PlanoSaude;
import com.exames.repository.AgendaRepository;
import com.exames.repository.ExameRepository;
import com.exames.repository.PacienteRepository;
import com.exames.repository.PlanoSaudeRepository;
import com.fasterxml.jackson.annotation.JsonFormat;

@SpringBootApplication
public class ExamesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExamesApplication.class, args);
	}

	@Autowired
	private PlanoSaudeRepository plsRepository;
	@Autowired
	private ExameRepository exRepository;
	@Autowired
	private PacienteRepository pacRepository;
	@Autowired
	private AgendaRepository agRepository;

	@Override
	public void run(String... args) throws Exception {

//		PlanoSaude ps1 = new PlanoSaude(null, "Ana Costa");
//		PlanoSaude ps2 = new PlanoSaude(null, "Santa Casa");
//		PlanoSaude ps3 = new PlanoSaude(null, "Unimed");
//		PlanoSaude ps4 = new PlanoSaude(null, "Trasmontano");
//		PlanoSaude ps5 = new PlanoSaude(null, "Blue Med");
//		plsRepository.saveAll(Arrays.asList(ps1, ps2, ps3, ps3, ps4, ps5));
//
//		Exame ex1 = new Exame(null, "Hemograma", "Exame feito via injetavel", "12 horas de jejum");
//		Exame ex2 = new Exame(null, "Urina", "Usar frasco para coleta", "Não há necessidade de jejum");
//		Exame ex3 = new Exame(null, "Escarro", "Usar frasco para coleta", "Faça ao acordar de preferencia");
//		Exame ex4 = new Exame(null, "Tiroide", "Exame feito via injetavel", "12 horas de jejum");
//		Exame ex5 = new Exame(null, "BCG", "Exame para identificar gravidez", "Não há necesidade de jejum");
//		exRepository.saveAll(Arrays.asList(ex1, ex2, ex3, ex4, ex5));
//
//		Paciente pac1 = new Paciente(null, "Maria da Silva", "22.728.454-9", "893.199.950-01", "10/07/1978", ps1);
//		Paciente pac2 = new Paciente(null, "Jose de Souza", "19.805.258-3", "842.169.630-05", "30/08/1985", ps2);
//		Paciente pac3 = new Paciente(null, "Juliano Mesquita Junior", "115.980.296-9", "924.567.820-20", "14/02/1995",ps3);
//		Paciente pac4 = new Paciente(null, "Pedro Liberato Cardoso", "44.966.252-4", "136.497.680-38", "14/02/1995",				ps4);
//		Paciente pac5 = new Paciente(null, "Alice Almeida", "42.822.097-6", "028.091.420-25", "14/02/1989", ps5);
//		pacRepository.saveAll(Arrays.asList(pac1, pac2, pac3, pac4, pac5));
//
//		Agenda ag1 = new Agenda(null, pac1, ex1, "10/02/2021", "07:30");
//		Agenda ag2 = new Agenda(null, pac2, ex2, "11/02/2021", "07:30");
//		Agenda ag3 = new Agenda(null, pac3, ex3, "12/02/2021", "07:30");
//		Agenda ag4 = new Agenda(null, pac4, ex4, "13/02/2021", "07:30");
//		Agenda ag5 = new Agenda(null, pac5, ex5, "14/02/2021", "07:30");
//		agRepository.saveAll(Arrays.asList(ag1, ag2, ag3, ag4, ag5));

//		924.567.820-20
//		136.497.680-38
//		028.091.420-25
//		882.201.910-58
//		793.613.880-37
//		274.775.990-32
//		361.413.510-18
//		687.209.610-14
//
//		15.980.296-9
//		44.966.252-4
//		47.533.795-5
//		42.822.097-6
//		12.849.571-6
//		46.714.207-5
//		38.542.527-2
//		11.794.098-7

	}

}
