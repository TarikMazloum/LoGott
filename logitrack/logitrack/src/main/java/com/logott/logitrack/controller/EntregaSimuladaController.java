package com.logott.logitrack.controller;

import com.logott.logitrack.model.EntregaSimulada;
import com.logott.logitrack.service.EntregaSimuladaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entregas")
public class EntregaSimuladaController {

    private final EntregaSimuladaService service;

    public EntregaSimuladaController(EntregaSimuladaService service) {
        this.service = service;
    }

    @GetMapping
    public List<EntregaSimulada> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntregaSimulada> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public EntregaSimulada criar(@RequestBody EntregaSimulada entrega) {
        return service.salvar(entrega);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
