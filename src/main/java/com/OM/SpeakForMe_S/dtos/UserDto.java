package com.OM.SpeakForMe_S.dtos;

import com.OM.SpeakForMe_S.entity.role;
import com.OM.SpeakForMe_S.entity.users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class UserDto {
    private Long idusers;

    @NotBlank(message = "Nome do usuário obrigatório")
    private String name;

    @Email(message = "Email obrigatório")
    private String email;

    @NotBlank(message = "Senha do usuário obrigatório")
    @Size(min = 4, message = "Tem que ter no mínimo 4 caractéres")
    private String password;

    private String photo;

    private String biograph;

    private role.Role role;


    public UserDto() {}


    public UserDto(users user) {
        this.idusers = user.getUUID();
        this.name = user.getName();
        this.email = user.getEmail();
        this.photo = user.getPhoto();
        this.biograph = user.getBiograph();
        this.role = user.getRole();
    }

}
