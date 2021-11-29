package com.exames.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String rg;

	private String cpf;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private String dataDeNasc;
	
	@ManyToOne	
	private PlanoSaude plSaude;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public String getDataDeNasc() {
		return dataDeNasc;
	}

	public void setDataDeNasc(String dataDeNasc) {
		this.dataDeNasc = dataDeNasc;
	}

	public PlanoSaude getPlSaude() {
		return plSaude;
	}

	public void setPlSaude(PlanoSaude plSaude) {
		this.plSaude = plSaude;
	}


	public Paciente(Long id, String nome, String rg, String cpf, String dataDeNasc, PlanoSaude plSaude) {
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataDeNasc = dataDeNasc;
		this.plSaude = plSaude;
	}

	public Paciente() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
	
}
