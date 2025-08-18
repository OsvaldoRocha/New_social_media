package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UUID;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")

public class Users {
    @UUID
    @Column(name = "idusers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UUID;

    @Column(name = "name")
    @NotBlank(message = "nome obrigatório")
    private String name;

    @Column(name = "email", unique = true)
    @NotBlank(message = "Email obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @Column(name = "password")
    @NotBlank(message = "Senha Obrigatória")
    private String password;

    @Column(name = "photo")
    private String photo;

    @Column(name = "biograph")
    private String biograph;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private role.Role role;

    // 1 Usuário -> N Posts
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<posts> posts = new ArrayList<>();

    // 1 Usuário -> N Comentários
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<comments> comments = new ArrayList<>();

    // 1 Usuário -> N Likes
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<likes> likes = new ArrayList<>();

    // Mensagens enviadas
    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<messages> sentMessages = new ArrayList<>();

    // Mensagens recebidas
    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<messages> receivedMessages = new ArrayList<>();


    // 1 Usuário -> N Notificações
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<notification> notifications = new ArrayList<>();

    // Relações de amizade (solicitações enviadas e recebidas)
    @OneToMany(mappedBy = "sender")
    private List<friend_requests> friendRequestsSent = new ArrayList<>();

    @OneToMany(mappedBy = "receiver")
    private List<friend_requests> friendRequestsReceived = new ArrayList<>();

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public role.Role getRole() {
        return role;
    }

    public void setRole(role.Role role) {
        this.role = role;
    }

    public String getBiograph() {
        return biograph;
    }

    public void setBiograph(String biograph) {
        this.biograph = biograph;
    }
}
