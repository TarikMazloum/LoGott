package com.logott.logitrack.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "eventos_sensoriais")
public class EventoSensorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // colisão, obstáculo, erro de rota

    private LocalDateTime timestamp;

    private Long roboId;

    public EventoSensorial() {}

    public EventoSensorial(String tipo, LocalDateTime timestamp, Long roboId) {
        this.tipo = tipo;
        this.timestamp = timestamp;
        this.roboId = roboId;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Long getRoboId() {
        return roboId;
    }

    public void setRoboId(Long roboId) {
        this.roboId = roboId;
    }
}
