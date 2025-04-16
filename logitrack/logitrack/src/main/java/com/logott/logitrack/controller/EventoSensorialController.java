package com.logott.logitrack.controller;

import com.logott.logitrack.model.EventoSensorial;
import com.logott.logitrack.service.EventoSensorialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoSensorialController {

    private final EventoSensorialService service;

    public EventoSensorialController(EventoSensorialService service) {
        this.service = service;
    }

    @GetMapping
    public List<EventoSensorial> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoSensorial> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public EventoSensorial criar(@RequestBody EventoSensorial evento) {
        return service.salvar(evento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
