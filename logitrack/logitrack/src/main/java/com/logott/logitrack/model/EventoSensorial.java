package com.logott.logitrack.model;

public class EventoSensorial {
    private Long id;
    private String tipo; // colisão, obstáculo, erro de rota
    private LocalDateTime timestamp;
    private Long roboId;
}
