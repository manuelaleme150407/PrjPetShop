package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Servico;
import com.example.demo.services.ServicoService;

@RestController
@RequestMapping("/Servico")
public class ServicoController {
private final ServicoService servicoService;
	
	@Autowired
	public ServicoController (ServicoService servicoService) {
		this.servicoService = servicoService;
	}
	
	@PostMapping("/criar")
	public Servico criarServico(@RequestBody Servico servico) {
		return servicoService.salvarServico(servico);
	}
	
	@GetMapping
	public List<Servico> buscarTodos(){
		return servicoService.buscarTodosServico();
	}
	
	@GetMapping("/{id}")
	public Servico buscarPorId(@PathVariable Long id) {
		return servicoService.buscarServicoPorId(id);
	}
	
	

}
