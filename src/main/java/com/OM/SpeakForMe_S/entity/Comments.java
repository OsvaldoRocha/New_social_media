package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idcomments", updatable = false, nullable = false, length = 36)
    private String idcomments;


    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "data")
    private LocalDateTime data;

    // Muitos comentários -> 1 Post
    @ManyToOne
    @JoinColumn(name = "posts_idposts", nullable = false)
    private Posts post;

    // Muitos comentários -> 1 Usuário
    @ManyToOne
    @JoinColumn(name = "users_idusers", nullable = false)
    private Users user;

    public String getIdcomments() {
        return idcomments;
    }

    public void setIdcomments(String idcomments) {
        this.idcomments = idcomments;
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
