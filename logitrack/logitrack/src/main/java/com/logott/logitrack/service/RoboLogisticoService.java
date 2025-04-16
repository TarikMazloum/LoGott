package com.logott.logitrack.service;

import com.logott.logitrack.model.RoboLogistico;
import com.logott.logitrack.repository.RoboLogisticoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoboLogisticoService {

    private final RoboLogisticoRepository repository;

    public RoboLogisticoService(RoboLogisticoRepository repository) {
        this.repository = repository;
    }

    public List<RoboLogistico> listarTodos() {
        return repository.findAll();
    }

    public Optional<RoboLogistico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public RoboLogistico salvar(RoboLogistico robo) {
        return repository.save(robo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
