package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "posts")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // gera UUID automático
    @Column(name = "idposts", updatable = false, nullable = false, length = 36)
    private String id;

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
    private List<Comments> comments = new ArrayList<>();

    // 1 Post -> N Likes
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Likes> likes = new ArrayList<>();


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
