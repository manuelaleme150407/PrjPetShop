package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Agendamento;
import com.example.demo.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
	
private final AgendamentoRepository agendamentoRepository;
	
	@Autowired
	public AgendamentoService(AgendamentoRepository agendamentoRepository) {
		this.agendamentoRepository = agendamentoRepository;
	}
	
	public Agendamento salvarAgendamento(Agendamento agendamento) {
		return agendamentoRepository.save(agendamento);
	}
	
	public Agendamento buscarAgendamentoPorId(Long Id) {
		return agendamentoRepository.findById(Id).orElse(null);
	}
	
	public List<Agendamento> buscarTodosAgendamento(){
		return agendamentoRepository.findAll();
	}

	
	
}
