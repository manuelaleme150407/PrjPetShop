package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  // Add this import

import com.example.demo.entities.Servico;
import com.example.demo.repositories.ServicoRepository;

@Service  // Add this annotation to mark the class as a Spring service
public class ServicoService {

    private final ServicoRepository servicoRepository;
    
    @Autowired
    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }
    
    public Servico salvarServico(Servico servico) {
        return servicoRepository.save(servico);
    }
    
    public Servico buscarServicoPorId(Long id) {
        return servicoRepository.findById(id).orElse(null);
    }
    
    public List<Servico> buscarTodosServico(){
        return servicoRepository.findAll();
    }
    
    
}
