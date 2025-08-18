package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "friend_requests")
public class friend_requests {
    @UUID
    @Column(name = "idfriend_requests")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UUID;

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

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
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
