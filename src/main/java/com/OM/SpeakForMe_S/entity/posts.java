package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "posts")
public class posts {

    @UUID
    @Column(name = "idusers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UUID;

    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "midia")
    private String midia;

    @Column(name = "data")
    private LocalDateTime data;

    // Muitos posts -> 1 usuário
    @ManyToOne
    @JoinColumn(name = "users_idusers", nullable = false)
    private Users user;

    // 1 Post -> N Comentários
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<comments> comments = new ArrayList<>();

    // 1 Post -> N Likes
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<likes> likes = new ArrayList<>();


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

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
