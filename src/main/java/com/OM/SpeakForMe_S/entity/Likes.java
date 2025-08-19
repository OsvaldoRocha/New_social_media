package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // gera UUID automático
    @Column(name = "idlikes", updatable = false, nullable = false, length = 36)
    private String id;

    @Column(name = "data")
    private LocalDateTime data;

    // Muitos Likes -> 1 Post
    @ManyToOne
    @JoinColumn(name = "posts_idposts", nullable = false)
    private Posts post;

    // Muitos Likes -> 1 Usuário
    @ManyToOne
    @JoinColumn(name = "users_idusers", nullable = false)
    private Users user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
