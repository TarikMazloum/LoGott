package com.logott.logitrack.service;

import com.logott.logitrack.model.EntregaSimulada;
import com.logott.logitrack.repository.EntregaSimuladaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregaSimuladaService {

    private final EntregaSimuladaRepository repository;

    public EntregaSimuladaService(EntregaSimuladaRepository repository) {
        this.repository = repository;
    }

    public List<EntregaSimulada> listarTodas() {
        return repository.findAll();
    }

    public Optional<EntregaSimulada> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public EntregaSimulada salvar(EntregaSimulada entrega) {
        return repository.save(entrega);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
