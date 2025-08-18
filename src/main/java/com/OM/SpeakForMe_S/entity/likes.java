package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
public class likes {

    @UUID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlikes")
    private Long UUID;

    @Column(name = "data")
    private LocalDateTime data;

    // Muitos Likes -> 1 Post
    @ManyToOne
    @JoinColumn(name = "posts_idposts", nullable = false)
    private posts post;

    // Muitos Likes -> 1 Usuário
    @ManyToOne
    @JoinColumn(name = "users_idusers", nullable = false)
    private Users user;

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
