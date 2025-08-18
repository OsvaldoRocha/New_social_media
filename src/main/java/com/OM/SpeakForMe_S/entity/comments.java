package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class comments {
    @UUID
    @Column(name = "idcomments")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UUID;

    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "data")
    private LocalDateTime data;

    // Muitos comentários -> 1 Post
    @ManyToOne
    @JoinColumn(name = "posts_idposts", nullable = false)
    private posts post;

    // Muitos comentários -> 1 Usuário
    @ManyToOne
    @JoinColumn(name = "users_idusers", nullable = false)
    private Users user;

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
