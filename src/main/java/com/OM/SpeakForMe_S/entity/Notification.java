package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // gera UUID automático
    @Column(name = "idnotification", updatable = false, nullable = false, length = 36)
    private String id;

    @Column(name = "idtipo")
    private String tipo;

    @Column(name = "conteudo")
    private String conteudo;

    @Enumerated(EnumType.STRING)
    @Column(name = "lida", nullable = false)
    private role.lida lida;

    // Muitas notificações -> 1 Usuário
    @ManyToOne
    @JoinColumn(name = "users_idusers", nullable = false)
    private Users user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public role.lida getLida() {
        return lida;
    }

    public void setLida(role.lida lida) {
        this.lida = lida;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
