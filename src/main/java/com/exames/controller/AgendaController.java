package com.exames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exames.model.Agenda;
import com.exames.model.Exame;
import com.exames.model.Paciente;
import com.exames.model.PlanoSaude;
import com.exames.repository.AgendaRepository;
import com.exames.repository.ExameRepository;
import com.exames.repository.PacienteRepository;
import com.exames.repository.PlanoSaudeRepository;

@Controller
public class AgendaController {

	@Autowired
	private AgendaRepository repository;
	@Autowired
	private ExameRepository exRepository;
	@Autowired
	private PacienteRepository pacRepository;
	@Autowired
	private PlanoSaudeRepository plsRepository;	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("index", null);
		return mv;
	}

	@RequestMapping(value = "/agenda", method = RequestMethod.GET)
	public ModelAndView getAgenda() {
		ModelAndView mv = new ModelAndView("listarAgenda");
		List<Agenda> getAgenda = repository.findAll();
		mv.addObject("listarAgenda", getAgenda);
		return mv;
	}
	@RequestMapping(value = "/pacientes", method = RequestMethod.GET)
	public ModelAndView getPacientes() {
		ModelAndView mv = new ModelAndView("listarPacientes");
		List<Paciente> getPaciente = pacRepository.findAll();
		mv.addObject("listarPaciente", getPaciente);
		return mv;
	}
	
	@RequestMapping(value = "/exames", method = RequestMethod.GET)
	public ModelAndView getExames() {
		ModelAndView mv = new ModelAndView("listarExames");
		List<Exame> getExame = exRepository.findAll();
		mv.addObject("exames", getExame);
		return mv;
	}
	
	
	@RequestMapping(value = "/plSaude", method = RequestMethod.GET)
	public ModelAndView getPlano() {
		ModelAndView mv = new ModelAndView("listarPlanoSaudes");
		List<PlanoSaude> getPlano = plsRepository.findAll();
		mv.addObject("plSaude", getPlano);
		return mv;
	}
	
	
	@RequestMapping(value = "/agenda/{id}", method = RequestMethod.GET)
	public ModelAndView detalhesExame(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("detalhes");
		Agenda detalhes = repository.findById(id).get(); 
		mv.addObject("detalhes", detalhes);
		return mv;
	}
	
	@RequestMapping(value = "/novoAgendamento", method = RequestMethod.POST)
	public String salvarAgendamento(Agenda agenda) {
		repository.save(agenda);
		return "/index";
	}

	@RequestMapping(value = "/agendar", method = RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView mv = new ModelAndView("agendarExame");

		List<Exame> getExame = exRepository.findAll();
		List<Paciente> getPacientes = pacRepository.findAll();

		mv.addObject("exame", getExame);
		mv.addObject("paciente", getPacientes);

		
		
		return mv;
	}

	@RequestMapping(value = "/cadastrarPaciente", method = RequestMethod.GET)
	public ModelAndView cadastrarPaciente() {
		ModelAndView mv = new ModelAndView("cadastrarCliente");
		List<PlanoSaude> getPlano = plsRepository.findAll();
		mv.addObject("plano", getPlano);
		return mv;
	}
	
	@RequestMapping(value = "/cadastrarPaciente", method = RequestMethod.POST)
	public String salvarPaciente(Paciente paciente) {
		pacRepository.save(paciente);
		return "/index";
	}
	

    @RequestMapping(value="/apagar/{id}",method = RequestMethod.POST)
    public String deletar(@PathVariable("id") long id){
        repository.deleteById(id);
        return "index";    
    }


	

}
