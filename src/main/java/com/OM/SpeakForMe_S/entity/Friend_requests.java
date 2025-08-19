package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "friend_requests")
public class Friend_requests {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // gera UUID automático
    @Column(name = "idfriend_requests", updatable = false, nullable = false, length = 36)
    private String id;

    @Column(name = "data_criacao")
    private LocalDateTime data_criacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private role.status status;

    @ManyToOne
    @JoinColumn(name = "users_idusers", nullable = false)
    private Users sender;

    // Destinatário
    @ManyToOne
    @JoinColumn(name = "users_idusers1", nullable = false)
    private Users receiver;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }

    public role.status getStatus() {
        return status;
    }

    public void setStatus(role.status status) {
        this.status = status;
    }
}
