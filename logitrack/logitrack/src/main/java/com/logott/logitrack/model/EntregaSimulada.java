package com.logott.logitrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "entregas_simuladas")
public class EntregaSimulada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origem;
    private String destino;
    private String prioridade; // Alta, Média, Baixa
    private String status;     // Em andamento, Concluída, Pendente

    private Long roboResponsavelId; // ID do robô responsável

    public EntregaSimulada() {}

    public EntregaSimulada(String origem, String destino, String prioridade, String status, Long roboResponsavelId) {
        this.origem = origem;
        this.destino = destino;
        this.prioridade = prioridade;
        this.status = status;
        this.roboResponsavelId = roboResponsavelId;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRoboResponsavelId() {
        return roboResponsavelId;
    }

    public void setRoboResponsavelId(Long roboResponsavelId) {
        this.roboResponsavelId = roboResponsavelId;
    }
}

