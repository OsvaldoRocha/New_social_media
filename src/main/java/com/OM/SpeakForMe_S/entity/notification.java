package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "notification")
public class notification {
    @UUID
    @Column(name = "idnotification")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UUID;

    @Column(name = "idtipo")
    private String tipo;

    @Column(name = "conteudo")
    private String conteudo;

    @Enumerated(EnumType.STRING)
    @Column(name = "lida", nullable = false)
    private role.lida lida;

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
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
