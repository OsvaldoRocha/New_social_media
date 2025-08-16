package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "users")

public class users {
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
