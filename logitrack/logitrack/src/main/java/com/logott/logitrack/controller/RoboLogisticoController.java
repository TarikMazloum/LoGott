package com.logott.logitrack.controller;

import com.logott.logitrack.model.RoboLogistico;
import com.logott.logitrack.service.RoboLogisticoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/robos")
public class RoboLogisticoController {

    private final RoboLogisticoService service;

    public RoboLogisticoController(RoboLogisticoService service) {
        this.service = service;
    }

    @GetMapping
    public List<RoboLogistico> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoboLogistico> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RoboLogistico criar(@RequestBody RoboLogistico robo) {
        return service.salvar(robo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

