package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // gera UUID automático
    @Column(name = "idmessages", updatable = false, nullable = false, length = 36)
    private String id;

    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "data")
    private LocalDateTime data;

    // Remetente
    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private Users sender;

    // Destinatário
    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false)
    private Users receiver;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
