package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class messages {
    @UUID
    @Column(name = "idmessages")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UUID;

    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "data")
    private LocalDateTime data;

    // Remetente
    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private users sender;

    // Destinatário
    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false)
    private Users receiver;

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
