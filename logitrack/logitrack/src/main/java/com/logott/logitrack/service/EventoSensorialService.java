package com.logott.logitrack.service;

import com.logott.logitrack.model.EventoSensorial;
import com.logott.logitrack.repository.EventoSensorialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoSensorialService {

    private final EventoSensorialRepository repository;

    public EventoSensorialService(EventoSensorialRepository repository) {
        this.repository = repository;
    }

    public List<EventoSensorial> listarTodos() {
        return repository.findAll();
    }

    public Optional<EventoSensorial> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public EventoSensorial salvar(EventoSensorial evento) {
        return repository.save(evento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
